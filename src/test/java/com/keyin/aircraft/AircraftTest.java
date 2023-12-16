package com.keyin.aircraft;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AircraftTest {

    @Test
    void getId() {
        Aircraft aircraft = new Aircraft();
        aircraft.setId(1);
        assertEquals(1, aircraft.getId());
    }

    @Test
    void setId() {
        Aircraft aircraft = new Aircraft();
        aircraft.setId(1);
        assertEquals(1, aircraft.getId());
    }

    @Test
    void getType() {
        Aircraft aircraft = new Aircraft();
        aircraft.setType("Boeing 747");
        assertEquals("Boeing 747", aircraft.getType());
    }

    @Test
    void setType() {
        Aircraft aircraft = new Aircraft();
        aircraft.setType("Boeing 747");
        assertEquals("Boeing 747", aircraft.getType());
    }

    @Test
    void getTailNumber() {
        Aircraft aircraft = new Aircraft();
        aircraft.setTailNumber("ABC123");
        assertEquals("ABC123", aircraft.getTailNumber());
    }

    @Test
    void setTailNumber() {
        Aircraft aircraft = new Aircraft();
        aircraft.setTailNumber("ABC123");
        assertEquals("ABC123", aircraft.getTailNumber());
    }

    @Test
    void getAirlineName() {
        Aircraft aircraft = new Aircraft();
        aircraft.setAirlineName("Delta Airlines");
        assertEquals("Delta Airlines", aircraft.getAirlineName());
    }

    @Test
    void setAirlineName() {
        Aircraft aircraft = new Aircraft();
        aircraft.setAirlineName("Delta Airlines");
        assertEquals("Delta Airlines", aircraft.getAirlineName());
    }

    @Test
    void getNumberOfPassengers() {
        Aircraft aircraft = new Aircraft();
        aircraft.setNumberOfPassengers(200);
        assertEquals(200, aircraft.getNumberOfPassengers());
    }

    @Test
    void setNumberOfPassengers() {
        Aircraft aircraft = new Aircraft();
        aircraft.setNumberOfPassengers(200);
        assertEquals(200, aircraft.getNumberOfPassengers());
    }
}
