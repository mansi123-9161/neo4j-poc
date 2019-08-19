package com.stackroute.neo4j.controller;

import com.stackroute.neo4j.domain.Person;
import com.stackroute.neo4j.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/api/v1")
public class UserController {
    PersonService personService;

    @Autowired
    public UserController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("users")
    public Collection<Person> getAll() {
        return personService.getAll();
    }
}
