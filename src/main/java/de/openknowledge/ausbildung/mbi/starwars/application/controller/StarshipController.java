package de.openknowledge.ausbildung.mbi.starwars.application.controller;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import de.openknowledge.ausbildung.mbi.starwars.application.values.StarshipValue;
import de.openknowledge.ausbildung.mbi.starwars.domain.entities.Starship;
import de.openknowledge.ausbildung.mbi.starwars.domain.exceptions.NotFoundException;
import de.openknowledge.ausbildung.mbi.starwars.domain.services.StarshipService;

@RestController
@RequestMapping(path = "/starship")
@CrossOrigin(origins = "http://localhost:3000")
public class StarshipController {

  @Inject
  private StarshipService starshipService;

  static class StarshipHolder{
    private StarshipValue fields;
    private String model;
    private int pk;

    public StarshipHolder(StarshipValue fields, String model, int pk) {
      this.fields = fields;
      this.model = model;
      this.pk = pk;
    }

    public StarshipValue getFields() {
      return fields;
    }

    public int getPk() {
      return pk;
    }
  }

  @GetMapping(path = "/get/{id}")
  public StarshipValue findStarshipById(@PathVariable String id) throws NotFoundException {
    StarshipValue starShipValue = new StarshipValue(this.starshipService.findStarshipById(Integer.parseInt(id)));
    return starShipValue;
  }

  @GetMapping
  public List<StarshipValue> findAllStarships() {
    List<Starship> starships = this.starshipService.findAllStarships();
    List<StarshipValue> starshipValues = new ArrayList<>();

    starships.forEach(starship -> {
      starshipValues.add(new StarshipValue(starship));
    });

    return starshipValues;
  }

  @PostMapping(path = "/create")
  public int createStarship(@RequestBody StarshipHolder starshipHolder){
    return this.starshipService.createStarship(starshipHolder.getPk(), starshipHolder.getFields());
  }

  @PostMapping(path = "/masscreate")
  public void massCreate(@RequestBody List<StarshipHolder> starshipHolders){
    for(StarshipHolder starshipHolder: starshipHolders){
      this.createStarship(starshipHolder);
    }
  }
}
