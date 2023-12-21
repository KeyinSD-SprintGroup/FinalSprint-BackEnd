package com.keyin.aircraft;

import com.keyin.airline.Airline;
import com.keyin.flight.Flight;
import com.keyin.gate.Gate;
import com.keyin.passenger.Passenger;

import javax.persistence.*;
import java.util.List;

@Entity
public class Aircraft {
    @Id
    @SequenceGenerator(name = "aircraft_sequence", sequenceName = "aircraft_sequence", allocationSize = 1, initialValue = 1)
    @GeneratedValue(generator = "aircraft_sequence")
    private long id;
    private String type;
    private String tailNumber;
    @ManyToOne
    @JoinColumn(name = "airline_id")
    private Airline airline;
    private int numberOfPassengers;
    @OneToMany(mappedBy = "aircraft")
    private List<Flight> flightList;
    @ManyToMany
    private List<Gate> gateList;
    @ManyToMany
    private List<Passenger> passengerList;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTailNumber() {
        return tailNumber;
    }

    public void setTailNumber(String tailNumber) {
        this.tailNumber = tailNumber;
    }

    public Airline getAirline() {
        return airline;
    }

    public void setAirline(Airline airline) {
        this.airline = airline;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public List<Flight> getFlightList() {
        return flightList;
    }

    public void setFlightList(List<Flight> flightList) {
        this.flightList = flightList;
    }

    public List<Gate> getGateList() {
        return gateList;
    }

    public void setGateList(List<Gate> gateList) {
        this.gateList = gateList;
    }

    public List<Passenger> getPassengerList() {
        return passengerList;
    }

    public void setPassengerList(List<Passenger> passengerList) {
        this.passengerList = passengerList;
    }
}