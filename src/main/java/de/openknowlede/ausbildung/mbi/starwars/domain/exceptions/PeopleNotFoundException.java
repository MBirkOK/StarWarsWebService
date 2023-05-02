package de.openknowlede.ausbildung.mbi.starwars.domain.exceptions;

public class PeopleNotFoundException extends Exception{

    public PeopleNotFoundException(String message) {
        super(message);
    }
}
