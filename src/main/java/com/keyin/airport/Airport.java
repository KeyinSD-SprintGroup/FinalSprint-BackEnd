package com.keyin.airport;

import com.keyin.city.City;
import com.keyin.flight.Flight;

import javax.persistence.*;
import java.util.List;

@Entity
public class Airport {
    @Id
    @SequenceGenerator(name = "airport_sequence", sequenceName = "airport_sequence", allocationSize = 1, initialValue = 1)
    @GeneratedValue(generator = "airport_sequence")
    private long id;
    private String code;
    private String name;
    @ManyToOne
    private City city;

    @OneToMany(mappedBy = "arrivalAirport", fetch = FetchType.EAGER)
    private List<Flight> arrivalList;

    @OneToMany(mappedBy = "departureAirport", fetch = FetchType.EAGER)
    private List<Flight> departureList;

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
}