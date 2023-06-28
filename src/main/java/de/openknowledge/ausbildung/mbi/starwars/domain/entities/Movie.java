package de.openknowledge.ausbildung.mbi.starwars.domain.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import de.openknowledge.ausbildung.mbi.starwars.application.values.MovieValue;

@Entity(name = "tab_starwars_movie")
public class Movie {
  @Id
  @Column(name = "episodeid")
  private int episodeId;

  private String title;

  @Column(name = "openingcrawl")
  private String openingCrawl;
  private String director;
  @Column(name = "releasedate")
  private LocalDate releaseDate;
  private LocalDate created;
  private LocalDate edited;

  @ManyToMany(cascade = CascadeType.ALL)
  @JoinTable(name = "tab_starwars_movie_people",
    joinColumns = {
      @JoinColumn(name = "film_id")
    },
    inverseJoinColumns = {
      @JoinColumn(name = "people_id")
    })
  private List<People> characters;

  @ManyToMany
  @JoinTable(name = "tab_starwars_movie_planet",
    joinColumns = {
      @JoinColumn(name = "film_id")
    },
    inverseJoinColumns = {
      @JoinColumn(name = "planet_id")
    })
  private List<Planet> planets;

  @ManyToMany
  @JoinTable(name = "tab_starwars_movie_species",
    joinColumns = {
      @JoinColumn(name = "film_id")
    },
    inverseJoinColumns = {
      @JoinColumn(name = "species_id")
    })
  private List<Species> species;
  @ManyToMany
  @JoinTable(name = "tab_starwars_movie_starship",
    joinColumns = {
      @JoinColumn(name = "film_id")
    },
    inverseJoinColumns = {
      @JoinColumn(name = "vehicle_id")
    })
  private List<Starship> starships;

  @ManyToMany
  @JoinTable(name = "tab_starwars_movie_vehicle",
    joinColumns = {
      @JoinColumn(name = "film_id")
    },
    inverseJoinColumns = {
      @JoinColumn(name = "vehicle_id")
    })
  private List<Vehicle> vehicles;

  private String producer;

  public Movie() {
    //for JPA
  }

  public Movie(int episodeId, String title, String openingCrawl, String director, LocalDate releaseDate,
               LocalDate created, LocalDate edited, List<People> characters, List<Planet> planets, List<Species> species,
               List<Starship> starships, List<Vehicle> vehicles, String producer) {
    this.episodeId = episodeId;
    this.title = title;
    this.openingCrawl = openingCrawl;
    this.director = director;
    this.releaseDate = releaseDate;
    this.created = created;
    this.edited = edited;
    this.characters = characters;
    this.planets = planets;
    this.species = species;
    this.starships = starships;
    this.vehicles = vehicles;
    this.producer = producer;
  }

  public int getEpisodeId() {
    return episodeId;
  }

  public String getTitle() {
    return title;
  }

  public String getOpeningCrawl() {
    return openingCrawl;
  }

  public String getDirector() {
    return director;
  }

  public LocalDate getReleaseDate() {
    return releaseDate;
  }

  public LocalDate getCreated() {
    return created;
  }

  public LocalDate getEdited() {
    return edited;
  }

  public List<People> getCharacters() {
    return characters;
  }

  public List<Planet> getPlanets() {
    return planets;
  }

  public List<Species> getSpecies() {
    return species;
  }

  public List<Starship> getStarships() {
    return starships;
  }

  public List<Vehicle> getVehicles() {
    return vehicles;
  }

  public String getProducer() {
    return producer;
  }

  public static MovieValue of(Movie movie) {
    return new MovieValue(movie.getTitle(), movie.getEpisodeId(), movie.getOpeningCrawl(), movie.getDirector(), movie.getProducer(),
      convertToDateViaInstant(movie.getReleaseDate()).toString(), convertToDateViaInstant(movie.getCreated()),
      convertToDateViaInstant(movie.getEdited()), Collections.singletonList(movie.getCharacters()),
      Collections.singletonList(movie.getPlanets()), Collections.singletonList(movie.getStarships()),
      Collections.singletonList(movie.getVehicles()), Collections.singletonList(movie.getSpecies())
      );
  }


  private static Date convertToDateViaInstant(LocalDate dateToConvert) {
    return Date.from(dateToConvert.atStartOfDay(ZoneId.systemDefault()).toInstant());
  }
}
