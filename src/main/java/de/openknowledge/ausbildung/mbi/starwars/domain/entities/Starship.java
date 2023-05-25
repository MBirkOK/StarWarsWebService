package de.openknowledge.ausbildung.mbi.starwars.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

import java.util.List;

import de.openknowledge.ausbildung.mbi.starwars.application.values.StarshipValue;

@Entity(name = "tab_starwars_starship")
public class Starship {

  @Id
  private int id;

  @Column
  private Double hyperdriveRating;

  @Column
  private String mglt;

  @ManyToMany
  @JoinTable(name = "tab_starwars_starship_pilots",
    joinColumns = {
      @JoinColumn(name = "starship_id")
    },
    inverseJoinColumns = {
      @JoinColumn(name = "people_id")
    })
  private List<People> pilots;

  @Column
  private String starshipClass;

  @Column
  private String starshipName;

  @Column
  private String model;

  @Column
  private String manufacturer;

  @Column
  private Double costInCredits;

  @Column
  private Double length;

  @Column
  private Double maxAtmospheringSpeed;

  @Column
  private Double cargoCapacity;

  @Column
  private String consumables;

  @Column
  private int crew;

  @Column
  @OneToMany
  private List<People> passenger;


  public Starship(int id, StarshipValue starshipValue, List<People> pilots) {
    String hyperDrive = starshipValue.getHyperdriveRating();
    if(hyperDrive.equals("unknown")){
      hyperDrive = "0.0";
    }
    this.id = id;
    this.hyperdriveRating = Double.valueOf(hyperDrive);
    this.mglt = starshipValue.getMglt();
    this.pilots = pilots;
    this.starshipClass = starshipValue.getStarshipClass();
  }

  public Starship(int id, Double hyperdriveRating, String mglt, List<People> pilots, String starshipClass,
                  String starshipName, String model, String manufacturer, Double costInCredits, Double length,
                  Double maxAtmospheringSpeed, Double cargoCapacity, String consumables, int crew, List<People> passenger) {
    this.id = id;
    this.hyperdriveRating = hyperdriveRating;
    this.mglt = mglt;
    this.pilots = pilots;
    this.starshipClass = starshipClass;
    this.starshipName = starshipName;
    this.model = model;
    this.manufacturer = manufacturer;
    this.costInCredits = costInCredits;
    this.length = length;
    this.maxAtmospheringSpeed = maxAtmospheringSpeed;
    this.cargoCapacity = cargoCapacity;
    this.consumables = consumables;
    this.crew = crew;
    this.passenger = passenger;
  }

  public Starship() {
    //for JPA
  }

  public int getId() {
    return id;
  }

  public Double getHyperdriveRating() {
    return hyperdriveRating;
  }

  public String getMglt() {
    return mglt;
  }

  public List<People> getPilots() {
    return pilots;
  }

  public String getStarshipClass() {
    return starshipClass;
  }

  public String getStarshipName() {
    return starshipName;
  }

  public String getModel() {
    return model;
  }

  public String getManufacturer() {
    return manufacturer;
  }

  public Double getCostInCredits() {
    return this.costInCredits;
  }

  public Double getLength() {
    return length;
  }

  public Double getMaxAtmospheringSpeed() {
    return maxAtmospheringSpeed;
  }

  public Double getCargoCapacity() {
    return cargoCapacity;
  }

  public String getConsumables() {
    return consumables;
  }

  public int getCrew() {
    return crew;
  }

  public List<People> getPassenger() {
    return passenger;
  }
}
