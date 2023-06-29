package de.openknowledge.ausbildung.mbi.starwars.domain.exceptions;

public class NotFoundException extends Exception {

  public NotFoundException(String message) {
    super(message);
  }

  public NotFoundException() {
  }
}
