package de.openknowlede.ausbildung.mbi.starwars;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.openknowlede.ausbildung.mbi.starwars.domain.services.FilmService;

@SpringBootApplication
public class StarWarsApplication {

    public static void main(String[] args) {
        SpringApplication.run(StarWarsApplication.class, args);
    }

}
