package com.keyin.airport;

import com.keyin.city.City;
import com.keyin.flight.Flight;
import com.keyin.gate.Gate;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

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
    @JoinColumn(name = "city_id")
    private City city;

    @OneToMany(mappedBy = "arrivalAirport")
    private List<Flight> arrivalList;

    @OneToMany(mappedBy = "departureAirport")
    private List<Flight> departureList;

    @OneToMany(mappedBy = "airport")
    private List<Gate> gateList;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public List<Flight> getArrivalList() {
        return arrivalList;
    }

    public void setArrivalList(List<Flight> arrivalList) {
        this.arrivalList = arrivalList;
    }

    public List<Flight> getDepartureList() {
        return departureList;
    }

    public void setDepartureList(List<Flight> departureList) {
        this.departureList = departureList;
    }

    public List<Gate> getGateList() {
        return gateList;
    }

    public void setGateList(List<Gate> gateList) {
        this.gateList = gateList;
    }
}