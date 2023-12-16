package com.keyin.city;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CityTest {

    @Test
    void getId() {
        City city = new City();
        city.setId(1);
        assertEquals(1, city.getId());
    }

    @Test
    void setId() {
        City city = new City();
        city.setId(1);
        assertEquals(1, city.getId());
    }

    @Test
    void getName() {
        City city = new City();
        city.setName("New York");
        assertEquals("New York", city.getName());
    }

    @Test
    void setName() {
        City city = new City();
        city.setName("New York");
        assertEquals("New York", city.getName());
    }

    @Test
    void getState() {
        City city = new City();
        city.setState("NY");
        assertEquals("NY", city.getState());
    }

    @Test
    void setState() {
        City city = new City();
        city.setState("NY");
        assertEquals("NY", city.getState());
    }

    @Test
    void getPopulation() {
        City city = new City();
        city.setPopulation(8000000);
        assertEquals(8000000, city.getPopulation());
    }

    @Test
    void setPopulation() {
        City city = new City();
        city.setPopulation(8000000);
        assertEquals(8000000, city.getPopulation());
    }
}
