package com.stackroute.neo4j;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;

@SpringBootApplication
@EnableNeo4jRepositories("movies.spring.data.neo4j.repositories")
public class Neo4jApplication {

	public static void main(String[] args) {
		SpringApplication.run(Neo4jApplication.class, args);
	}

}
