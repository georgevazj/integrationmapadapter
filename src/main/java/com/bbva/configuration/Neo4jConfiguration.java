package com.bbva.configuration;

import org.neo4j.driver.v1.AuthTokens;
import org.neo4j.driver.v1.Driver;
import org.neo4j.driver.v1.GraphDatabase;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;

/**
 * Created by jorge on 10/07/17.
 */

@Configuration
public class Neo4jConfiguration {

    @Value("${spring.data.neo4j.uri}")
    private String neo4jUri;
    @Value("${spring.data.neo4j.username}")
    private String neo4jUsername;
    @Value("${spring.data.neo4j.password}")
    private String neo4jPassword;

    @Bean
    public Driver getDriver() throws IOException {
        Driver driver = GraphDatabase.driver(neo4jUri, AuthTokens.basic(neo4jUsername,neo4jPassword));
        return driver;
    }

}
