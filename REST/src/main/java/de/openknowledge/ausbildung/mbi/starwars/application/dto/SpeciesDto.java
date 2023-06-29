package de.openknowledge.ausbildung.mbi.starwars.application.dto;

import de.openknowledge.ausbildung.mbi.starwars.application.values.SpeciesValue;

public class SpeciesDto {
  private SpeciesValue fields;
  private String model;
  private int pk;

  public SpeciesDto(SpeciesValue fields, String model, int pk) {
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
