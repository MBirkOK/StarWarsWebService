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
import org.springframework.web.bind.annotation.RestController;

import de.openknowledge.ausbildung.mbi.starwars.application.values.PlanetValue;
import de.openknowledge.ausbildung.mbi.starwars.domain.entities.Planet;
import de.openknowledge.ausbildung.mbi.starwars.domain.exceptions.PlanetNotFoundException;
import de.openknowledge.ausbildung.mbi.starwars.domain.services.PlanetService;

@RestController
@RequestMapping(path = "/planet")
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
  public PlanetValue findPlanetById(@PathVariable String id) throws PlanetNotFoundException {
    return PlanetValue.of(this.planetService.findPlanetById(Integer.parseInt(id)));
  }

  @GetMapping()
  public List<PlanetValue> findAllPlanets(){
    return this.planetService.findAllPlanets();
  }

  @PostMapping(path = "/create")
  public int createPlanet(@RequestBody PlanetHolder planetHolder) {
    return this.planetService.createPlanet(new Planet(planetHolder.getPk(), planetHolder.getFields().getName(), planetHolder.getFields().getDiameter(),
      planetHolder.getFields().getRotationPeriod(), planetHolder.getFields().getGravity(), planetHolder.getFields().getClimate(), planetHolder.getFields().getTerrain(),
      Double.valueOf(planetHolder.getFields().getSurfaceWater()), planetHolder.getFields().getOrbitalPeriod(), planetHolder.getFields().getPopulation()));
  }

  @DeleteMapping(path = "/delete/{id}")
  public void deletePlanet(@PathVariable int id) {
    this.planetService.deletePlanet(id);
  }
}
