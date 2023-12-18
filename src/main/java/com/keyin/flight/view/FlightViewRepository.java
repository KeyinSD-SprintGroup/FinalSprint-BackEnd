package com.keyin.flight.view;

import com.keyin.flight.Flight;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface FlightViewRepository extends Repository<Flight, Long> {
    @Query("SELECT new com.keyin.flight.view.FlightDTO(f.id AS flightId, a.name AS airlineName, f.flightNumber, f.arrivalDateAndTime, f.departureDateAndTime, da.name AS departureAirportName, aa.name AS arrivalAirportName, f.status) FROM com.keyin.flight.Flight f JOIN com.keyin.airline.Airline a ON f.airline.id = a.id LEFT JOIN com.keyin.airport.Airport da ON f.departureAirport.id = da.id LEFT JOIN com.keyin.airport.Airport aa ON f.arrivalAirport.id = aa.id WHERE da.name = :departureAirportName")
    List<FlightDTO> getFlightViewByDepartureAirport(@Param("departureAirportName") String departureAirportName);

    @Query("SELECT new com.keyin.flight.view.FlightDTO(f.id AS flightId, a.name AS airlineName, f.flightNumber, f.arrivalDateAndTime, f.departureDateAndTime, da.name AS departureAirportName, aa.name AS arrivalAirportName, f.status) FROM com.keyin.flight.Flight f JOIN com.keyin.airline.Airline a ON f.airline.id = a.id LEFT JOIN com.keyin.airport.Airport da ON f.departureAirport.id = da.id LEFT JOIN com.keyin.airport.Airport aa ON f.arrivalAirport.id = aa.id WHERE aa.name = :arrivalAirportName")
    List<FlightDTO> getFlightViewByArrivalAirport(@Param("arrivalAirportName") String arrivalAirportName);
}
