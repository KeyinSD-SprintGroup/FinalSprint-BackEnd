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
    private String code;
    @OneToMany(mappedBy = "airline")
    private List<Aircraft> aircraftList;
    @OneToMany(mappedBy = "airline")
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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<Aircraft> getAircraftList() {
        return aircraftList;
    }

    public void setAircraftList(List<Aircraft> aircraftList) {
        this.aircraftList = aircraftList;
    }

    public List<Flight> getFlightList() {
        return flightList;
    }

    public void setFlightList(List<Flight> flightList) {
        this.flightList = flightList;
    }
}