package com.keyin.flight.view;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightViewService {
    private final FlightViewRepository flightViewRepository;

    @Autowired
    public FlightViewService(FlightViewRepository flightViewRepository) {
        this.flightViewRepository = flightViewRepository;
    }

    public List<FlightDTO> getFlightViewByDepartureAirportName(String departureAirportName) {
        return flightViewRepository.getFlightViewByDepartureAirport(departureAirportName);
    }

    public List<FlightDTO> getFlightViewByArrivalAirportName(String arrivalAirportName) {
        return flightViewRepository.getFlightViewByArrivalAirport(arrivalAirportName);
    }
}
