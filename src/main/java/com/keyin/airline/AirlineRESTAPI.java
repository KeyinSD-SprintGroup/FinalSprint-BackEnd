package com.keyin.airline;

import com.keyin.aircraft.Aircraft;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "airline", path = "airline")
public interface AirlineRESTAPI extends JpaRepository<Airline, Long> {
    public List<Airline> findByName(@RequestParam String name);
}