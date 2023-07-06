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

import de.openknowledge.ausbildung.mbi.starwars.application.values.StarshipValue;
import de.openknowledge.ausbildung.mbi.starwars.domain.entities.People;
import de.openknowledge.ausbildung.mbi.starwars.domain.entities.Starship;
import de.openknowledge.ausbildung.mbi.starwars.domain.exceptions.NotFoundException;
import de.openknowledge.ausbildung.mbi.starwars.infrastructure.StarshipRepository;

@Service
public class StarshipService {
  private Logger Log = LoggerFactory.getLogger(StarshipService.class);


  @Inject
  private StarshipRepository starshipRepository;

  @Inject
  private PeopleService peopleService;

  public Starship findStarshipById(int id) {
    Optional<Starship> starshipOptional = this.starshipRepository.findById(id);
    if (starshipOptional.isPresent()) {
      return starshipOptional.get();
    } else {
      throw new NoSuchElementException();
    }
  }

  public List<Starship> findAllStarships() {
    List<Starship> starships = new ArrayList<>();
    this.starshipRepository.findAll().iterator().forEachRemaining(starships::add);
    return starships;
  }

  public int createStarship(int id, StarshipValue starshipValue) {
    Starship starship = new Starship(id, starshipValue, this.peopleService.findAllForIds(starshipValue.getPilots()));
    try {
      this.starshipRepository.save(starship);
    } catch (Exception e) {
      Log.error(e.getMessage());
      throw new DataAccessResourceFailureException("Could not save starship to database");
    }
    return starship.getId();
  }
}
