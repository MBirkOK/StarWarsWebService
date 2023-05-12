package de.openknowledge.ausbildung.mbi.starwars.application.values;

import java.net.URI;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import de.openknowledge.ausbildung.mbi.starwars.domain.entities.Film;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
  "title",
  "episode_id",
  "opening_crawl",
  "director",
  "producer",
  "release_date",
  "characters",
  "planets",
  "starships",
  "vehicles",
  "species",
  "url",
  "created",
  "edited"
})
public class FilmValue {

  /**
   * The title of this film.
   * (Required)
   */
  @JsonProperty("title")
  @JsonPropertyDescription("The title of this film.")
  private String title;
  /**
   * The episode number of this film.
   * (Required)
   */
  @JsonProperty("episode_id")
  @JsonPropertyDescription("The episode number of this film.")
  private Integer episodeId;
  /**
   * The opening crawl text at the beginning of this film.
   * (Required)
   */
  @JsonProperty("opening_crawl")
  @JsonPropertyDescription("The opening crawl text at the beginning of this film.")
  private String openingCrawl;
  /**
   * The director of this film.
   * (Required)
   */
  @JsonProperty("director")
  @JsonPropertyDescription("The director of this film.")
  private String director;
  /**
   * The producer(s) of this film.
   * (Required)
   */
  @JsonProperty("producer")
  @JsonPropertyDescription("The producer(s) of this film.")
  private String producer;
  /**
   * The release date at original creator country.
   * (Required)
   */
  @JsonProperty("release_date")
  @JsonPropertyDescription("The release date at original creator country.")
  private String releaseDate;
  /**
   * The people resources featured within this film.
   * (Required)
   */
  @JsonProperty("characters")
  @JsonPropertyDescription("The people resources featured within this film.")
  private List<Object> characters;
  /**
   * The planet resources featured within this film.
   * (Required)
   */
  @JsonProperty("planets")
  @JsonPropertyDescription("The planet resources featured within this film.")
  private List<Object> planets;
  /**
   * The starship resources featured within this film.
   * (Required)
   */
  @JsonProperty("starships")
  @JsonPropertyDescription("The starship resources featured within this film.")
  private List<Object> starships;
  /**
   * The vehicle resources featured within this film.
   * (Required)
   */
  @JsonProperty("vehicles")
  @JsonPropertyDescription("The vehicle resources featured within this film.")
  private List<Object> vehicles;
  /**
   * The species resources featured within this film.
   * (Required)
   */
  @JsonProperty("species")
  @JsonPropertyDescription("The species resources featured within this film.")
  private List<Object> species;
  /**
   * The url of this resource
   * (Required)
   */
  @JsonProperty("url")
  @JsonPropertyDescription("The url of this resource")
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


  public FilmValue(String title, Integer episodeId, String openingCrawl, String director, String releaseDate, Date created, Date edited) {
    this.title = title;
    this.episodeId = episodeId;
    this.openingCrawl = openingCrawl;
    this.director = director;
    this.releaseDate = releaseDate;
    this.created = created;
    this.edited = edited;
  }

  /**
   * The title of this film.
   * (Required)
   */
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  /**
   * The title of this film.
   * (Required)
   */
  @JsonProperty("title")
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * The episode number of this film.
   * (Required)
   */
  @JsonProperty("episode_id")
  public Integer getEpisodeId() {
    return episodeId;
  }

  /**
   * The episode number of this film.
   * (Required)
   */
  @JsonProperty("episode_id")
  public void setEpisodeId(Integer episodeId) {
    this.episodeId = episodeId;
  }

  /**
   * The opening crawl text at the beginning of this film.
   * (Required)
   */
  @JsonProperty("opening_crawl")
  public String getOpeningCrawl() {
    return openingCrawl;
  }

  /**
   * The opening crawl text at the beginning of this film.
   * (Required)
   */
  @JsonProperty("opening_crawl")
  public void setOpeningCrawl(String openingCrawl) {
    this.openingCrawl = openingCrawl;
  }

  /**
   * The director of this film.
   * (Required)
   */
  @JsonProperty("director")
  public String getDirector() {
    return director;
  }

  /**
   * The director of this film.
   * (Required)
   */
  @JsonProperty("director")
  public void setDirector(String director) {
    this.director = director;
  }

  /**
   * The producer(s) of this film.
   * (Required)
   */
  @JsonProperty("producer")
  public String getProducer() {
    return producer;
  }

  /**
   * The producer(s) of this film.
   * (Required)
   */
  @JsonProperty("producer")
  public void setProducer(String producer) {
    this.producer = producer;
  }

  /**
   * The release date at original creator country.
   * (Required)
   */
  @JsonProperty("release_date")
  public String getReleaseDate() {
    return releaseDate;
  }

  /**
   * The release date at original creator country.
   * (Required)
   */
  @JsonProperty("release_date")
  public void setReleaseDate(String releaseDate) {
    this.releaseDate = releaseDate;
  }

  /**
   * The people resources featured within this film.
   * (Required)
   */
  @JsonProperty("characters")
  public List<Object> getCharacters() {
    return characters;
  }

  /**
   * The people resources featured within this film.
   * (Required)
   */
  @JsonProperty("characters")
  public void setCharacters(List<Object> characters) {
    this.characters = characters;
  }

  /**
   * The planet resources featured within this film.
   * (Required)
   */
  @JsonProperty("planets")
  public List<Object> getPlanets() {
    return planets;
  }

  /**
   * The planet resources featured within this film.
   * (Required)
   */
  @JsonProperty("planets")
  public void setPlanets(List<Object> planets) {
    this.planets = planets;
  }

  /**
   * The starship resources featured within this film.
   * (Required)
   */
  @JsonProperty("starships")
  public List<Object> getStarships() {
    return starships;
  }

  /**
   * The starship resources featured within this film.
   * (Required)
   */
  @JsonProperty("starships")
  public void setStarships(List<Object> starships) {
    this.starships = starships;
  }

  /**
   * The vehicle resources featured within this film.
   * (Required)
   */
  @JsonProperty("vehicles")
  public List<Object> getVehicles() {
    return vehicles;
  }

  /**
   * The vehicle resources featured within this film.
   * (Required)
   */
  @JsonProperty("vehicles")
  public void setVehicles(List<Object> vehicles) {
    this.vehicles = vehicles;
  }

  /**
   * The species resources featured within this film.
   * (Required)
   */
  @JsonProperty("species")
  public List<Object> getSpecies() {
    return species;
  }

  /**
   * The species resources featured within this film.
   * (Required)
   */
  @JsonProperty("species")
  public void setSpecies(List<Object> species) {
    this.species = species;
  }

  /**
   * The url of this resource
   * (Required)
   */
  @JsonProperty("url")
  public URI getUrl() {
    return url;
  }

  /**
   * The url of this resource
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

  public static Film of(FilmValue filmValue) {
    return new Film(filmValue.getEpisodeId(), filmValue.getTitle(), filmValue.getOpeningCrawl(),
      filmValue.getDirector(), LocalDate.parse(filmValue.getReleaseDate()), convertToLocalDateViaInstant(filmValue.getCreated()),
      convertToLocalDateViaInstant(filmValue.getEdited()));
  }

  private static LocalDate convertToLocalDateViaInstant(Date dateToConvert) {
    return dateToConvert.toInstant()
      .atZone(ZoneId.systemDefault())
      .toLocalDate();
  }

}
