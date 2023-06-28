package de.openknowledge.ausbildung.mbi.starwars.application.controller;

import java.util.List;
import java.util.UUID;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import de.openknowledge.ausbildung.mbi.starwars.application.values.PeopleValue;
import de.openknowledge.ausbildung.mbi.starwars.application.values.PlanetValue;
import de.openknowledge.ausbildung.mbi.starwars.domain.exceptions.NotFoundException;
import de.openknowledge.ausbildung.mbi.starwars.domain.services.PeopleService;

@RestController
@RequestMapping(path = "/character")
@CrossOrigin(origins = "http://localhost:3000")
public class PeopleController {

  @Inject
  private PeopleService peopleService;

  static class PeopleHolder {
    private PeopleValue fields;
    private String model;
    private int pk;

    public PeopleHolder(PeopleValue fields, String model, int pk) {
      this.fields = fields;
      this.model = model;
      this.pk = pk;
    }

    public PeopleValue getFields() {
      return fields;
    }

    public int getPk() {
      return pk;
    }
  }

  @GetMapping(path = "/get/{id}")
  public PeopleValue findCharacterFindById(@PathVariable String id) throws NotFoundException {
    return PeopleValue.of(this.peopleService.findCharacterById(Integer.parseInt(id)));
  }

  @GetMapping()
  public List<PeopleValue> findAllPeople() {
    return this.peopleService.findAllPeople();
  }

  @PostMapping(path = "/create")
  public int createCharacter(@RequestBody PeopleHolder peopleHolder) throws NotFoundException {
    PeopleValue peopleValue = new PeopleValue(peopleHolder.getPk(), peopleHolder.getFields().getName(),
      peopleHolder.getFields().getHeight(), peopleHolder.getFields().getMass(), peopleHolder.getFields().getHairColor(),
      peopleHolder.getFields().getSkinColor(), peopleHolder.getFields().getEyeColor(),
      peopleHolder.getFields().getBirthYear(), peopleHolder.getFields().getGender(),
      peopleHolder.getFields().getHomeworld().getId());
    return this.peopleService.createCharacter(peopleValue);
  }

  @DeleteMapping(value = "/delete/{id}")
  public void deleteCharacter(@RequestParam int id) {
    this.peopleService.deleteCharacter(id);
  }

  @PostMapping(path = "/masscreate")
  public void massCreate(@RequestBody List<PeopleHolder> peopleHolders) throws NotFoundException {
    for (PeopleHolder peopleHolder : peopleHolders) {
      this.createCharacter(peopleHolder);
    }
  }

}
