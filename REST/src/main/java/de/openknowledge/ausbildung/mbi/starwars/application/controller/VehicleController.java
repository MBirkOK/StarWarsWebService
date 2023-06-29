package de.openknowledge.ausbildung.mbi.starwars.application.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import de.openknowledge.ausbildung.mbi.starwars.application.dto.VehicleDto;
import de.openknowledge.ausbildung.mbi.starwars.application.values.VehicleValue;
import de.openknowledge.ausbildung.mbi.starwars.domain.entities.Vehicle;
import de.openknowledge.ausbildung.mbi.starwars.domain.exceptions.NotFoundException;
import de.openknowledge.ausbildung.mbi.starwars.domain.services.VehicleService;

@RestController
@RequestMapping(path = "/vehicle")
@CrossOrigin(origins = "http://localhost:3000")
public class VehicleController {

  @Inject
  private VehicleService vehicleService;

  @GetMapping(path = "/{id}")
  private VehicleValue getVehiclebyId(@PathVariable int id){
    Vehicle vehicle = this.vehicleService.findVehicleById(id);
    return VehicleValue.of(vehicle);
  }

  @GetMapping()
  public List<VehicleValue> findAllPeople() {
    return this.vehicleService.findAllVehicle();
  }

  @PostMapping(path = "/create")
  public int createVehicle(@RequestBody VehicleDto vehicleDto){
    return this.vehicleService.createVehicle(vehicleDto.getFields(), vehicleDto.getPk());
  }

  @PostMapping(path = "/masscreate")
  public void massCreate(@RequestBody List<VehicleDto> vehicleDtoList){
    for(VehicleDto vehicleDto : vehicleDtoList){
      this.createVehicle(vehicleDto);
    }
  }
}
