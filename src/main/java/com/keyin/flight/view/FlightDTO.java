package com.keyin.flight.view;


import java.util.Date;

public class FlightDTO {
    private long flightId;
    private String airlineName;
    private String flightNumber;

    private Date arrivalDateAndTime;

    private Date departureDateAndTime;
    private String arrivalAirportName;
    private String departureAirportName;
    private String status;

    public FlightDTO(
            long flightId,
            String airlineName,
            String flightNumber,
            Date arrivalDateAndTime,
            Date departureDateAndTime,
            String departureAirportName,
            String arrivalAirportName,
            String status) {
        this.flightId = flightId;
        this.airlineName = airlineName;
        this.flightNumber = flightNumber;
        this.arrivalDateAndTime = arrivalDateAndTime;
        this.departureDateAndTime = departureDateAndTime;
        this.arrivalAirportName = arrivalAirportName;
        this.departureAirportName = departureAirportName;
        this.status = status;
    }

    public long getFlightId() {
        return flightId;
    }

    public void setFlightId(long flightId) {
        this.flightId = flightId;
    }

    public String getAirlineName() {
        return airlineName;
    }

    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public Date getArrivalDateAndTime() {
        return arrivalDateAndTime;
    }

    public void setArrivalDateAndTime(Date arrivalDateAndTime) {
        this.arrivalDateAndTime = arrivalDateAndTime;
    }

    public Date getDepartureDateAndTime() {
        return departureDateAndTime;
    }

    public void setDepartureDateAndTime(Date departureDateAndTime) {
        this.departureDateAndTime = departureDateAndTime;
    }

    public String getArrivalAirportName() {
        return arrivalAirportName;
    }

    public void setArrivalAirportName(String arrivalAirportName) {
        this.arrivalAirportName = arrivalAirportName;
    }

    public String getDepartureAirportName() {
        return departureAirportName;
    }

    public void setDepartureAirportName(String departureAirportName) {
        this.departureAirportName = departureAirportName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
