package de.openknowlede.ausbildung.mbi.starwars.domain.exceptions;

public class FilmNotFoundException extends Exception{

    public FilmNotFoundException(String message) {
        super(message);
    }
}
