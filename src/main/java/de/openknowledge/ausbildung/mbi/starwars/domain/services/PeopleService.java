package de.openknowledge.ausbildung.mbi.starwars.domain.services;

import java.util.Optional;
import java.util.UUID;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataAccessResourceFailureException;
import org.springframework.stereotype.Service;

import de.openknowledge.ausbildung.mbi.starwars.application.values.PeopleValue;
import de.openknowledge.ausbildung.mbi.starwars.domain.entities.People;
import de.openknowledge.ausbildung.mbi.starwars.domain.exceptions.PeopleNotFoundException;
import de.openknowledge.ausbildung.mbi.starwars.infrastructure.PeopleRepository;

@Service
public class PeopleService {

  private Logger Log = LoggerFactory.getLogger(PeopleService.class);

  @Inject
  private PeopleRepository peopleRepository;

  public PeopleValue findCharacterById(String id) throws PeopleNotFoundException {
    Optional<People> peopleOptional = this.peopleRepository.findById(UUID.fromString(id));
    if (peopleOptional.isEmpty()) {
      throw new PeopleNotFoundException("Character not found");
    }
    return People.of(peopleOptional.get());
  }

  public UUID createCharacter(PeopleValue peopleValue) {
    People people = PeopleValue.of(peopleValue);
    try {
      this.peopleRepository.save(people);
    } catch (Exception e) {
      Log.error(e.getMessage());
      throw new DataAccessResourceFailureException("Could not save character to database");
    }
    return people.getId();
  }

  public void deleteCharacter(UUID uuid) {
    this.peopleRepository.deleteById(uuid);
  }
}
