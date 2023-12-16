package com.keyin.flight;

import com.keyin.airport.Airport;
import org.junit.jupiter.api.Test;

import java.util.Calendar;

import static org.junit.jupiter.api.Assertions.*;

class FlightTest {

    @Test
    void getId() {
        Flight flight = new Flight();
        flight.setId(1);
        assertEquals(1, flight.getId());
    }

    @Test
    void setId() {
        Flight flight = new Flight();
        flight.setId(1);
        assertEquals(1, flight.getId());
    }

    @Test
    void getFlightNumber() {
        Flight flight = new Flight();
        flight.setFlightNumber("AA0001");
        assertEquals("AA0001", flight.getFlightNumber());
    }

    @Test
    void setFlightNumber() {
        Flight flight = new Flight();
        flight.setFlightNumber("AA0001");
        assertEquals("AA0001", flight.getFlightNumber());
    }

    @Test
    void getAirline() {
        Flight flight = new Flight();
        flight.setAirline("Delta Airlines");
        assertEquals("Delta Airlines", flight.getAirline());
    }

    @Test
    void setAirline() {
        Flight flight = new Flight();
        flight.setAirline("Delta Airlines");
        assertEquals("Delta Airlines", flight.getAirline());
    }

    @Test
    void getDeparture() {
        Flight flight = new Flight();
        Airport airport = new Airport();
        flight.setDeparture(airport);
        assertEquals(airport, flight.getDeparture());
    }

    @Test
    void setDeparture() {
        Flight flight = new Flight();
        Airport airport = new Airport();
        flight.setDeparture(airport);
        assertEquals(airport, flight.getDeparture());
    }

    @Test
    void getArrival() {
        Flight flight = new Flight();
        Airport airport = new Airport();
        flight.setArrival(airport);
        assertEquals(airport, flight.getArrival());
    }

    @Test
    void setArrival() {
        Flight flight = new Flight();
        Airport airport = new Airport();
        flight.setArrival(airport);
        assertEquals(airport, flight.getArrival());
    }

    @Test
    void getArrivalDateAndTime() {
        Flight flight = new Flight();
        Calendar calendar = Calendar.getInstance();
        flight.setArrivalDateAndTime(calendar);
        assertEquals(calendar, flight.getArrivalDateAndTime());
    }

    @Test
    void setArrivalDateAndTime() {
        Flight flight = new Flight();
        Calendar calendar = Calendar.getInstance();
        flight.setArrivalDateAndTime(calendar);
        assertEquals(calendar, flight.getArrivalDateAndTime());
    }

    @Test
    void getDepartureDateAndTime() {
        Flight flight = new Flight();
        Calendar calendar = Calendar.getInstance();
        flight.setDepartureDateAndTime(calendar);
        assertEquals(calendar, flight.getDepartureDateAndTime());
    }

    @Test
    void setDepartureDateAndTime() {
        Flight flight = new Flight();
        Calendar calendar = Calendar.getInstance();
        flight.setDepartureDateAndTime(calendar);
        assertEquals(calendar, flight.getDepartureDateAndTime());
    }

    @Test
    void getTerminal() {
        Flight flight = new Flight();
        flight.setTerminal("Main");
        assertEquals("Main", flight.getTerminal());
    }

    @Test
    void setTerminal() {
        Flight flight = new Flight();
        flight.setTerminal("Main");
        assertEquals("Main", flight.getTerminal());
    }

    @Test
    void getGate() {
        Flight flight = new Flight();
        flight.setGate("A2");
        assertEquals("A2", flight.getGate());
    }

    @Test
    void setGate() {
        Flight flight = new Flight();
        flight.setGate("A2");
        assertEquals("A2", flight.getGate());
    }

    @Test
    void getStatus() {
        Flight flight = new Flight();
        flight.setStatus("ON TIME");
        assertEquals("ON TIME", flight.getStatus());
    }

    @Test
    void setStatus() {
        Flight flight = new Flight();
        flight.setStatus("ON TIME");
        assertEquals("ON TIME", flight.getStatus());
    }

    @Test
    void getCheckInCounter() {
        Flight flight = new Flight();
        flight.setCheckInCounter("1");
        assertEquals("1", flight.getCheckInCounter());
    }

    @Test
    void setCheckInCounter() {
        Flight flight = new Flight();
        flight.setCheckInCounter("1");
        assertEquals("1", flight.getCheckInCounter());
    }

    @Test
    void getCarousel() {
        Flight flight = new Flight();
        flight.setCarousel("C1");
        assertEquals("C1", flight.getCarousel());
    }

    @Test
    void setCarousel() {
        Flight flight = new Flight();
        flight.setCarousel("C1");
        assertEquals("C1", flight.getCarousel());
    }
}
