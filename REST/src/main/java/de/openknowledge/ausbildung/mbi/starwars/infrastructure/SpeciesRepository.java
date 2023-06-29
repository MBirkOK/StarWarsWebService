package de.openknowledge.ausbildung.mbi.starwars.infrastructure;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import de.openknowledge.ausbildung.mbi.starwars.domain.entities.Species;

@Repository
public interface SpeciesRepository extends CrudRepository<Species, Integer> {

}
