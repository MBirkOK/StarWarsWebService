package de.openknowledge.ausbildung.mbi.starwars.application.controller;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import de.openknowledge.ausbildung.mbi.starwars.application.values.FilmValue;
import de.openknowledge.ausbildung.mbi.starwars.domain.exceptions.NotFoundException;
import de.openknowledge.ausbildung.mbi.starwars.domain.services.FilmService;

@RestController
@RequestMapping(path = "/film")
public class FilmController {
  @Inject
  private FilmService filmService;

  @GetMapping(path = "/get/{id}")
  public FilmValue getFilmById(@PathVariable String id) throws NotFoundException {
    return this.filmService.findFilmById(id);
  }

  @PostMapping(path = "/create")
  public int createFilm(@RequestBody FilmValue filmValue) {
    return this.filmService.createFilm(filmValue);
  }

  @DeleteMapping(path = "/delete/{id}")
  public void deleteFilm(@RequestParam String id) {
    this.filmService.deleteFilm(id);
  }


}
