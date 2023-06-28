CREATE TABLE tab_starwars_starship_passenger
(
    starship_id int,
    people_id   int,
    PRIMARY KEY (starship_id, people_id),
    FOREIGN KEY (starship_id) REFERENCES tab_starwars_starship (id),
    FOREIGN KEY (people_id) REFERENCES tab_starwars_characters (id)
);