package de.openknowledge.ausbildung.mbi.starwars.application.values;

import java.net.URI;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.annotation.processing.Generated;

import org.springframework.beans.factory.annotation.Value;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import de.openknowledge.ausbildung.mbi.starwars.domain.entities.Vehicle;


/**
 * Starship
 * <p>
 * A vehicle.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
  "name",
  "model",
  "vehicle_class",
  "manufacturer",
  "cost_in_credits",
  "length",
  "crew",
  "passengers",
  "max_atmosphering_speed",
  "cargo_capacity",
  "consumables",
  "films",
  "pilots",
  "url",
  "created",
  "edited"
})
@Generated("jsonschema2pojo")
public class VehicleValue {

  int id;

  /**
   * The name of this vehicle. The common name, such as Sand Crawler.
   * (Required)
   */
  @JsonProperty("name")
  @JsonPropertyDescription("The name of this vehicle. The common name, such as Sand Crawler.")
  private String name;
  /**
   * The model or official name of this vehicle. Such as All Terrain Attack Transport.
   * (Required)
   */
  @JsonProperty("model")
  @JsonPropertyDescription("The model or official name of this vehicle. Such as All Terrain Attack Transport.")
  private String model;
  /**
   * The class of this vehicle, such as Wheeled.
   * (Required)
   */
  @JsonProperty("vehicle_class")
  @JsonPropertyDescription("The class of this vehicle, such as Wheeled.")
  private String vehicleClass;
  /**
   * The manufacturer of this vehicle. Comma seperated if more than one.
   * (Required)
   */
  @JsonProperty("manufacturer")
  @JsonPropertyDescription("The manufacturer of this vehicle. Comma seperated if more than one.")
  private String manufacturer;
  /**
   * The cost of this vehicle new, in galactic credits.
   * (Required)
   */
  @JsonProperty("cost_in_credits")
  @JsonPropertyDescription("The cost of this vehicle new, in galactic credits.")
  @Value("${some.key:0.0}")
  private String costInCredits;
  /**
   * The length of this vehicle in meters.
   * (Required)
   */
  @JsonProperty("length")
  @JsonPropertyDescription("The length of this vehicle in meters.")
  private String length;
  /**
   * The number of personnel needed to run or pilot this vehicle.
   * (Required)
   */
  @JsonProperty("crew")
  @JsonPropertyDescription("The number of personnel needed to run or pilot this vehicle.")
  private String crew;
  /**
   * The number of non-essential people this vehicle can transport.
   * (Required)
   */
  @JsonProperty("passengers")
  @JsonPropertyDescription("The number of non-essential people this vehicle can transport.")
  private String passengers;
  /**
   * The maximum speed of this vehicle in atmosphere.
   * (Required)
   */
  @JsonProperty("max_atmosphering_speed")
  @JsonPropertyDescription("The maximum speed of this vehicle in atmosphere.")
  private String maxAtmospheringSpeed;
  /**
   * The maximum number of kilograms that this vehicle can transport.
   * (Required)
   */
  @JsonProperty("cargo_capacity")
  @JsonPropertyDescription("The maximum number of kilograms that this vehicle can transport.")
  private String cargoCapacity;
  /**
   * The maximum length of time that this vehicle can provide consumables for its entire crew without having to resupply.
   * (Required)
   */
  @JsonProperty("consumables")
  @JsonPropertyDescription("The maximum length of time that this vehicle can provide consumables for its entire "
    + "crew without having to resupply.")
  private String consumables;
  /**
   * An array of Film URL Resources that this vehicle has appeared in.
   * (Required)
   */
  @JsonProperty("films")
  @JsonPropertyDescription("An array of Film URL Resources that this vehicle has appeared in.")
  private List<Object> films;
  /**
   * An array of People URL Resources that this vehicle has been piloted by.
   * (Required)
   */
  @JsonProperty("pilots")
  @JsonPropertyDescription("An array of People URL Resources that this vehicle has been piloted by.")
  private List<Object> pilots;
  /**
   * The hypermedia URL of this resource.
   * (Required)
   */
  @JsonProperty("url")
  @JsonPropertyDescription("The hypermedia URL of this resource.")
  private URI url;
  /**
   * The ISO 8601 date format of the time that this resource was created.
   * (Required)
   */
  @JsonProperty("created")
  @JsonPropertyDescription("The ISO 8601 date format of the time that this resource was created.")
  private Date created;
  /**
   * the ISO 8601 date format of the time that this resource was edited.
   * (Required)
   */
  @JsonProperty("edited")
  @JsonPropertyDescription("the ISO 8601 date format of the time that this resource was edited.")
  private Date edited;
  @JsonIgnore
  private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

  public VehicleValue(int id, String name, String model, String vehicleClass, String manufacturer, String costInCredits,
                      String length, String crew, String passengers, String maxAtmospheringSpeed, String cargoCapacity,
                      String consumables, List<Object> pilots) {
    this.id = id;
    this.name = name;
    this.model = model;
    this.vehicleClass = vehicleClass;
    this.manufacturer = manufacturer;
    this.costInCredits = costInCredits;
    this.length = length;
    this.crew = crew;
    this.passengers = passengers;
    this.maxAtmospheringSpeed = maxAtmospheringSpeed;
    this.cargoCapacity = cargoCapacity;
    this.consumables = consumables;
    this.pilots = pilots;
  }

  /**
   * The name of this vehicle. The common name, such as Sand Crawler.
   * (Required)
   */
  @JsonProperty("name")
  public Optional<String> getName() {
    return Optional.ofNullable(name);
  }

  /**
   * The name of this vehicle. The common name, such as Sand Crawler.
   * (Required)
   */
  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
  }

  /**
   * The model or official name of this vehicle. Such as All Terrain Attack Transport.
   * (Required)
   */
  @JsonProperty("model")
  public Optional<String> getModel() {
    return Optional.ofNullable(model);
  }

  /**
   * The model or official name of this vehicle. Such as All Terrain Attack Transport.
   * (Required)
   */
  @JsonProperty("model")
  public void setModel(String model) {
    this.model = model;
  }

  /**
   * The class of this vehicle, such as Wheeled.
   * (Required)
   */
  @JsonProperty("vehicle_class")
  public Optional<String> getVehicleClass() {
    return Optional.ofNullable(vehicleClass);
  }

  /**
   * The class of this vehicle, such as Wheeled.
   * (Required)
   */
  @JsonProperty("vehicle_class")
  public void setVehicleClass(String vehicleClass) {
    this.vehicleClass = vehicleClass;
  }

  /**
   * The manufacturer of this vehicle. Comma seperated if more than one.
   * (Required)
   */
  @JsonProperty("manufacturer")
  public Optional<String> getManufacturer() {
    return Optional.ofNullable(manufacturer);
  }

  /**
   * The manufacturer of this vehicle. Comma seperated if more than one.
   * (Required)
   */
  @JsonProperty("manufacturer")
  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }

  /**
   * The cost of this vehicle new, in galactic credits.
   * (Required)
   */
  @JsonProperty("cost_in_credits")
  public Optional<String> getCostInCredits() {
    return Optional.ofNullable(costInCredits);
  }

  /**
   * The cost of this vehicle new, in galactic credits.
   * (Required)
   */
  @JsonProperty("cost_in_credits")
  public void setCostInCredits(String costInCredits) {
    this.costInCredits = costInCredits;
  }

  /**
   * The length of this vehicle in meters.
   * (Required)
   */
  @JsonProperty("length")
  public Optional<String> getLength() {
    return Optional.ofNullable(length);
  }

  /**
   * The length of this vehicle in meters.
   * (Required)
   */
  @JsonProperty("length")
  public void setLength(String length) {
    this.length = length;
  }

  /**
   * The number of personnel needed to run or pilot this vehicle.
   * (Required)
   */
  @JsonProperty("crew")
  public Optional<String> getCrew() {
    return Optional.ofNullable(crew);
  }

  /**
   * The number of personnel needed to run or pilot this vehicle.
   * (Required)
   */
  @JsonProperty("crew")
  public void setCrew(String crew) {
    this.crew = crew;
  }

  /**
   * The number of non-essential people this vehicle can transport.
   * (Required)
   */
  @JsonProperty("passengers")
  public Optional<String> getPassengers() {
    return Optional.ofNullable(passengers);
  }

  /**
   * The number of non-essential people this vehicle can transport.
   * (Required)
   */
  @JsonProperty("passengers")
  public void setPassengers(String passengers) {
    this.passengers = passengers;
  }

  /**
   * The maximum speed of this vehicle in atmosphere.
   * (Required)
   */
  @JsonProperty("max_atmosphering_speed")
  public Optional<String> getMaxAtmospheringSpeed() {
    return Optional.ofNullable(maxAtmospheringSpeed);
  }

  /**
   * The maximum speed of this vehicle in atmosphere.
   * (Required)
   */
  @JsonProperty("max_atmosphering_speed")
  public void setMaxAtmospheringSpeed(String maxAtmospheringSpeed) {
    this.maxAtmospheringSpeed = maxAtmospheringSpeed;
  }

  /**
   * The maximum number of kilograms that this vehicle can transport.
   * (Required)
   */
  @JsonProperty("cargo_capacity")
  public Optional<String> getCargoCapacity() {
    return Optional.ofNullable(cargoCapacity);
  }

  /**
   * The maximum number of kilograms that this vehicle can transport.
   * (Required)
   */
  @JsonProperty("cargo_capacity")
  public void setCargoCapacity(String cargoCapacity) {
    this.cargoCapacity = cargoCapacity;
  }

  /**
   * The maximum length of time that this vehicle can provide consumables for its entire crew without having to resupply.
   * (Required)
   */
  @JsonProperty("consumables")
  public Optional<String> getConsumables() {
    return Optional.ofNullable(consumables);
  }

  /**
   * The maximum length of time that this vehicle can provide consumables for its entire crew without having to resupply.
   * (Required)
   */
  @JsonProperty("consumables")
  public void setConsumables(String consumables) {
    this.consumables = consumables;
  }

  /**
   * An array of Film URL Resources that this vehicle has appeared in.
   * (Required)
   */
  @JsonProperty("films")
  public List<Object> getFilms() {
    return films;
  }

  /**
   * An array of Film URL Resources that this vehicle has appeared in.
   * (Required)
   */
  @JsonProperty("films")
  public void setFilms(List<Object> films) {
    this.films = films;
  }

  /**
   * An array of People URL Resources that this vehicle has been piloted by.
   * (Required)
   */
  @JsonProperty("pilots")
  public List<Object> getPilots() {
    return pilots;
  }

  /**
   * An array of People URL Resources that this vehicle has been piloted by.
   * (Required)
   */
  @JsonProperty("pilots")
  public void setPilots(List<Object> pilots) {
    this.pilots = pilots;
  }

  /**
   * The hypermedia URL of this resource.
   * (Required)
   */
  @JsonProperty("url")
  public URI getUrl() {
    return url;
  }

  /**
   * The hypermedia URL of this resource.
   * (Required)
   */
  @JsonProperty("url")
  public void setUrl(URI url) {
    this.url = url;
  }

  /**
   * The ISO 8601 date format of the time that this resource was created.
   * (Required)
   */
  @JsonProperty("created")
  public Date getCreated() {
    return created;
  }

  /**
   * The ISO 8601 date format of the time that this resource was created.
   * (Required)
   */
  @JsonProperty("created")
  public void setCreated(Date created) {
    this.created = created;
  }

  /**
   * the ISO 8601 date format of the time that this resource was edited.
   * (Required)
   */
  @JsonProperty("edited")
  public Date getEdited() {
    return edited;
  }

  /**
   * the ISO 8601 date format of the time that this resource was edited.
   * (Required)
   */
  @JsonProperty("edited")
  public void setEdited(Date edited) {
    this.edited = edited;
  }

  @JsonAnyGetter
  public Map<String, Object> getAdditionalProperties() {
    return this.additionalProperties;
  }

  @JsonAnySetter
  public void setAdditionalProperty(String name, Object value) {
    this.additionalProperties.put(name, value);
  }

  public static VehicleValue of(Vehicle vehicle){
    return new VehicleValue(vehicle.getId(), vehicle.getVehicleName(), vehicle.getModel(), vehicle.getVehicleClass(),
      vehicle.getManufacturer(), vehicle.getCostInCredits().toString(), vehicle.getLength().toString(),
      String.valueOf(vehicle.getCrew()), String.valueOf(vehicle.getPassengers()),
      String.valueOf(vehicle.getMaxAtmospheringSpeed()), String.valueOf(vehicle.getCargoCapacity()),
      vehicle.getConsumables(), Collections.singletonList(vehicle.getPilots()));
  }
}
