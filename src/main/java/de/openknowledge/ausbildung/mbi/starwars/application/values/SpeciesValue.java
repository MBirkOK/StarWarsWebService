package de.openknowledge.ausbildung.mbi.starwars.application.values;

import java.net.URI;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.processing.Generated;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * People
 * <p>
 * A species within the Star Wars universe
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
  "name",
  "classification",
  "designation",
  "average_height",
  "average_lifespan",
  "hair_colors",
  "skin_colors",
  "eye_colors",
  "homeworld",
  "language",
  "people",
  "films",
  "url",
  "created",
  "edited"
})
@Generated("jsonschema2pojo")
public class SpeciesValue {

  /**
   * The name of this species.
   * (Required)
   */
  @JsonProperty("name")
  @JsonPropertyDescription("The name of this species.")
  private String name;
  /**
   * The classification of this species.
   * (Required)
   */
  @JsonProperty("classification")
  @JsonPropertyDescription("The classification of this species.")
  private String classification;
  /**
   * The designation of this species.
   * (Required)
   */
  @JsonProperty("designation")
  @JsonPropertyDescription("The designation of this species.")
  private String designation;
  /**
   * The average height of this person in centimeters.
   * (Required)
   */
  @JsonProperty("average_height")
  @JsonPropertyDescription("The average height of this person in centimeters.")
  private String averageHeight;
  /**
   * The average lifespan of this species in years.
   * (Required)
   */
  @JsonProperty("average_lifespan")
  @JsonPropertyDescription("The average lifespan of this species in years.")
  private String averageLifespan;
  /**
   * A comma-seperated string of common hair colors for this species, none if this species does not typically have hair.
   * (Required)
   */
  @JsonProperty("hair_colors")
  @JsonPropertyDescription("A comma-seperated string of common hair colors for this species, none if this species does "
    + "not typically have hair.")
  private String hairColors;
  /**
   * A comma-seperated string of common skin colors for this species, none if this species does not typically have skin.
   * (Required)
   */
  @JsonProperty("skin_colors")
  @JsonPropertyDescription("A comma-seperated string of common skin colors for this species, none if this species does "
    + "not typically have skin.")
  private String skinColors;
  /**
   * A comma-seperated string of common eye colors for this species, none if this species does not typically have eyes.
   * (Required)
   */
  @JsonProperty("eye_colors")
  @JsonPropertyDescription("A comma-seperated string of common eye colors for this species, none if this species does "
    + "not typically have eyes.")
  private String eyeColors;
  /**
   * The URL of a planet resource, a planet that this species originates from.
   * (Required)
   */
  @JsonProperty("homeworld")
  @JsonPropertyDescription("The URL of a planet resource, a planet that this species originates from.")
  private String homeworld;
  /**
   * The language commonly spoken by this species.
   * (Required)
   */
  @JsonProperty("language")
  @JsonPropertyDescription("The language commonly spoken by this species.")
  private String language;
  /**
   * An array of People URL Resources that are a part of this species.
   * (Required)
   */
  @JsonProperty("people")
  @JsonPropertyDescription("An array of People URL Resources that are a part of this species.")
  private List<Object> people;
  /**
   * An array of Film URL Resources that this species has appeared in.
   * (Required)
   */
  @JsonProperty("films")
  @JsonPropertyDescription(" An array of Film URL Resources that this species has appeared in.")
  private List<Object> films;
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
   * The ISO 8601 date format of the time that this resource was edited.
   * (Required)
   */
  @JsonProperty("edited")
  @JsonPropertyDescription("The ISO 8601 date format of the time that this resource was edited.")
  private Date edited;
  @JsonIgnore
  private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

