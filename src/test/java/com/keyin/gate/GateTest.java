package com.keyin.gate;

import com.keyin.aircraft.Aircraft;
import com.keyin.airport.Airport;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GateTest {

    @Test
    void getId() {
        Gate gate = new Gate();
        gate.setId(1L);
        assertEquals(1L, gate.getId());
    }

    @Test
    void getGateNumber() {
        Gate gate = new Gate();
        gate.setGateNumber("B1");
        assertEquals("B1", gate.getGateNumber());
    }

    @Test
    void getAirport() {
        Gate gate = new Gate();
        Airport airport = new Airport();
        gate.setAirport(airport);
        assertEquals(airport, gate.getAirport());
    }

    @Test
    void getAircraftList() {
        Gate gate = new Gate();
        List<Aircraft> aircraftList = new ArrayList<>();
        gate.setAircraftList(aircraftList);
        assertEquals(aircraftList, gate.getAircraftList());
    }

    @Test
    void setId() {
        Gate gate = new Gate();
        gate.setId(2L);
        assertEquals(2L, gate.getId());
    }

    @Test
    void setGateNumber() {
        Gate gate = new Gate();
        gate.setGateNumber("A1");
        assertEquals("A1", gate.getGateNumber());
    }

    @Test
    void setAirport() {
        Gate gate = new Gate();
        Airport airport = new Airport();
        gate.setAirport(airport);
        assertEquals(airport, gate.getAirport());
    }

    @Test
    void setAircraftList() {
        Gate gate = new Gate();
        List<Aircraft> aircraftList = new ArrayList<>();
        gate.setAircraftList(aircraftList);
        assertEquals(aircraftList, gate.getAircraftList());
    }
}
