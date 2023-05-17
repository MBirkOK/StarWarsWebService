package de.openknowledge.ausbildung.mbi.starwars.application.controller;

import java.util.List;
import java.util.UUID;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import de.openknowledge.ausbildung.mbi.starwars.application.values.PeopleValue;
import de.openknowledge.ausbildung.mbi.starwars.domain.exceptions.PeopleNotFoundException;
import de.openknowledge.ausbildung.mbi.starwars.domain.exceptions.PlanetNotFoundException;
import de.openknowledge.ausbildung.mbi.starwars.domain.services.PeopleService;

@RestController
@RequestMapping(path = "/character")
public class PeopleController {

  @Inject
  private PeopleService peopleService;

  @GetMapping(path = "/get/{id}")
  public PeopleValue findCharacterFindById(@PathVariable String id) throws PeopleNotFoundException {
    return this.peopleService.findCharacterById(id);
  }

  @GetMapping()
  public List<PeopleValue> findAllPeople(){
    return this.peopleService.findAllPeople();
  }

  @PostMapping(path = "/create")
  public UUID createCharacter(@RequestBody PeopleValue peopleValue) throws PlanetNotFoundException {
    return this.peopleService.createCharacter(peopleValue);
  }

  @DeleteMapping(value = "/delete/{id}")
  public void deleteCharacter(@RequestParam UUID id) {
    this.peopleService.deleteCharacter(id);
  }
}
