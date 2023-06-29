package de.openknowledge.ausbildung.mbi.starwars.application.dto;

import de.openknowledge.ausbildung.mbi.starwars.application.values.StarshipValue;

public class StarshipDto {
  private StarshipValue fields;
  private String model;
  private int pk;

  public StarshipDto(StarshipValue fields, String model, int pk) {
    this.fields = fields;
    this.model = model;
    this.pk = pk;
  }

  public StarshipValue getFields() {
    return fields;
  }

  public int getPk() {
    return pk;
  }
}