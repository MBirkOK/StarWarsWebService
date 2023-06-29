CREATE TABLE tab_starwars_film_people
(
    film_id   int,
    people_id int,
    FOREIGN KEY (film_id) REFERENCES tab_starwars_film (episodeId),
    FOREIGN KEY (people_id) REFERENCES tab_starwars_characters (id),
    PRIMARY KEY (film_id, people_id)
);

CREATE TABLE tab_starwars_film_planet
(
    planet_id int,
    film_id   int,
    FOREIGN KEY (film_id) REFERENCES tab_starwars_film (episodeId),
    FOREIGN KEY (planet_id) REFERENCES tab_starwars_planet (id),
    PRIMARY KEY (planet_id, film_id)
);


CREATE TABLE tab_starwars_film_species
(
    species_id int,
    film_id    int,
    FOREIGN KEY (film_id) REFERENCES tab_starwars_film (episodeId),
    PRIMARY KEY (species_id, film_id)
);