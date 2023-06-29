package de.openknowledge.ausbildung.mbi.starwars.infrastructure;

import org.springframework.data.repository.CrudRepository;

import de.openknowledge.ausbildung.mbi.starwars.domain.entities.Vehicle;

public interface VehicleRepository extends CrudRepository<Vehicle, Integer> {
}
