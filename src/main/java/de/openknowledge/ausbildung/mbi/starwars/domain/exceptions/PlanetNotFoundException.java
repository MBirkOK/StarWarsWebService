package de.openknowledge.ausbildung.mbi.starwars.domain.exceptions;

public class PlanetNotFoundException extends Exception {

  public PlanetNotFoundException(String message) {
    super(message);
  }
}
