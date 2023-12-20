package com.keyin.gate;

import com.keyin.airport.Airport;

import javax.persistence.*;
import java.awt.*;

@Entity
public class Gate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String gateNumber;
    @ManyToOne
    @JoinColumn(name ="airport_id")
    private Airport airport;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGateNumber() {
        return gateNumber;
    }

    public void setGateNumber(String gateNumber) {
        this.gateNumber = gateNumber;
    }
}