  /**
   * The name of this species.
   * (Required)
   */
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
   * The name of this species.
   * (Required)
   */
  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
  }

  /**
   * The classification of this species.
   * (Required)
   */
  @JsonProperty("classification")
  public String getClassification() {
    return classification;
  }

  /**
   * The classification of this species.
   * (Required)
   */
  @JsonProperty("classification")
  public void setClassification(String classification) {
    this.classification = classification;
  }

  /**
   * The designation of this species.
   * (Required)
   */
  @JsonProperty("designation")
  public String getDesignation() {
    return designation;
  }

  /**
   * The designation of this species.
   * (Required)
   */
  @JsonProperty("designation")
  public void setDesignation(String designation) {
    this.designation = designation;
  }

  /**
   * The average height of this person in centimeters.
   * (Required)
   */
  @JsonProperty("average_height")
  public String getAverageHeight() {
    return averageHeight;
  }

  /**
   * The average height of this person in centimeters.
   * (Required)
   */
  @JsonProperty("average_height")
  public void setAverageHeight(String averageHeight) {
    this.averageHeight = averageHeight;
  }

  /**
   * The average lifespan of this species in years.
   * (Required)
   */
  @JsonProperty("average_lifespan")
  public String getAverageLifespan() {
    return averageLifespan;
  }

  /**
   * The average lifespan of this species in years.
   * (Required)
   */
  @JsonProperty("average_lifespan")
  public void setAverageLifespan(String averageLifespan) {
    this.averageLifespan = averageLifespan;
  }

  /**
   * A comma-seperated string of common hair colors for this species, none if this species does not typically have hair.
   * (Required)
   */
  @JsonProperty("hair_colors")
  public String getHairColors() {
    return hairColors;
  }

  /**
   * A comma-seperated string of common hair colors for this species, none if this species does not typically have hair.
   * (Required)
   */
  @JsonProperty("hair_colors")
  public void setHairColors(String hairColors) {
    this.hairColors = hairColors;
  }

  /**
   * A comma-seperated string of common skin colors for this species, none if this species does not typically have skin.
   * (Required)
   */
  @JsonProperty("skin_colors")
  public String getSkinColors() {
    return skinColors;
  }

  /**
   * A comma-seperated string of common skin colors for this species, none if this species does not typically have skin.
   * (Required)
   */
  @JsonProperty("skin_colors")
  public void setSkinColors(String skinColors) {
    this.skinColors = skinColors;
  }

  /**
   * A comma-seperated string of common eye colors for this species, none if this species does not typically have eyes.
   * (Required)
   */
  @JsonProperty("eye_colors")
  public String getEyeColors() {
    return eyeColors;
  }

  /**
   * A comma-seperated string of common eye colors for this species, none if this species does not typically have eyes.
   * (Required)
   */
  @JsonProperty("eye_colors")
  public void setEyeColors(String eyeColors) {
    this.eyeColors = eyeColors;
  }

  /**
   * The URL of a planet resource, a planet that this species originates from.
   * (Required)
   */
  @JsonProperty("homeworld")
  public String getHomeworld() {
    return homeworld;
  }

  /**
   * The URL of a planet resource, a planet that this species originates from.
   * (Required)
   */
  @JsonProperty("homeworld")
  public void setHomeworld(String homeworld) {
    this.homeworld = homeworld;
  }

  /**
   * The language commonly spoken by this species.
   * (Required)
   */
  @JsonProperty("language")
  public String getLanguage() {
    return language;
  }

  /**
   * The language commonly spoken by this species.
   * (Required)
   */
  @JsonProperty("language")
  public void setLanguage(String language) {
    this.language = language;
  }

  /**
   * An array of People URL Resources that are a part of this species.
   * (Required)
   */
  @JsonProperty("people")
  public List<Object> getPeople() {
    return people;
  }

  /**
   * An array of People URL Resources that are a part of this species.
   * (Required)
   */
  @JsonProperty("people")
  public void setPeople(List<Object> people) {
    this.people = people;
  }

  /**
   * An array of Film URL Resources that this species has appeared in.
   * (Required)
   */
  @JsonProperty("films")
  public List<Object> getFilms() {
    return films;
  }

  /**
   * An array of Film URL Resources that this species has appeared in.
   * (Required)
   */
  @JsonProperty("films")
  public void setFilms(List<Object> films) {
    this.films = films;
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
   * The ISO 8601 date format of the time that this resource was edited.
   * (Required)
   */
  @JsonProperty("edited")
  public Date getEdited() {
    return edited;
  }

  /**
   * The ISO 8601 date format of the time that this resource was edited.
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
