package com.stackroute.neo4j.repository;

import com.stackroute.neo4j.domain.Person;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;

import java.util.Collection;

public interface PersonRepository extends Neo4jRepository<Person,Long> {
    @Query("MATCH (u:User)-[r:LIKES]->(m:Movie) return u,r,m")
    Collection<Person> getAllUsers();
}
