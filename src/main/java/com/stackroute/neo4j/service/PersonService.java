package com.stackroute.neo4j.service;

import com.stackroute.neo4j.domain.Person;

import java.util.Collection;

public interface PersonService {
    public Collection<Person> getAll();
}
