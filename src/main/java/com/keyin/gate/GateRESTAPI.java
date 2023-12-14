package com.keyin.gate;

import com.keyin.airport.Airport;
import com.keyin.city.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "gate", path = "gate")
public interface GateRESTAPI extends JpaRepository<Gate, Long> {
    public List<Gate> findByGateNumber(@RequestParam String gateNumber);
}
