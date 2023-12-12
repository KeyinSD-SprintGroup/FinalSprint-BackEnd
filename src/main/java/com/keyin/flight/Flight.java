package com.keyin.flight;

import com.keyin.airport.Airport;

import javax.persistence.*;
import java.sql.Time;
import java.util.Calendar;
import java.util.Date;

@Entity
public class Flight {
    @Id
    @SequenceGenerator(name = "flight_sequence", sequenceName = "flight_sequence", allocationSize = 1, initialValue = 1)
    @GeneratedValue(generator = "flight_sequence")
    private long id;
    private String flightNumber;
    private String airline;
    @OneToOne
    private Airport departure;
    @OneToOne
    private Airport arrival;
    private Calendar arrivalDateAndTime;
    private Calendar departureDateAndTime;

    private String terminal;
    private String gate;
    private String status;
    private String checkInCounter;
    private String carousel;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public Airport getDeparture() {
        return departure;
    }

    public void setDeparture(Airport departure) {
        this.departure = departure;
    }

    public Airport getArrival() {
        return arrival;
    }

    public void setArrival(Airport arrival) {
        this.arrival = arrival;
    }

    public Calendar getArrivalDateAndTime() {
        return arrivalDateAndTime;
    }

    public void setArrivalDateAndTime(Calendar arrivalDateAndTime) {
        this.arrivalDateAndTime = arrivalDateAndTime;
    }

    public Calendar getDepartureDateAndTime() {
        return departureDateAndTime;
    }

    public void setDepartureDateAndTime(Calendar departureDateAndTime) {
        this.departureDateAndTime = departureDateAndTime;
    }

    public String getTerminal() {
        return terminal;
    }

    public void setTerminal(String terminal) {
        this.terminal = terminal;
    }

    public String getGate() {
        return gate;
    }

    public void setGate(String gate) {
        this.gate = gate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCheckInCounter() {
        return checkInCounter;
    }

    public void setCheckInCounter(String checkInCounter) {
        this.checkInCounter = checkInCounter;
    }

    public String getCarousel() {
        return carousel;
    }

    public void setCarousel(String carousel) {
        this.carousel = carousel;
    }
}