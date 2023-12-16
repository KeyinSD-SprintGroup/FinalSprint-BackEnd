package com.keyin.gate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GateTest {

    @Test
    void getGateNumber() {
        Gate gate = new Gate();
        gate.setGateNumber("A1");
        assertEquals("A1", gate.getGateNumber());
    }

    @Test
    void setGateNumber() {
        Gate gate = new Gate();
        gate.setGateNumber("A1");
        assertEquals("A1", gate.getGateNumber());
    }
}
