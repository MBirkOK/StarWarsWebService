package de.openknowledge.ausbildung.mbi.starwars.domain.services;

import java.util.Optional;

import javax.inject.Inject;

import org.springframework.dao.DataAccessResourceFailureException;
import org.springframework.stereotype.Service;

import de.openknowledge.ausbildung.mbi.starwars.application.values.FilmValue;
import de.openknowledge.ausbildung.mbi.starwars.domain.entities.Film;
import de.openknowledge.ausbildung.mbi.starwars.domain.exceptions.NotFoundException;
import de.openknowledge.ausbildung.mbi.starwars.infrastructure.FilmRepository;

@Service
public class FilmService {

  @Inject
  private FilmRepository filmRepository;

  public int createFilm(FilmValue filmValue) {
    Film film = FilmValue.of(filmValue);
    try {
      this.filmRepository.save(film);
    } catch (Exception e) {
      throw new DataAccessResourceFailureException("Could not save film to database");
    }
    return film.getEpisodeId();
  }

  public FilmValue findFilmById(String id) throws NotFoundException {
    Optional<Film> filmOptional = this.filmRepository.findById(Integer.parseInt(id));
    if (filmOptional.isEmpty()) {
      throw new NotFoundException("Film not found");
    }
    return Film.of(filmOptional.get());
  }

  public void deleteFilm(String id) {
    this.filmRepository.deleteById(Integer.parseInt(id));
  }

}
