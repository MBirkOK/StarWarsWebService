package de.openknowledge.ausbildung.mbi.starwars.domain.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

import de.openknowledge.ausbildung.mbi.starwars.application.values.FilmValue;

@Entity(name = "tab_starwars_film")
public class Film {
  @Id
  private int episodeId;

  private String title;

  private String openingCrawl;
  private String director;
  private LocalDate releaseDate;
  private LocalDate created;
  private LocalDate edited;

  public Film() {
    //for JPA
  }

  public Film(int episodeId, String title, String openingCrawl, String director, LocalDate releaseDate,
    LocalDate created, LocalDate edited) {
    this.episodeId = episodeId;
    this.title = title;
    this.openingCrawl = openingCrawl;
    this.director = director;
    this.releaseDate = releaseDate;
    this.created = created;
    this.edited = edited;
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


  public static FilmValue of(Film film) {
    return new FilmValue(film.getTitle(), film.getEpisodeId(), film.getOpeningCrawl(),
      film.getDirector(), film.getReleaseDate().toString(), convertToDateViaInstant(film.getCreated()),
      convertToDateViaInstant(film.getEdited()));
  }

  private static Date convertToDateViaInstant(LocalDate dateToConvert) {
    return Date.from(dateToConvert.atStartOfDay(ZoneId.systemDefault()).toInstant());
  }
}
