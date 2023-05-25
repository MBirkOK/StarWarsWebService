package de.openknowledge.ausbildung.mbi.starwars.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToMany;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;

import de.openknowledge.ausbildung.mbi.starwars.application.values.VehicleValue;

@Entity(name = "tab_starwars_vehicle")
public class Vehicle {

  @Id
  @Value("${some.key:0}")
  private int id;

  @Column
  private String vehicleName;

  @Column
  private String model;

  @Column
  private String manufacturer;

  @Column
  @Value("${some.key:0.0}")
  private Double costInCredits;

  @Column
  @Value("${some.key:0.0}")
  private Double length;

  @Column
  @Value("${some.key:0.0}")
  private Double maxAtmospheringSpeed;

  @Column
  @Value("${some.key:0.0}")
  private int crew;

  @Column
  @Value("${some.key:0.0}")
  private int passengers;

  @Column
  @Value("${some.key:0.0}")
  private Double cargoCapacity;

  @Column
  private String consumables;

  @Column
  private String vehicleClass;

  @OneToMany
  @JoinTable(name = "tab_starwars_vehicle_pilots",
    joinColumns = {
      @JoinColumn(name = "vehicle_id")
    },
    inverseJoinColumns = {
      @JoinColumn(name = "people_id")
    })
  private List<People> pilots;

  public Vehicle(int id, String vehicleName, String model, String manufacturer, Double costInCredits, Double length,
                 Double maxAtmospheringSpeed, int crew, int passengers, Double cargoCapacity, String consumables,
                 String vehicleClass, List<People> pilots) {
    this.id = id;
    this.vehicleName = vehicleName;
    this.model = model;
    this.manufacturer = manufacturer;
    this.costInCredits = costInCredits;
    this.length = length;
    this.pilots = pilots;
    this.maxAtmospheringSpeed = maxAtmospheringSpeed;
    this.crew = crew;
    this.passengers = passengers;
    this.cargoCapacity = cargoCapacity;
    this.consumables = consumables;
    this.vehicleClass = vehicleClass;
  }

  public Vehicle(VehicleValue vehicleValue, List<People> pilots, int id) {
    this.id = id;
    this.pilots = pilots;
    this.vehicleName = vehicleValue.getName().orElse(null);
    this.model = vehicleValue.getModel().orElse(null);
    this.manufacturer = vehicleValue.getManufacturer().orElse(null);
    this.costInCredits = Double.valueOf(vehicleValue.getCostInCredits().orElse("0.0"));
    this.length = Double.valueOf(vehicleValue.getLength().orElse("0.0"));
    this.maxAtmospheringSpeed = Double.valueOf(vehicleValue.getMaxAtmospheringSpeed().orElse("0.0"));
    this.crew = Integer.parseInt(vehicleValue.getCrew().orElse("0"));
    this.passengers = Integer.parseInt(vehicleValue.getPassengers().orElse("0"));
    this.cargoCapacity = Double.valueOf(vehicleValue.getCargoCapacity().orElse("0.0"));
    this.consumables = vehicleValue.getConsumables().orElse(null);
    this.vehicleClass = vehicleValue.getVehicleClass().orElse(null);
  }

  public Vehicle() {
    //for JPA
  }

  public int getId() {
    return id;
  }

  public String getVehicleName() {
    return vehicleName;
  }

  public String getModel() {
    return model;
  }

  public String getManufacturer() {
    return manufacturer;
  }

  public Double getCostInCredits() {
    return costInCredits;
  }

  public Double getLength() {
    return length;
  }

  public Double getMaxAtmospheringSpeed() {
    return maxAtmospheringSpeed;
  }

  public int getCrew() {
    return crew;
  }

  public int getPassengers() {
    return passengers;
  }

  public Double getCargoCapacity() {
    return cargoCapacity;
  }

  public String getConsumables() {
    return consumables;
  }

  public String getVehicleClass() {
    return vehicleClass;
  }

  public List<People> getPilots() {
    return pilots;
  }
}
