package com.keyin.gate;

import com.keyin.aircraft.Aircraft;
import com.keyin.airport.Airport;
import com.keyin.flight.Flight;

import javax.persistence.*;
import java.util.List;

@Entity
public class Gate {
    @Id
    @SequenceGenerator(name = "gate_sequence", sequenceName = "gate_sequence", allocationSize = 1, initialValue = 1)
    @GeneratedValue(generator = "gate_sequence")
    private Long id;
    private String gateNumber;
    @ManyToOne
    @JoinColumn(name ="airport_id")
    private Airport airport;

    @ManyToMany
    private List<Aircraft> AircraftList;

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

    public Airport getAirport() {
        return airport;
    }

    public void setAirport(Airport airport) {
        this.airport = airport;
    }

    public List<Aircraft> getAircraftList() {
        return AircraftList;
    }

    public void setAircraftList(List<Aircraft> aircraftList) {
        AircraftList = aircraftList;
    }
}