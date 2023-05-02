package de.openknowlede.ausbildung.mbi.starwars.infrastructure;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import de.openknowlede.ausbildung.mbi.starwars.domain.entities.Film;

@Repository
public interface FilmRepository extends CrudRepository<Film, Integer> {
}
