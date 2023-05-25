CREATE TABLE tab_starwars_vehicle(
    id int PRIMARY KEY,
    vehicle_name varchar,
    model varchar,
    manufacturer varchar,
    cost_in_credits double precision,
    length double precision,
    max_atmosphering_speed double precision,
    crew int,
    passengers int,
    cargo_capacity double precision,
    consumables varchar,
    vehicle_class varchar
);


CREATE TABLE tab_starwars_vehicle_pilots
(
    vehicle_id int,
    people_id   int,
    PRIMARY KEY (vehicle_id, people_id),
    FOREIGN KEY (vehicle_id) REFERENCES tab_starwars_vehicle (id),
    FOREIGN KEY (people_id) REFERENCES tab_starwars_characters (id)
);


CREATE TABLE tab_starwars_film_vehicle
(
    vehicle_id int,
    film_id    int,
    FOREIGN KEY (film_id) REFERENCES tab_starwars_film (episodeId),
    PRIMARY KEY (vehicle_id, film_id)
);