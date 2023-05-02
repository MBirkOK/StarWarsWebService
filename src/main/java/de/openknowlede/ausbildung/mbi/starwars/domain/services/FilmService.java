package de.openknowlede.ausbildung.mbi.starwars.domain.services;

import org.springframework.stereotype.Service;

import java.util.Optional;
import javax.inject.Inject;

import de.openknowlede.ausbildung.mbi.starwars.application.values.FilmValue;
import de.openknowlede.ausbildung.mbi.starwars.domain.entities.Film;
import de.openknowlede.ausbildung.mbi.starwars.domain.exceptions.FilmNotFoundException;
import de.openknowlede.ausbildung.mbi.starwars.infrastructure.FilmRepository;

@Service
public class FilmService {

    @Inject
    private FilmRepository filmRepository;

    public int createFilm(FilmValue filmValue){
        Film film = FilmValue.of(filmValue);
        this.filmRepository.save(film);
        return film.getEpisodeId();
    }

    public FilmValue findFilmById(String id) throws FilmNotFoundException {
        Optional<Film> filmOptional = this.filmRepository.findById(Integer.parseInt(id));
        if(filmOptional.isEmpty()){
            throw new FilmNotFoundException("Film not found");
        }
        return Film.of(filmOptional.get());
    }

    public void deleteFilm(String id){
        this.filmRepository.deleteById(Integer.parseInt(id));
    }

}
