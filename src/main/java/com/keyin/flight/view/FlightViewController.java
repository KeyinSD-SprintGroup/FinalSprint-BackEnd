package com.keyin.flight.view;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FlightViewController {
    private final FlightViewService flightViewService;

    @Autowired
    public FlightViewController(FlightViewService flightViewService) {
        this.flightViewService = flightViewService;
    }

    @GetMapping("/departure_flight_view")
    public List<FlightDTO> getFlightViewByDepartureAirport(@RequestParam String departureAirportName) {
        return flightViewService.getFlightViewByDepartureAirportName(departureAirportName);
    }

    @GetMapping("/arrival_flight_view")
    public List<FlightDTO> getFlightViewByArrivalAirport(@RequestParam String arrivalAirportName) {
        return flightViewService.getFlightViewByArrivalAirportName(arrivalAirportName);
    }
}
