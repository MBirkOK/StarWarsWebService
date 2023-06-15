package de.openknowledge.ausbildung.mbi.starwars.application.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import de.openknowledge.ausbildung.mbi.starwars.application.values.PlanetValue;
import de.openknowledge.ausbildung.mbi.starwars.domain.entities.Planet;
import de.openknowledge.ausbildung.mbi.starwars.domain.exceptions.NotFoundException;
import de.openknowledge.ausbildung.mbi.starwars.domain.services.PlanetService;

@RestController
@RequestMapping(path = "/planet")
@CrossOrigin(origins = "http://localhost:3000")
public class PlanetController {

  static class PlanetHolder{
   private PlanetValue fields;
   private String model;
   private int pk;

    public PlanetHolder(PlanetValue fields, String model, int pk) {
      this.fields = fields;
      this.model = model;
      this.pk = pk;
    }

    public PlanetValue getFields() {
      return fields;
    }

    public int getPk() {
      return pk;
    }
  }

  @Inject
  private PlanetService planetService;

  @GetMapping(path = "/{id}")
  public PlanetValue findPlanetById(@PathVariable String id) throws NotFoundException {
    return PlanetValue.of(this.planetService.findPlanetById(Integer.parseInt(id)));
  }

  @GetMapping()
  public List<PlanetValue> findAllPlanets(){
    return this.planetService.findAllPlanets();
  }

  @PostMapping(path = "/create")
  public int createPlanet(@RequestBody PlanetHolder planetHolder) {
    PlanetValue planetValue = planetHolder.getFields();
    String surface =planetValue.getSurfaceWater();
    String rotationPeriod = planetValue.getRotationPeriod();
    String diameter = planetValue.getDiameter();
    if(diameter.equals("unknown")){
      diameter = "0.0";
    }
    if(rotationPeriod.equals("unknown")){
      rotationPeriod = "0.0";
    }
    if(surface.equals("unknown")){
      surface = "0.0";
    }
    Planet planet = new Planet(planetHolder.getPk(), planetValue.getName(), Double.parseDouble(diameter),
      Double.parseDouble(rotationPeriod), planetValue.getGravity(), planetValue.getClimate(),
      planetValue.getTerrain(), Double.parseDouble(surface),
      planetValue.getOrbitalPeriod(), planetValue.getPopulation());
    return this.planetService.createPlanet(planet);
  }

  @DeleteMapping(path = "/delete/{id}")
  public void deletePlanet(@PathVariable int id) {
    this.planetService.deletePlanet(id);
  }

  @PostMapping("/masscreate")
  public void massCreate(@RequestBody List<PlanetHolder> planetHolders){
    for(PlanetHolder planetHolder: planetHolders){
      this.createPlanet(planetHolder);
    }
  }
}
