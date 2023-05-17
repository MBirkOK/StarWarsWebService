package de.openknowledge.ausbildung.mbi.starwars.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import de.openknowledge.ausbildung.mbi.starwars.application.values.PlanetValue;

@Entity(name = "tab_starwars_planet")
public class Planet {

  @Id
  private int id;

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

  @Column
  private String orbital;

  @Column
  private String population;

  protected Planet() {
    //for JPA
  }

  public Planet(int id, String name, Double diameter, Double rotationPeriod, String gravity, String climate,
                String terrain, Double surfaceWater, String orbital, String population) {
    this.id = id;
    this.name = name;
    this.diameter = diameter;
    this.rotationPeriod = rotationPeriod;
    this.gravity = gravity;
    this.climate = climate;
    this.terrain = terrain;
    this.surfaceWater = surfaceWater;
    this.orbital = orbital;
    this.population = population;
  }

  public Planet(String name, Double diameter, Double rotationPeriod, String gravity, String climate,
                String terrain, Double surfaceWater, String orbital, String population) {
    this.name = name;
    this.diameter = diameter;
    this.rotationPeriod = rotationPeriod;
    this.gravity = gravity;
    this.climate = climate;
    this.terrain = terrain;
    this.surfaceWater = surfaceWater;
    this.orbital = orbital;
    this.population = population;
  }

  public int getId() {
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

  public String getOrbital() {
    return orbital;
  }

  public String getPopulation() {
    return population;
  }

  public static Planet of(PlanetValue planetValue) {
    return new Planet(planetValue.getName(), planetValue.getDiameter(), planetValue.getRotationPeriod(),
      planetValue.getGravity(), planetValue.getClimate(), planetValue.getTerrain(),
      Double.parseDouble(planetValue.getSurfaceWater()), planetValue.getOrbitalPeriod(), planetValue.getPopulation());
  }
}
