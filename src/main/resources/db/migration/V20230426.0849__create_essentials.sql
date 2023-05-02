CREATE TABLE tab_starwars_planet_terrain
(
    id      uuid PRIMARY KEY,
    terrain varchar
);


CREATE TABLE tab_starwars_planet
(
    id               uuid PRIMARY KEY,
    planet_name      varchar,
    diameter         numeric,
    rotationDuration time,
    gravity          numeric,
    climate          double precision,
    surface_water    double precision
);



CREATE TABLE tab_starwars_film
(
    title        varchar,
    episodeId    int PRIMARY KEY,
    openingCrawl text,
    director     varchar,
    releaseDate  date,
    created      date,
    edited       date
);

CREATE TABLE tab_starwars_characters
(
    id         uuid PRIMARY KEY,
    given_name varchar,
    height     double precision,
    mass       numeric,
    haircolor  varchar,
    skinColor  varchar,
    eyeColor   varchar,
    birthday   date,
    gender     varchar,
    homeworld  uuid,
    FOREIGN KEY (homeworld) REFERENCES tab_starwars_planet (id)
);