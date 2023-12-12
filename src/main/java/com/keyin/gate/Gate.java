package com.keyin.gate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Gate {
    @Id
    private String gateNumber;

    public String getGateNumber() {
        return gateNumber;
    }
    public void setGateNumber(String gateNumber) {
        this.gateNumber = gateNumber;
    }
}
