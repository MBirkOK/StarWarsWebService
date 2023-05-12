package de.openknowledge.ausbildung.mbi.starwars;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class StarWarsApplication extends SpringBootServletInitializer {

  @Override
  protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
    return application.sources(StarWarsApplication.class);
  }

  //Main Methode
  public static void main(String[] args) {
    SpringApplication.run(StarWarsApplication.class, args);
  }

}
