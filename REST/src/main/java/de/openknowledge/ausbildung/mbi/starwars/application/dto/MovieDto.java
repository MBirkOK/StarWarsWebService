package de.openknowledge.ausbildung.mbi.starwars.application.dto;

import de.openknowledge.ausbildung.mbi.starwars.application.values.MovieValue;

public class MovieDto {
  private MovieValue fields;
  private String model;
  private int pk;

  public MovieDto(MovieValue fields, String model, int pk) {
    this.fields = fields;
    this.model = model;
    this.pk = pk;
  }

  public MovieValue getFields() {
    return fields;
  }

  public int getPk() {
    return pk;
  }
}
