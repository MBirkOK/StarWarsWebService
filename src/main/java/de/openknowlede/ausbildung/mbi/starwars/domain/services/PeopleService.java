package de.openknowlede.ausbildung.mbi.starwars.domain.services;

import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;
import javax.inject.Inject;

import de.openknowlede.ausbildung.mbi.starwars.application.values.PeopleValue;
import de.openknowlede.ausbildung.mbi.starwars.domain.entities.People;
import de.openknowlede.ausbildung.mbi.starwars.domain.exceptions.PeopleNotFoundException;
import de.openknowlede.ausbildung.mbi.starwars.infrastructure.PeopleRepository;

@Service
public class PeopleService {

    @Inject
    private PeopleRepository peopleRepository;
    public PeopleValue findCharacterById(String id) throws PeopleNotFoundException {
        Optional<People> peopleOptional =  this.peopleRepository.findById(UUID.fromString(id));
        if(peopleOptional.isEmpty()){
            throw new PeopleNotFoundException("Character not found");
        }
        return People.of(peopleOptional.get());
    }
}
