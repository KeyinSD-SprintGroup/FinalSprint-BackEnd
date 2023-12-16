package com.keyin.airport;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AirportTest {

    @Test
    void getId() {
        Airport airport = new Airport();
        airport.setId(1);
        assertEquals(1, airport.getId());
    }

    @Test
    void setId() {
        Airport airport = new Airport();
        airport.setId(1);
        assertEquals(1, airport.getId());
    }

    @Test
    void getName() {
        Airport airport = new Airport();
        airport.setName("John F. Kennedy International Airport");
        assertEquals("John F. Kennedy International Airport", airport.getName());
    }

    @Test
    void setName() {
        Airport airport = new Airport();
        airport.setName("John F. Kennedy International Airport");
        assertEquals("John F. Kennedy International Airport", airport.getName());
    }

    @Test
    void getCode() {
        Airport airport = new Airport();
        airport.setCode("JFK");
        assertEquals("JFK", airport.getCode());
    }

    @Test
    void setCode() {
        Airport airport = new Airport();
        airport.setCode("JFK");
        assertEquals("JFK", airport.getCode());
    }
}
