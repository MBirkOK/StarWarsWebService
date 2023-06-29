package de.openknowledge.ausbildung.mbi.starwars.application.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import de.openknowledge.ausbildung.mbi.starwars.application.values.SpeciesValue;
import de.openknowledge.ausbildung.mbi.starwars.domain.exceptions.NotFoundException;
import de.openknowledge.ausbildung.mbi.starwars.domain.services.SpeciesService;

@RestController
@RequestMapping("/species")
@CrossOrigin(origins = "http://localhost:3000")
public class SpeciesController {

  @Inject
  private SpeciesService speciesService;

  static class SpeciesHolder {
    private SpeciesValue fields;
    private String model;
    private int pk;

    public SpeciesHolder(SpeciesValue fields, String model, int pk) {
      this.fields = fields;
      this.model = model;
      this.pk = pk;
    }

    public SpeciesValue getFields() {
      return fields;
    }

    public int getPk() {
      return pk;
    }
  }

  @GetMapping()
  public List<SpeciesValue> findAllSpecies() {
    return this.speciesService.findAllSpecies();
  }

  @GetMapping("/{id}")
  public SpeciesValue findSpecies(@PathVariable String id) {
    return SpeciesValue.of(this.speciesService.findSpecies(id));
  }

  @PostMapping("/create")
  public int createSpecies(@RequestBody SpeciesHolder species) throws NotFoundException {
    return this.speciesService.createSpecies(species.getFields(), species.getPk());
  }

  @PostMapping("/masscreate")
  public void massCreate(@RequestBody List<SpeciesHolder> speciesHolders) throws NotFoundException {
    for (SpeciesHolder speciesHolder : speciesHolders) {
      this.createSpecies(speciesHolder);
    }
  }
}
