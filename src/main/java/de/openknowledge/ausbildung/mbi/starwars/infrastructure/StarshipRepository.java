package de.openknowledge.ausbildung.mbi.starwars.infrastructure;

import org.springframework.data.repository.CrudRepository;

import de.openknowledge.ausbildung.mbi.starwars.domain.entities.Starship;

public interface StarshipRepository extends CrudRepository<Starship, Integer> {
}
