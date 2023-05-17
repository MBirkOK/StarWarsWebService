CREATE TABLE tab_starwars_film_people_join
(
    film_id   int,
    people_id uuid,
    FOREIGN KEY (film_id) REFERENCES tab_starwars_film (episodeId),
    FOREIGN KEY (people_id) REFERENCES tab_starwars_characters (id),
    PRIMARY KEY (film_id, people_id)
);

CREATE TABLE tab_starwars_film_planet_join
(
    planet_id int,
    film_id   int,
    FOREIGN KEY (film_id) REFERENCES tab_starwars_film (episodeId),
    FOREIGN KEY (planet_id) REFERENCES tab_starwars_planet (id),
    PRIMARY KEY (planet_id, film_id)
);

CREATE TABLE tab_starwars_film_starship_join
(
    vehicle_id uuid,
    film_id    int,
    FOREIGN KEY (film_id) REFERENCES tab_starwars_film (episodeId),
    PRIMARY KEY (vehicle_id, film_id)
);

CREATE TABLE tab_starwars_film_vehicle_join
(
    vehicle_id uuid,
    film_id    int,
    FOREIGN KEY (film_id) REFERENCES tab_starwars_film (episodeId),
    PRIMARY KEY (vehicle_id, film_id)
);

CREATE TABLE tab_starwars_film_species_join
(
    species_id uuid,
    film_id    int,
    FOREIGN KEY (film_id) REFERENCES tab_starwars_film (episodeId),
    PRIMARY KEY (species_id, film_id)
);