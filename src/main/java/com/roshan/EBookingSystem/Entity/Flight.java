package com.roshan.EBookingSystem.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Flight extends Vehicle {

    // Flight number
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String flightNumber;

    // Airline name
    private String airlineName;

    // Flight duration in hours
    private Double flightDuration;

    // Departure terminal
    private String departureTerminal;

    // Arrival terminal
    private String arrivalTerminal;

    // In-flight services (e.g., meals, entertainment)
    private String inFlightServices;

    // Baggage allowance in kg
    private Double baggageAllowance;

    // Seat configuration (e.g., 2-4-2, 3-3-3)
    private String seatConfiguration;

}
