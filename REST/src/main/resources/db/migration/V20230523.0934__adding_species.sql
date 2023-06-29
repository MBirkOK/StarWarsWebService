CREATE TABLE tab_starwars_species
(
    id               int PRIMARY KEY,
    species_name     varchar,
    classification varchar,
    designation      varchar,
    average_height   double precision,
    average_lifespan int,
    hair_colors      varchar,
    skin_colors      varchar,
    eye_colors       varchar,
    language         varchar,
    homeworld  int,
    FOREIGN KEY (homeworld) REFERENCES tab_starwars_planet (id)
);

ALTER TABLE tab_starwars_film_species ADD FOREIGN KEY (species_id) REFERENCES tab_starwars_species(id);

CREATE TABLE tab_starwars_species_people
(
    species_id int,
    people_id   int,
    PRIMARY KEY (species_id, people_id),
    FOREIGN KEY (species_id) REFERENCES tab_starwars_species (id),
    FOREIGN KEY (people_id) REFERENCES tab_starwars_characters (id)
);

CREATE TABLE tab_starwars_species_planet
(
    species_id int,
    planet_id   int,
    PRIMARY KEY (species_id, planet_id),
    FOREIGN KEY (species_id) REFERENCES tab_starwars_species (id),
    FOREIGN KEY (planet_id) REFERENCES tab_starwars_planet (id)
);