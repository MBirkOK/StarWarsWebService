package de.openknowlede.ausbildung.mbi.starwars.application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import javax.inject.Inject;

import de.openknowlede.ausbildung.mbi.starwars.application.values.FilmValue;
import de.openknowlede.ausbildung.mbi.starwars.domain.exceptions.FilmNotFoundException;
import de.openknowlede.ausbildung.mbi.starwars.domain.services.FilmService;

@Controller
public class FilmController {

    @Inject
    private FilmService filmService;

    @GetMapping
    public FilmValue getFilmById(@PathVariable String id) throws FilmNotFoundException {
        return this.filmService.findFilmById(id);
    }

    @PostMapping
    public int createFilm(@RequestBody FilmValue filmValue){
        return this.filmService.createFilm(filmValue);
    }

    @DeleteMapping
    public void deleteFilm(@RequestParam String id){
        this.filmService.deleteFilm(id);
    }


}
