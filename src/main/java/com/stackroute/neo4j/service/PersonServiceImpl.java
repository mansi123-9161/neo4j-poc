package com.stackroute.neo4j.service;

import com.stackroute.neo4j.domain.Person;
import com.stackroute.neo4j.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
@Service
public class PersonServiceImpl implements PersonService {

  private PersonRepository personRepository;
@Autowired
    public PersonServiceImpl(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public Collection<Person> getAll() {
        return personRepository.getAllUsers();
    }
}
