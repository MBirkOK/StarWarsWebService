package de.openknowlede.ausbildung.mbi.starwars.application.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.inject.Inject;

import de.openknowlede.ausbildung.mbi.starwars.application.values.PeopleValue;
import de.openknowlede.ausbildung.mbi.starwars.domain.exceptions.PeopleNotFoundException;
import de.openknowlede.ausbildung.mbi.starwars.domain.services.PeopleService;

public class PeopleController {

    @Inject
    private PeopleService peopleService;

    @GetMapping
    public PeopleValue findCharacterFindById(@PathVariable String id) throws PeopleNotFoundException {
        return this.peopleService.findCharacterById(id);
    }
}
