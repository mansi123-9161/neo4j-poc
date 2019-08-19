package com.stackroute.neo4j.domain;

import lombok.*;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.ArrayList;
import java.util.List;

@NodeEntity
@Data
@AllArgsConstructor
public class Person {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private int born;
    @Relationship(type = "LIKES", direction = Relationship.OUTGOING)
    private List<Movie> movies;

    public List<Movie> getMovies() {
        return movies;
    }

    public Person() {
    }
}
