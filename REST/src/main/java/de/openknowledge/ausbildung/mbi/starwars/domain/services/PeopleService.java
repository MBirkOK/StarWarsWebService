package de.openknowledge.ausbildung.mbi.starwars.domain.services;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataAccessResourceFailureException;
import org.springframework.stereotype.Service;

import de.openknowledge.ausbildung.mbi.starwars.application.values.PeopleValue;
import de.openknowledge.ausbildung.mbi.starwars.domain.entities.People;
import de.openknowledge.ausbildung.mbi.starwars.domain.entities.Planet;
import de.openknowledge.ausbildung.mbi.starwars.domain.exceptions.NotFoundException;
import de.openknowledge.ausbildung.mbi.starwars.infrastructure.PeopleRepository;

@Service
public class PeopleService {

  private Logger Log = LoggerFactory.getLogger(PeopleService.class);

  @Inject
  private PlanetService planetService;

  @Inject
  private PeopleRepository peopleRepository;

  public People findCharacterById(int id) {
      Optional<People> peopleOptional = this.peopleRepository.findById(id);
      if (peopleOptional.isPresent()) {
        return peopleOptional.get();
      } else {
        throw new NoSuchElementException();
      }
    }

    public List<PeopleValue> findAllPeople () {
      List<PeopleValue> peoples = new ArrayList<>();
      this.peopleRepository.findAll().forEach(people -> peoples.add(PeopleValue.of(people)));
      return peoples;
    }

    public List<People> findAllForIds (List < Integer > pilotIds) {
      if (pilotIds.isEmpty()) {
        return new ArrayList<>();
      }
      return this.peopleRepository.findAllByIdIn(pilotIds);
    }

    public int createCharacter (PeopleValue peopleValue){
      Planet planet = this.planetService.findPlanetById(peopleValue.getHomeworld().getId());
      People people = new People(peopleValue, planet);

      try {
        this.peopleRepository.save(people);
      } catch (Exception e) {
        Log.error(e.getMessage());
        throw new DataAccessResourceFailureException("Could not save character to database");
      }
      return people.getId();
    }

    public void deleteCharacter ( int id){
      this.peopleRepository.deleteById(id);
    }
  }
