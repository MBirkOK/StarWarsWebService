package de.openknowledge.ausbildung.mbi.starwars.application.values;

import java.lang.reflect.Array;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.annotation.processing.Generated;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import de.openknowledge.ausbildung.mbi.starwars.domain.entities.People;
import de.openknowledge.ausbildung.mbi.starwars.domain.entities.Starship;


/**
 * Starships
 * <p>
 * A Starships
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
  "name",
  "model",
  "starship_class",
  "manufacturer",
  "cost_in_credits",
  "length",
  "crew",
  "passengers",
  "max_atmosphering_speed",
  "hyperdrive_rating",
  "MGLT",
  "cargo_capacity",
  "consumables",
  "films",
  "pilots",
  "url",
  "created",
  "edited"
})
@Generated("jsonschema2pojo")
public class StarshipValue {

  /**
   * The id of this person.
   * (Required)
   */
  @JsonProperty("id")
  @JsonPropertyDescription("The name of this person.")
  private int id;

  /**
   * The name of this starship. The common name, such as Death Star.
   * (Required)
   */
  @JsonProperty("name")
  @JsonPropertyDescription("The name of this starship. The common name, such as Death Star.")
  private String name;
  /**
   * The model or official name of this starship. Such as T-65 X-wing or DS-1 Orbital Battle Station.
   * (Required)
   */
  @JsonProperty("model")
  @JsonPropertyDescription("The model or official name of this starship. Such as T-65 X-wing or DS-1 Orbital Battle Station.")
  private String model;
  /**
   * The class of this starship, such as Starfighter or Deep Space Mobile Battlestation.
   * (Required)
   */
  @JsonProperty("starship_class")
  @JsonPropertyDescription("The class of this starship, such as Starfighter or Deep Space Mobile Battlestation.")
  private String starshipClass;
  /**
   * The manufacturer of this starship. Comma seperated if more than one.
   * (Required)
   */
  @JsonProperty("manufacturer")
  @JsonPropertyDescription("The manufacturer of this starship. Comma seperated if more than one.")
  private String manufacturer;
  /**
   * The cost of this starship new, in galactic credits.
   * (Required)
   */
  @JsonProperty("cost_in_credits")
  @JsonPropertyDescription("The cost of this starship new, in galactic credits.")
  private String costInCredits;
  /**
   * The length of this starship in meters.
   * (Required)
   */
  @JsonProperty("length")
  @JsonPropertyDescription("The length of this starship in meters.")
  private String length;
  /**
   * The number of personnel needed to run or pilot this starship.
   * (Required)
   */
  @JsonProperty("crew")
  @JsonPropertyDescription("The number of personnel needed to run or pilot this starship.")
  private String crew;
  /**
   * The number of non-essential people this starship can transport.
   * (Required)
   */
  @JsonProperty("passengers")
  @JsonPropertyDescription("The number of non-essential people this starship can transport.")
  private String passengers;
  /**
   * The maximum speed of this starship in atmosphere. n/a if this starship is incapable of atmosphering flight.
   * (Required)
   */
  @JsonProperty("max_atmosphering_speed")
  @JsonPropertyDescription("The maximum speed of this starship in atmosphere. n/a if this starship is incapable of atmosphering flight.")
  private String maxAtmospheringSpeed;
  /**
   * The class of this starships hyperdrive.
   * (Required)
   */
  @JsonProperty("hyperdrive_rating")
  @JsonPropertyDescription("The class of this starships hyperdrive.")
  private String hyperdriveRating;
  /**
   * The Maximum number of Megalights this starship can travel in a standard hour. A Megalight is a standard unit of
   * distance and has never been defined before within the Star Wars universe. This figure is only really useful for
   * measuring the difference in speed of starships. We can assume it is similar to AU, the distance between our
   * Sun (Sol) and Earth.
   * (Required)
   */
  @JsonProperty("MGLT")
  @JsonPropertyDescription("The Maximum number of Megalights this starship can travel in a standard hour. A Megalight "
    + "is a standard unit of distance and has never been defined before within the Star Wars universe. This figure is "
    + "only really useful for measuring the difference in speed of starships. We can assume it is similar to AU, the "
    + "distance between our Sun (Sol) and Earth.")
  private String mglt;
  /**
   * The maximum number of kilograms that this starship can transport.
   * (Required)
   */
  @JsonProperty("cargo_capacity")
  @JsonPropertyDescription("The maximum number of kilograms that this starship can transport.")
  private String cargoCapacity;
  /**
   * The maximum length of time that this starship can provide consumables for its entire crew without having to resupply.
   * (Required)
   */
  @JsonProperty("consumables")
  @JsonPropertyDescription("The maximum length of time that this starship can provide consumables for its entire crew "
    + "without having to resupply.")
  private String consumables;
  /**
   * An array of Film URL Resources that this starship has appeared in.
   * (Required)
   */
  @JsonProperty("films")
  @JsonPropertyDescription("An array of Film URL Resources that this starship has appeared in.")
  private List<Object> films;
  /**
   * An array of People URL Resources that this starship has been piloted by.
   * (Required)
   */
  @JsonProperty("pilots")
  @JsonPropertyDescription("An array of People URL Resources that this starship has been piloted by.")
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

  public StarshipValue(String starshipClass, String hyperdriveRating, String mglt, List<Object> pilots) {
    this.starshipClass = starshipClass;
    this.hyperdriveRating = hyperdriveRating;
    this.mglt = mglt;
    this.pilots = pilots;
  }

  public StarshipValue(Starship starship) {
    this.id= starship.getId();
    this.name = starship.getStarshipName();
    this.model = starship.getModel();
    this.starshipClass = starship.getStarshipClass();
    this.manufacturer = starship.getManufacturer();
    this.costInCredits = String.valueOf(starship.getCostInCredits());
    this.length = String.valueOf(starship.getLength());
    this.crew = String.valueOf(starship.getCrew());

    ArrayList<PeopleValue> peopleValues = new ArrayList<>();
    for(People people: starship.getPassenger()){
      peopleValues.add(PeopleValue.of(people));
    }

    this.passengers = String.valueOf(peopleValues.size());
    this.maxAtmospheringSpeed = String.valueOf(starship.getMaxAtmospheringSpeed());
    this.hyperdriveRating = String.valueOf(starship.getHyperdriveRating());
    this.mglt = starship.getMglt();
    this.cargoCapacity = String.valueOf(starship.getCargoCapacity());
    this.consumables = starship.getConsumables();
    this.films = new ArrayList<Object>();

    ArrayList<PeopleValue> pilotValues = new ArrayList<>();
    for(People people: starship.getPilots()){
      peopleValues.add(PeopleValue.of(people));
    }

    this.pilots = new ArrayList<>();
    //this.pilots = Collections.singletonList(pilotValues);
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  /**
   * The name of this starship. The common name, such as Death Star.
   * (Required)
   */
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
   * The name of this starship. The common name, such as Death Star.
   * (Required)
   */
  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
  }

  /**
   * The model or official name of this starship. Such as T-65 X-wing or DS-1 Orbital Battle Station.
   * (Required)
   */
  @JsonProperty("model")
  public String getModel() {
    return model;
  }

  /**
   * The model or official name of this starship. Such as T-65 X-wing or DS-1 Orbital Battle Station.
   * (Required)
   */
  @JsonProperty("model")
  public void setModel(String model) {
    this.model = model;
  }

  /**
   * The class of this starship, such as Starfighter or Deep Space Mobile Battlestation.
   * (Required)
   */
  @JsonProperty("starship_class")
  public String getStarshipClass() {
    return starshipClass;
  }

  /**
   * The class of this starship, such as Starfighter or Deep Space Mobile Battlestation.
   * (Required)
   */
  @JsonProperty("starship_class")
  public void setStarshipClass(String starshipClass) {
    this.starshipClass = starshipClass;
  }

  /**
   * The manufacturer of this starship. Comma seperated if more than one.
   * (Required)
   */
  @JsonProperty("manufacturer")
  public String getManufacturer() {
    return manufacturer;
  }

  /**
   * The manufacturer of this starship. Comma seperated if more than one.
   * (Required)
   */
  @JsonProperty("manufacturer")
  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }

  /**
   * The cost of this starship new, in galactic credits.
   * (Required)
   */
  @JsonProperty("cost_in_credits")
  public String getCostInCredits() {
    return costInCredits;
  }

  /**
   * The cost of this starship new, in galactic credits.
   * (Required)
   */
  @JsonProperty("cost_in_credits")
  public void setCostInCredits(String costInCredits) {
    this.costInCredits = costInCredits;
  }

  /**
   * The length of this starship in meters.
   * (Required)
   */
  @JsonProperty("length")
  public String getLength() {
    return length;
  }

  /**
   * The length of this starship in meters.
   * (Required)
   */
  @JsonProperty("length")
  public void setLength(String length) {
    this.length = length;
  }

  /**
   * The number of personnel needed to run or pilot this starship.
   * (Required)
   */
  @JsonProperty("crew")
  public String getCrew() {
    return crew;
  }

  /**
   * The number of personnel needed to run or pilot this starship.
   * (Required)
   */
  @JsonProperty("crew")
  public void setCrew(String crew) {
    this.crew = crew;
  }

  /**
   * The number of non-essential people this starship can transport.
   * (Required)
   */
  @JsonProperty("passengers")
  public String getPassengers() {
    return passengers;
  }

  /**
   * The number of non-essential people this starship can transport.
   * (Required)
   */
  @JsonProperty("passengers")
  public void setPassengers(String passengers) {
    this.passengers = passengers;
  }

  /**
   * The maximum speed of this starship in atmosphere. n/a if this starship is incapable of atmosphering flight.
   * (Required)
   */
  @JsonProperty("max_atmosphering_speed")
  public String getMaxAtmospheringSpeed() {
    return maxAtmospheringSpeed;
  }

  /**
   * The maximum speed of this starship in atmosphere. n/a if this starship is incapable of atmosphering flight.
   * (Required)
   */
  @JsonProperty("max_atmosphering_speed")
  public void setMaxAtmospheringSpeed(String maxAtmospheringSpeed) {
    this.maxAtmospheringSpeed = maxAtmospheringSpeed;
  }

  /**
   * The class of this starships hyperdrive.
   * (Required)
   */
  @JsonProperty("hyperdrive_rating")
  public String getHyperdriveRating() {
    return hyperdriveRating;
  }

  /**
   * The class of this starships hyperdrive.
   * (Required)
   */
  @JsonProperty("hyperdrive_rating")
  public void setHyperdriveRating(String hyperdriveRating) {
    this.hyperdriveRating = hyperdriveRating;
  }

  /**
   * The Maximum number of Megalights this starship can travel in a standard hour. A Megalight is a standard unit of distance and has never been defined before within the Star Wars universe. This figure is only really useful for measuring the difference in speed of starships. We can assume it is similar to AU, the distance between our Sun (Sol) and Earth.
   * (Required)
   */
  @JsonProperty("MGLT")
  public String getMglt() {
    return mglt;
  }

  /**
   * The Maximum number of Megalights this starship can travel in a standard hour. A Megalight is a standard unit of distance and has never been defined before within the Star Wars universe. This figure is only really useful for measuring the difference in speed of starships. We can assume it is similar to AU, the distance between our Sun (Sol) and Earth.
   * (Required)
   */
  @JsonProperty("MGLT")
  public void setMglt(String mglt) {
    this.mglt = mglt;
  }

  /**
   * The maximum number of kilograms that this starship can transport.
   * (Required)
   */
  @JsonProperty("cargo_capacity")
  public String getCargoCapacity() {
    return cargoCapacity;
  }

  /**
   * The maximum number of kilograms that this starship can transport.
   * (Required)
   */
  @JsonProperty("cargo_capacity")
  public void setCargoCapacity(String cargoCapacity) {
    this.cargoCapacity = cargoCapacity;
  }

  /**
   * The maximum length of time that this starship can provide consumables for its entire crew without having to resupply.
   * (Required)
   */
  @JsonProperty("consumables")
  public String getConsumables() {
    return consumables;
  }

  /**
   * The maximum length of time that this starship can provide consumables for its entire crew without having to resupply.
   * (Required)
   */
  @JsonProperty("consumables")
  public void setConsumables(String consumables) {
    this.consumables = consumables;
  }

  /**
   * An array of Film URL Resources that this starship has appeared in.
   * (Required)
   */
  @JsonProperty("films")
  public List<Object> getFilms() {
    return films;
  }

  /**
   * An array of Film URL Resources that this starship has appeared in.
   * (Required)
   */
  @JsonProperty("films")
  public void setFilms(List<Object> films) {
    this.films = films;
  }

  /**
   * An array of People URL Resources that this starship has been piloted by.
   * (Required)
   */
  @JsonProperty("pilots")
  public List<Integer> getPilots() {
    ArrayList<Integer> integerArrayList = new ArrayList<>();
    for(Object pilot: this.pilots){
      integerArrayList.add((Integer) pilot);
    }
    return integerArrayList;
  }

  /**
   * An array of People URL Resources that this starship has been piloted by.
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

}
