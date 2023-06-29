CREATE TABLE tab_starwars_starship
(
    starship_name varchar,
    model varchar,
    manufacturer varchar,
    cost_in_credits double precision,
    length double precision,
    max_atmosphering_speed double precision,
    cargo_capacity double precision,
    consumables varchar,
    id                int PRIMARY KEY,
    mglt              varchar,
    hyperdrive_rating double precision,
    starship_class    varchar,
    crew int,
    passengers int
);

CREATE TABLE tab_starwars_film_starship
(
    vehicle_id int,
    film_id    int,
    FOREIGN KEY (film_id) REFERENCES tab_starwars_film (episodeId),
    FOREIGN KEY (vehicle_id) REFERENCES tab_starwars_starship (id),
    PRIMARY KEY (vehicle_id, film_id)
);

CREATE TABLE tab_starwars_starship_pilots
(
    starship_id int,
    people_id   int,
    PRIMARY KEY (starship_id, people_id),
    FOREIGN KEY (starship_id) REFERENCES tab_starwars_starship (id),
    FOREIGN KEY (people_id) REFERENCES tab_starwars_characters (id)
);

