package de.openknowledge.ausbildung.mbi.starwars.application.controller;

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

  @Inject
  private PlanetService planetService;

  @GetMapping(path = "/{id}")
  public PlanetValue findPlanetById(@PathVariable String id) throws PlanetNotFoundException {
    return this.planetService.findPlanetById(UUID.fromString(id));
  }

  @PostMapping(path = "/create")
  public UUID createPlanet(@RequestBody PlanetValue planetValue) {
    return this.planetService.createPlanet(Planet.of(planetValue));
  }

  @DeleteMapping(path = "/delete/{id}")
  public void deletePlanet(@PathVariable UUID id) {
    this.planetService.deletePlanet(id);
  }
}
