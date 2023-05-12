package de.openknowledge.ausbildung.mbi.starwars.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.UUID;

import de.openknowledge.ausbildung.mbi.starwars.application.values.PlanetValue;

@Entity(name = "tab_starwars_planet")
public class Planet {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private UUID id;

  @Column(name = "planet_name")
  private String name;

  @Column
  private Double diameter;

  @Column(name = "rotationduration")
  private Double rotationPeriod;

  @Column
  private String gravity;

  @Column
  private String climate;

  @Column
  private String terrain;

  @Column
  private Double surfaceWater;

  protected Planet() {
    //for JPA
  }

  public Planet(UUID id, String name, Double diameter, Double rotationPeriod, String gravity, String climate,
                String terrain, Double surfaceWater) {
    this.id = id;
    this.name = name;
    this.diameter = diameter;
    this.rotationPeriod = rotationPeriod;
    this.gravity = gravity;
    this.climate = climate;
    this.terrain = terrain;
    this.surfaceWater = surfaceWater;
  }

  public Planet(String name, Double diameter, Double rotationPeriod, String gravity, String climate, String terrain, Double surfaceWater) {
    this.name = name;
    this.diameter = diameter;
    this.rotationPeriod = rotationPeriod;
    this.gravity = gravity;
    this.climate = climate;
    this.terrain = terrain;
    this.surfaceWater = surfaceWater;
  }

  public UUID getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public Double getDiameter() {
    return diameter;
  }

  public Double getRotationPeriod() {
    return rotationPeriod;
  }

  public String getGravity() {
    return gravity;
  }

  public String getClimate() {
    return climate;
  }

  public String getTerrain() {
    return terrain;
  }

  public Double getSurfaceWater() {
    return surfaceWater;
  }

  public static Planet of(PlanetValue planetValue) {
    return new Planet(planetValue.getName(), planetValue.getDiameter(), planetValue.getRotationPeriod(),
      planetValue.getGravity(), planetValue.getClimate(), planetValue.getTerrain(),
      Double.parseDouble(planetValue.getSurfaceWater()));
  }
}
