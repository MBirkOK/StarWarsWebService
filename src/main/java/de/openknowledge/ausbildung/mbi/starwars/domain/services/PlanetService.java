package de.openknowledge.ausbildung.mbi.starwars.domain.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import de.openknowledge.ausbildung.mbi.starwars.application.values.PlanetValue;
import de.openknowledge.ausbildung.mbi.starwars.domain.entities.Planet;
import de.openknowledge.ausbildung.mbi.starwars.domain.exceptions.PlanetNotFoundException;
import de.openknowledge.ausbildung.mbi.starwars.infrastructure.PlanetRepository;

@Service
public class PlanetService {
  @Inject
  private PlanetRepository planetRepository;

  public PlanetValue findPlanetById(UUID uuid) throws PlanetNotFoundException {
    Optional<Planet> planetOptional = this.planetRepository.findById(uuid);
    if (!planetOptional.isPresent()) {
      throw new PlanetNotFoundException("Planet not found");
    }
    return PlanetValue.of(planetOptional.get());
  }

  public List<PlanetValue> findAllPlanets(){
    List<PlanetValue> planets = new ArrayList<>();
    this.planetRepository.findAll().forEach(planet -> planets.add(PlanetValue.of(planet)));
    return planets;
  }

  public UUID createPlanet(Planet planet) {
    return this.planetRepository.save(planet).getId();
  }

  public void deletePlanet(UUID uuid) {
    this.planetRepository.deleteById(uuid);
  }
}
