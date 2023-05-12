package de.openknowledge.ausbildung.mbi.starwars.infrastructure;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import de.openknowledge.ausbildung.mbi.starwars.domain.entities.People;

@Repository
public interface PeopleRepository extends CrudRepository<People, UUID> {
}
