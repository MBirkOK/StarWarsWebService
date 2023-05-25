package de.openknowledge.ausbildung.mbi.starwars.application.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import de.openknowledge.ausbildung.mbi.starwars.application.values.VehicleValue;
import de.openknowledge.ausbildung.mbi.starwars.domain.entities.Vehicle;
import de.openknowledge.ausbildung.mbi.starwars.domain.exceptions.NotFoundException;
import de.openknowledge.ausbildung.mbi.starwars.domain.services.VehicleService;

@RestController
@RequestMapping(path = "/vehicle")
public class VehicleController {

  @Inject
  private VehicleService vehicleService;

  static class VehicleHolder{
    private int pk;
    private String model;
    private VehicleValue fields;

    public VehicleHolder(int pk, String model, VehicleValue fields) {
      this.pk = pk;
      this.model = model;
      this.fields = fields;
    }

    public int getPk() {
      return pk;
    }

    public String getModel() {
      return model;
    }

    public VehicleValue getFields() {
      return fields;
    }
  }

  @GetMapping(path = "/{id}")
  private VehicleValue getVehiclebyId(@PathVariable int id) throws NotFoundException {
    Vehicle vehicle = this.vehicleService.findVehicleById(id);
    return VehicleValue.of(vehicle);
  }

  @PostMapping(path = "/create")
  public int createVehicle(@RequestBody VehicleHolder vehicleHolder) throws NotFoundException {
    return this.vehicleService.createVehicle(vehicleHolder.getFields(), vehicleHolder.getPk());
  }

  @PostMapping(path = "/masscreate")
  public void massCreate(@RequestBody List<VehicleHolder> vehicleHolderList) throws NotFoundException {
    for(VehicleHolder vehicleHolder: vehicleHolderList){
      this.createVehicle(vehicleHolder);
    }
  }
}
