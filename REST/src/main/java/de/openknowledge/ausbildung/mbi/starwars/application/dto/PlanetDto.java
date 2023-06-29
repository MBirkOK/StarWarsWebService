package de.openknowledge.ausbildung.mbi.starwars.application.dto;

import de.openknowledge.ausbildung.mbi.starwars.application.values.PlanetValue;

public class PlanetDto {
  private PlanetValue fields;
  private String model;
  private int pk;

  public PlanetDto(PlanetValue fields, String model, int pk) {
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