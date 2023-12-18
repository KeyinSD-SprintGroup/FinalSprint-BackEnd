package com.keyin.airline;

import com.keyin.aircraft.Aircraft;
import com.keyin.airport.Airport;
import com.keyin.flight.Flight;
import com.keyin.gate.Gate;

import javax.persistence.*;
import java.util.List;

@Entity
public class Airline {
    @Id
    @SequenceGenerator(name = "airline_sequence", sequenceName = "airline_sequence", allocationSize = 1, initialValue = 1)
    @GeneratedValue(generator = "airline_sequence")
    private long id;
    private String name;
    @OneToMany
    private List<Aircraft> aircraftList;
    @OneToMany
    @JoinColumn(name = "airline_id")
    private List<Flight> flightList;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}