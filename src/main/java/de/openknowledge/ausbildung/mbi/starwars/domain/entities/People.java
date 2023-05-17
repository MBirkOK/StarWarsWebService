package de.openknowledge.ausbildung.mbi.starwars.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

import java.util.UUID;

import de.openknowledge.ausbildung.mbi.starwars.application.values.PeopleValue;
import de.openknowledge.ausbildung.mbi.starwars.domain.entities.value_obj.PersonInfo;

@Entity(name = "tab_starwars_characters")
public class People {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private UUID id;

  @Column(name = "given_name")
  private String name;
  @Column
  private Double height;
  @Column
  private float mass;
  @Column(name = "haircolor")
  private String haircolor;
  @Column(name = "skincolor")
  private String skincolor;
  @Column(name = "eyecolor")
  private String eyeColor;
  @Column
  private String birthday;
  @Column
  private String gender;

  @OneToOne
  @JoinColumn(name = "homeworld")
  private Planet homeWorld;

  public People() {
    //for JPA
  }

  public People(UUID id, String name, Double height, float mass, String haircolor, String skincolor, String eyeColor,
                String birthday, String gender, Planet homeWorld) {
    this.id = id;
    this.name = name;
    this.height = height;
    this.mass = mass;
    this.haircolor = haircolor;
    this.skincolor = skincolor;
    this.eyeColor = eyeColor;
    this.birthday = birthday;
    this.gender = gender;
    this.homeWorld = homeWorld;
  }

  public People(PeopleValue peopleValue, Planet planet) {
    this.name = peopleValue.getName();
    this.height = Double.parseDouble(peopleValue.getHeight());
    this.mass = Float.parseFloat(peopleValue.getMass());
    this.haircolor = peopleValue.getHairColor();
    this.skincolor = peopleValue.getSkinColor();
    this.eyeColor = peopleValue.getEyeColor();
    this.gender = peopleValue.getGender();
    this.homeWorld = planet;
    this.birthday = peopleValue.getBirthYear();
  }

  public UUID getId() {
    return id;
  }

  public String getName() {
    return name;
  }


  public Double getHeight() {
    return height;
  }


  public float getMass() {
    return mass;
  }


  public String getHaircolor() {
    return haircolor;
  }


  public String getEyeColor() {
    return eyeColor;
  }


  public String getBirthday() {
    return birthday;
  }


  public String getGender() {
    return gender;
  }

  public String getSkincolor() {
    return skincolor;
  }

  public Planet getHomeWorld() {
    return homeWorld;
  }

}
