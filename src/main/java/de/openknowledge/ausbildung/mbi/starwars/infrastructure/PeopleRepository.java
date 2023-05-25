package de.openknowledge.ausbildung.mbi.starwars.infrastructure;

import java.util.List;
import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import de.openknowledge.ausbildung.mbi.starwars.domain.entities.People;

@Repository
public interface PeopleRepository extends CrudRepository<People, Integer> {

  List<People> findAllByIdIn(List<Integer> pilotsIds);
}
