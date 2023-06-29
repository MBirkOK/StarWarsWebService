package de.openknowledge.ausbildung.mbi.starwars.application.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import de.openknowledge.ausbildung.mbi.starwars.application.values.MovieValue;
import de.openknowledge.ausbildung.mbi.starwars.domain.exceptions.NotFoundException;
import de.openknowledge.ausbildung.mbi.starwars.domain.services.MovieService;

@RestController
@RequestMapping(path = "/film")
@CrossOrigin(origins = "http://localhost:3000")
public class MovieController {
  @Inject
  private MovieService movieService;

  static class FilmHolder {
    private MovieValue fields;
    private String model;
    private int pk;

    public FilmHolder(MovieValue fields, String model, int pk) {
      this.fields = fields;
      this.model = model;
      this.pk = pk;
    }

    public MovieValue getFields() {
      return fields;
    }

    public int getPk() {
      return pk;
    }
  }


  @GetMapping(path = "/get/{id}")
  public MovieValue getFilmById(@PathVariable String id) throws NotFoundException {
    return this.movieService.findFilmById(id);
  }

  @GetMapping
  public List<MovieValue> getAllFilm(){
    return this.movieService.findAllFilm();
  }

  @PostMapping(path = "/create")
  public int createFilm(@RequestBody FilmHolder filmHolder) throws NotFoundException {
    return this.movieService.createFilm(filmHolder.getFields());
  }

  @DeleteMapping(path = "/delete/{id}")
  public void deleteFilm(@RequestParam String id) {
    this.movieService.deleteFilm(id);
  }

  @PostMapping(path = "/masscreate")
  public void massCreate(@RequestBody List<FilmHolder> filmHolders) throws NotFoundException {
    for(FilmHolder filmHolder: filmHolders){
      this.createFilm(filmHolder);
    }
  }
}
