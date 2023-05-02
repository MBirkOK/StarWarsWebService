package de.openknowlede.ausbildung.mbi.starwars.infrastructure;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

import de.openknowlede.ausbildung.mbi.starwars.domain.entities.People;

@Repository
public interface PeopleRepository extends CrudRepository<People, UUID> {
}
