package de.openknowledge.ausbildung.mbi.starwars.domain.services;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import de.openknowledge.ausbildung.mbi.starwars.application.values.PeopleValue;
import de.openknowledge.ausbildung.mbi.starwars.application.values.VehicleValue;
import de.openknowledge.ausbildung.mbi.starwars.domain.entities.People;
import de.openknowledge.ausbildung.mbi.starwars.domain.entities.Vehicle;
import de.openknowledge.ausbildung.mbi.starwars.domain.exceptions.NotFoundException;
import de.openknowledge.ausbildung.mbi.starwars.infrastructure.PeopleRepository;
import de.openknowledge.ausbildung.mbi.starwars.infrastructure.VehicleRepository;

@Service
public class VehicleService {

  @Inject
  private VehicleRepository vehicleRepository;

  @Inject
  private PeopleService peopleService;

  public Vehicle findVehicleById(int id){
    try{
      Optional<Vehicle> vehicleOptional = this.vehicleRepository.findById(id);
      return vehicleOptional.get();
    } catch (NoSuchElementException e){
      return null;
    }
  }

  public List<VehicleValue> findAllVehicle() {
    List<VehicleValue> values = new ArrayList<>();
    this.vehicleRepository.findAll().forEach(vehicle -> values.add(VehicleValue.of(vehicle)));
    return values;
  }

  public int createVehicle(VehicleValue vehicleValue, int id) {
    List<People> pilots = new ArrayList<>();
    for(Object pilotId: vehicleValue.getPilots()){
        pilots.add(this.peopleService.findCharacterById((int) pilotId));
    }
    Vehicle vehicle = new Vehicle(vehicleValue, pilots, id);
    this.vehicleRepository.save(vehicle);

    return id;
  }
}
