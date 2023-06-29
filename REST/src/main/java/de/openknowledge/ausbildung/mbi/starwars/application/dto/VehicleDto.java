package de.openknowledge.ausbildung.mbi.starwars.application.dto;

import de.openknowledge.ausbildung.mbi.starwars.application.values.VehicleValue;

public class VehicleDto {
  private int pk;
  private String model;
  private VehicleValue fields;

  public VehicleDto(int pk, String model, VehicleValue fields) {
    this.pk = pk;
    this.model = model;
    this.fields = fields;
  }

  public int getPk() {
    return pk;
  }

  public String getModel() {
    return model;
  }

  public VehicleValue getFields() {
    return fields;
  }
}

