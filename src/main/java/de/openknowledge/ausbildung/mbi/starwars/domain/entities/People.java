package de.openknowledge.ausbildung.mbi.starwars.domain.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.UUID;

import org.springframework.jdbc.core.JdbcOperationsExtensionsKt;

import de.openknowledge.ausbildung.mbi.starwars.application.values.PeopleValue;
import de.openknowledge.ausbildung.mbi.starwars.domain.entities.value_obj.PersonInfo;

@Entity(name = "tab_starwars_characters")
public class People {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private UUID id;

  private String name;
  private Double height;
  private float mass;
  private String haircolor;
  private String skincolor;
  private String eyeColor;
  private String birthday;
  private String gender;
  private String homeWorld;

  public People() {
    //for JPA
  }

  public People(UUID id, String name, Double height, float mass, String haircolor, String skincolor, String eyeColor,
    String birthday, String gender, String homeWorld) {
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

  public String getHomeWorld() {
    return homeWorld;
  }


  public static PeopleValue of(People people) {
    PersonInfo personInfo = new PersonInfo(people.getName(), people.getHeight().toString(), Float.toString(people.getMass()), people.getHaircolor(),
      people.getSkincolor(), people.getEyeColor(), people.getBirthday(), people.getGender(), people.getHomeWorld());
    return new PeopleValue(people.getId(), personInfo);
  }
}
