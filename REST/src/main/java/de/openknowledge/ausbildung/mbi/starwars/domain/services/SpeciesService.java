package de.openknowledge.ausbildung.mbi.starwars.domain.services;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import de.openknowledge.ausbildung.mbi.starwars.application.values.SpeciesValue;
import de.openknowledge.ausbildung.mbi.starwars.domain.entities.People;
import de.openknowledge.ausbildung.mbi.starwars.domain.entities.Planet;
import de.openknowledge.ausbildung.mbi.starwars.domain.entities.Species;
import de.openknowledge.ausbildung.mbi.starwars.domain.exceptions.NotFoundException;
import de.openknowledge.ausbildung.mbi.starwars.infrastructure.PeopleRepository;
import de.openknowledge.ausbildung.mbi.starwars.infrastructure.PlanetRepository;
import de.openknowledge.ausbildung.mbi.starwars.infrastructure.SpeciesRepository;

@Service
public class SpeciesService {

  @Inject
  SpeciesRepository speciesRepository;

  @Inject
  PeopleRepository peopleRepository;

  @Inject
  PlanetService planetService;

  public List<SpeciesValue> findAllSpecies() {
    List<SpeciesValue> speciesList = new ArrayList<>();
    this.speciesRepository.findAll().forEach(species -> speciesList.add(SpeciesValue.of(species)));
    return speciesList;
  }

  public Species findSpecies(String id) {
    return this.speciesRepository.findById(Integer.parseInt(id)).get();
  }

  public int createSpecies(SpeciesValue speciesValue, int id){
    Planet home;
    if (speciesValue.getHomeworld() == null) {
      home = null;
    } else {
      home = this.planetService.findPlanetById(Integer.parseInt(speciesValue.getHomeworld()));
    }
    List<People> peopleList = new ArrayList<>();
    for (Object object : speciesValue.getPeople()) {
      peopleList.add(this.peopleRepository.findById((int)object).get());
    }

    Species species = Species.of(speciesValue, id, home, peopleList);
    this.speciesRepository.save(species);
    return species.getId();
  }
}
