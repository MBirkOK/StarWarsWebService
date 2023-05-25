package de.openknowledge.ausbildung.mbi.starwars.domain.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

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

  public Vehicle findVehicleById(int id) throws NotFoundException {
    Optional<Vehicle> vehicleOptional = this.vehicleRepository.findById(id);
    if(vehicleOptional.isPresent()){
      return vehicleOptional.get();
    }
    throw new NotFoundException("Vehicle not found");
  }

  public int createVehicle(VehicleValue vehicleValue, int id) throws NotFoundException {
    List<People> pilots = new ArrayList<>();
    for(Object pilotId: vehicleValue.getPilots()){
        pilots.add(this.peopleService.findCharacterById((int) pilotId));
    }
    Vehicle vehicle = new Vehicle(vehicleValue, pilots, id);
    this.vehicleRepository.save(vehicle);

    return id;
  }
}
