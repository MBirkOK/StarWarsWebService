package de.openknowledge.ausbildung.mbi.starwars.domain.services;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import javax.inject.Inject;

import org.springframework.dao.DataAccessResourceFailureException;
import org.springframework.stereotype.Service;

import de.openknowledge.ausbildung.mbi.starwars.application.values.MovieValue;
import de.openknowledge.ausbildung.mbi.starwars.domain.entities.Movie;
import de.openknowledge.ausbildung.mbi.starwars.domain.entities.People;
import de.openknowledge.ausbildung.mbi.starwars.domain.entities.Planet;
import de.openknowledge.ausbildung.mbi.starwars.domain.entities.Species;
import de.openknowledge.ausbildung.mbi.starwars.domain.entities.Starship;
import de.openknowledge.ausbildung.mbi.starwars.domain.entities.Vehicle;
import de.openknowledge.ausbildung.mbi.starwars.domain.exceptions.NotFoundException;
import de.openknowledge.ausbildung.mbi.starwars.infrastructure.MovieRepository;

@Service
public class MovieService {

  @Inject
  private MovieRepository filmRepository;

  @Inject
  private PeopleService peopleService;

  @Inject
  private PlanetService planetService;

  @Inject
  private SpeciesService speciesService;

  @Inject
  private StarshipService starshipService;

  @Inject
  private VehicleService vehicleService;

  public int createFilm(MovieValue movieValue) {

    List<People> peopleList = new ArrayList<>();
    for (Object object : movieValue.getCharacters()) {
      peopleList.add(this.peopleService.findCharacterById((int) object));
    }
    List<Planet> planets = new ArrayList<>();
    for (Object object : movieValue.getPlanets()) {
      planets.add(this.planetService.findPlanetById((int) object));
    }
    List<Species> species = new ArrayList<>();
    for (Object object : movieValue.getSpecies()) {
      species.add(this.speciesService.findSpecies(String.valueOf((int) object)));
    }
    List<Starship> starships = new ArrayList<>();
    for (Object object : movieValue.getStarships()) {
      starships.add(this.starshipService.findStarshipById((int) object));
    }
    List<Vehicle> vehicles = new ArrayList<>();
    for (Object object : movieValue.getVehicles()) {
      vehicles.add(this.vehicleService.findVehicleById((int) object));
    }
    Movie movie = MovieValue.of(movieValue, peopleList, planets, species, starships, vehicles);
    try {
      this.filmRepository.save(movie);
    } catch (Exception e) {
      throw new DataAccessResourceFailureException("Could not save film to database");
    }
    return movie.getEpisodeId();
  }

  public MovieValue findFilmById(String id) throws NotFoundException {

    try{
      Optional<Movie> filmOptional = this.filmRepository.findById(Integer.parseInt(id));
      return Movie.of(filmOptional.get());
    } catch(NoSuchElementException e) {
      throw new NotFoundException("Film not found");
    }
  }

  public List<MovieValue> findAllFilm() {
    List<MovieValue> movieValues = new ArrayList<>();
    this.filmRepository.findAll().forEach(movie -> movieValues.add(Movie.of(movie)));
    return movieValues;
  }

  public void deleteFilm(String id) {
    this.filmRepository.deleteById(Integer.parseInt(id));
  }

}
