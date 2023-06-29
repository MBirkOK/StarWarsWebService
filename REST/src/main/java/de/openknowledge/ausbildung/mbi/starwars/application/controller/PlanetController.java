package de.openknowledge.ausbildung.mbi.starwars.application.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import de.openknowledge.ausbildung.mbi.starwars.application.dto.PlanetDto;
import de.openknowledge.ausbildung.mbi.starwars.application.values.PlanetValue;
import de.openknowledge.ausbildung.mbi.starwars.domain.entities.Planet;
import de.openknowledge.ausbildung.mbi.starwars.domain.exceptions.NotFoundException;
import de.openknowledge.ausbildung.mbi.starwars.domain.services.PlanetService;

@RestController
@RequestMapping(path = "/planet")
@CrossOrigin(origins = "http://localhost:3000")
public class PlanetController {

  @Inject
  private PlanetService planetService;

  @GetMapping(path = "/{id}")
  public PlanetValue findPlanetById(@PathVariable String id) {
    return PlanetValue.of(this.planetService.findPlanetById(Integer.parseInt(id)));
  }

  @GetMapping()
  public List<PlanetValue> findAllPlanets(){
    return this.planetService.findAllPlanets();
  }

  @PostMapping(path = "/create")
  public int createPlanet(@RequestBody PlanetDto planetDto) {
    PlanetValue planetValue = planetDto.getFields();
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
    Planet planet = new Planet(planetDto.getPk(), planetValue.getName(), Double.parseDouble(diameter),
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
  public void massCreate(@RequestBody List<PlanetDto> planetDtos){
    for(PlanetDto planetDto : planetDtos){
      this.createPlanet(planetDto);
    }
  }
}
