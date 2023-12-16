package com.keyin.passenger;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PassengerTest {

    @Test
    void getId() {
        Passenger passenger = new Passenger();
        passenger.setId(1);
        assertEquals(1, passenger.getId());
    }

    @Test
    void setId() {
        Passenger passenger = new Passenger();
        passenger.setId(1);
        assertEquals(1, passenger.getId());
    }

    @Test
    void getFirstName() {
        Passenger passenger = new Passenger();
        passenger.setFirstName("John");
        assertEquals("John", passenger.getFirstName());
    }

    @Test
    void setFirstName() {
        Passenger passenger = new Passenger();
        passenger.setFirstName("John");
        assertEquals("John", passenger.getFirstName());
    }

    @Test
    void getLastName() {
        Passenger passenger = new Passenger();
        passenger.setLastName("Doe");
        assertEquals("Doe", passenger.getLastName());
    }

    @Test
    void setLastName() {
        Passenger passenger = new Passenger();
        passenger.setLastName("Doe");
        assertEquals("Doe", passenger.getLastName());
    }

    @Test
    void getPhoneNumber() {
        Passenger passenger = new Passenger();
        passenger.setPhoneNumber(123456789);
        assertEquals(123456789, passenger.getPhoneNumber());
    }

    @Test
    void setPhoneNumber() {
        Passenger passenger = new Passenger();
        passenger.setPhoneNumber(123456789);
        assertEquals(123456789, passenger.getPhoneNumber());
    }
}
