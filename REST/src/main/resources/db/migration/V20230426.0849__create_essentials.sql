CREATE TABLE tab_starwars_planet
(
    id               int PRIMARY KEY,
    planet_name      varchar,
    diameter         numeric,
    rotationDuration numeric,
    gravity          varchar,
    climate          varchar,
    terrain          varchar,
    surface_water    double precision,
    orbital          varchar,
    population       varchar
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
    id         int PRIMARY KEY,
    given_name varchar,
    height     double precision,
    mass       numeric,
    haircolor  varchar,
    skinColor  varchar,
    eyeColor   varchar,
    birthday   varchar,
    gender     varchar,
    homeworld  int,
    FOREIGN KEY (homeworld) REFERENCES tab_starwars_planet (id)
);