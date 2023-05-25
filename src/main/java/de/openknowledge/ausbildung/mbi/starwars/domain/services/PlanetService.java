package de.openknowledge.ausbildung.mbi.starwars.domain.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import de.openknowledge.ausbildung.mbi.starwars.application.values.PlanetValue;
import de.openknowledge.ausbildung.mbi.starwars.domain.entities.Planet;
import de.openknowledge.ausbildung.mbi.starwars.domain.exceptions.NotFoundException;
import de.openknowledge.ausbildung.mbi.starwars.infrastructure.PlanetRepository;

@Service
public class PlanetService {
  @Inject
  private PlanetRepository planetRepository;

  public Planet findPlanetById(int id) throws NotFoundException {
    Optional<Planet> planetOptional = this.planetRepository.findById(id);
    if (!planetOptional.isPresent()) {
      throw new NotFoundException("Planet not found");
    }
    return planetOptional.get();
  }

  public List<PlanetValue> findAllPlanets() {
    List<PlanetValue> planets = new ArrayList<>();
    this.planetRepository.findAll().forEach(planet -> planets.add(PlanetValue.of(planet)));
    return planets;
  }

  public Planet findPlanetByName(String planetName) throws NotFoundException {
    Optional<Planet> planet = this.planetRepository.findByName(planetName);
    if(planet.isPresent()){
      return planet.get();
    }
    throw new NotFoundException("Planet not in Database");
  }

  public int createPlanet(Planet planet) {
    return this.planetRepository.save(planet).getId();
  }

  public void deletePlanet(int id) {
    this.planetRepository.deleteById(id);
  }
}
