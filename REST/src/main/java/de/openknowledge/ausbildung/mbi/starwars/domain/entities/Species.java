package de.openknowledge.ausbildung.mbi.starwars.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

import java.util.List;

import de.openknowledge.ausbildung.mbi.starwars.application.values.SpeciesValue;

@Entity(name = "tab_starwars_species")
public class Species {

  @Id
  private int id;

  @Column(name = "species_name")
  private String name;

  @Column
  private String classification;

  @Column
  private String designation;

  @Column(name = "average_height")
  private Double averageHeight;

  @Column(name = "average_lifespan")
  private int averageLifeSpan;

  @Column(name = "hair_colors")
  private String hairColor;

  @Column(name = "skin_colors")
  private String skinColor;

  @Column(name = "eye_colors")
  private String eyeColor;

  @Column
  private String language;

  @OneToOne
  @JoinColumn(name = "homeworld")
  private Planet homeWorld;

  @OneToMany
  @JoinTable(name = "tab_starwars_species_people",
  joinColumns = {
    @JoinColumn(name = "species_id")
  },
  inverseJoinColumns = {
    @JoinColumn(name = "people_id")
  })
  private List<People> people;

  public Species(int id, String name, String designation, Double averageHeight, int averageLifeSpan, String hairColor,
                 String skinColor, String eyeColor, String language, Planet planet, List<People> people,
                 String classification) {
    this.id = id;
    this.name = name;
    this.classification = classification;
    this.designation = designation;
    this.averageHeight = averageHeight;
    this.averageLifeSpan = averageLifeSpan;
    this.hairColor = hairColor;
    this.skinColor = skinColor;
    this.eyeColor = eyeColor;
    this.language = language;
    this.homeWorld = planet;
    this.people = people;
  }

  public Species() {
    //for JPA
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getDesignation() {
    return designation;
  }

  public String getClassification() {
    return classification;
  }

  public Double getAverageHeight() {
    return averageHeight;
  }

  public int getAverageLifeSpan() {
    return averageLifeSpan;
  }

  public String getHairColor() {
    return hairColor;
  }

  public String getSkinColor() {
    return skinColor;
  }

  public String getEyeColor() {
    return eyeColor;
  }

  public String getLanguage() {
    return language;
  }

  public Planet getHomeWorld() {
    return homeWorld;
  }

  public List<People> getPeople() {
    return people;
  }

  public static Species of(SpeciesValue speciesValue, int id, Planet home, List<People> people) {
    String average = speciesValue.getAverageHeight();;
    String lifespan = speciesValue.getAverageLifespan();
    if(average.equals("n/a")||average.equals("unknown")){
      average = "0.0";
    }
    if(lifespan.equals("indefinite") ||lifespan.equals("unknown")){
      lifespan = "0";
    }
    return new Species(id, speciesValue.getName(), speciesValue.getDesignation(),
      Double.parseDouble(average), Integer.parseInt(lifespan),
      speciesValue.getHairColors(), speciesValue.getSkinColors(), speciesValue.getEyeColors(), speciesValue.getLanguage(),
      home, people, speciesValue.getClassification());
  }
}
