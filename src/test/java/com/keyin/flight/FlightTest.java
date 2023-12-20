package com.keyin.flight;

import com.keyin.airline.Airline;
import com.keyin.airport.Airport;
import org.junit.jupiter.api.Test;

import java.sql.Timestamp;

import static org.junit.jupiter.api.Assertions.*;

class FlightTest {

    @Test
    void getId() {
        Flight flight = new Flight();
        flight.setId(2);
        assertEquals(2, flight.getId());
    }

    @Test
    void getFlightNumber() {
        Flight flight = new Flight();
        flight.setFlightNumber("AC9875");
        assertEquals("AC9875", flight.getFlightNumber());
    }

    @Test
    void getAirline() {
        Flight flight = new Flight();
        Airline airline = new Airline();
        flight.setAirline(airline);
        assertEquals(airline, flight.getAirline());
    }

    @Test
    void getDepartureAirport() {
        Flight flight = new Flight();
        Airport departureAirport = new Airport();
        flight.setDepartureAirport(departureAirport);
        assertEquals(departureAirport, flight.getDepartureAirport());
    }

    @Test
    void getArrivalAirport() {
        Flight flight = new Flight();
        Airport arrivalAirport = new Airport();
        flight.setArrivalAirport(arrivalAirport);
        assertEquals(arrivalAirport, flight.getArrivalAirport());
    }

    @Test
    void getArrivalDateAndTime() {
        Flight flight = new Flight();
        Timestamp arrivalDateAndTime = new Timestamp(System.currentTimeMillis());
        flight.setArrivalDateAndTime(arrivalDateAndTime);
        assertEquals(arrivalDateAndTime, flight.getArrivalDateAndTime());
    }

    @Test
    void getDepartureDateAndTime() {
        Flight flight = new Flight();
        Timestamp departureDateAndTime = new Timestamp(System.currentTimeMillis());
        flight.setDepartureDateAndTime(departureDateAndTime);
        assertEquals(departureDateAndTime, flight.getDepartureDateAndTime());
    }

    @Test
    void getStatus() {
        Flight flight = new Flight();
        flight.setStatus("On Time");
        assertEquals("On Time", flight.getStatus());
    }

    @Test
    void setId() {
        Flight flight = new Flight();
        flight.setId(1);
        assertEquals(1, flight.getId());
    }

    @Test
    void setFlightNumber() {
        Flight flight = new Flight();
        flight.setFlightNumber("AC2364");
        assertEquals("AC2364", flight.getFlightNumber());
    }

    @Test
    void setAirline() {
        Flight flight = new Flight();
        Airline airline = new Airline();
        flight.setAirline(airline);
        assertEquals(airline, flight.getAirline());
    }

    @Test
    void setDepartureAirport() {
        Flight flight = new Flight();
        Airport departureAirport = new Airport();
        flight.setDepartureAirport(departureAirport);
        assertEquals(departureAirport, flight.getDepartureAirport());
    }

    @Test
    void setArrivalAirport() {
        Flight flight = new Flight();
        Airport arrivalAirport = new Airport();
        flight.setArrivalAirport(arrivalAirport);
        assertEquals(arrivalAirport, flight.getArrivalAirport());
    }

    @Test
    void setArrivalDateAndTime() {
        Flight flight = new Flight();
        Timestamp arrivalDateAndTime = new Timestamp(System.currentTimeMillis());
        flight.setArrivalDateAndTime(arrivalDateAndTime);
        assertEquals(arrivalDateAndTime, flight.getArrivalDateAndTime());
    }

    @Test
    void setDepartureDateAndTime() {
        Flight flight = new Flight();
        Timestamp departureDateAndTime = new Timestamp(System.currentTimeMillis());
        flight.setDepartureDateAndTime(departureDateAndTime);
        assertEquals(departureDateAndTime, flight.getDepartureDateAndTime());
    }

    @Test
    void setStatus() {
        Flight flight = new Flight();
        flight.setStatus("Delayed");
        assertEquals("Delayed", flight.getStatus());
    }
}

// actions test