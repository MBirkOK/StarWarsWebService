package de.openknowledge.ausbildung.mbi.starwars.application.dto;

import de.openknowledge.ausbildung.mbi.starwars.application.values.PeopleValue;

public class PeopleDto {
  private PeopleValue fields;
  private String model;
  private int pk;

  public PeopleDto(PeopleValue fields, String model, int pk) {
    this.fields = fields;
    this.model = model;
    this.pk = pk;
  }

  public PeopleValue getFields() {
    return fields;
  }

  public int getPk() {
    return pk;
  }
}
