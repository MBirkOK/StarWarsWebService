package de.openknowlede.ausbildung.mbi.starwars.domain.entities;

import java.time.LocalDate;
import java.util.UUID;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import de.openknowlede.ausbildung.mbi.starwars.application.values.PeopleValue;

@Entity
@Table(name = "tab_starwars_characters")
public class People {

    @Id
    private UUID id;

    private String name;
    private Double height;
    private float mass;
    private String haircolor;
    private String skincolor;
    private String eyeColor;
    private LocalDate birthday;
    private String gender;
    private String homeWorld;

    public People() {
        //for JPA
    }

    public People(UUID id, String name, Double height, float mass, String haircolor, String skincolor, String eyeColor,
                  LocalDate birthday, String gender, String homeWorld) {
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


    public LocalDate getBirthday() {
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
        return new PeopleValue(people.getId(), people.getName(), people.getHeight().toString(), Float.toString(people.getMass()),
            people.getHaircolor(),people.getSkincolor(), people.getEyeColor(), people.getBirthday().toString(), people.getGender(),
            people.getHomeWorld());
    }
}
