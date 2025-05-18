package com.roshan.EBookingSystem.Entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("Flight")
public class Flight extends Vehicle {

    // Flight number
    private String flightNumber;

    // Airline name
    private String airlineName;

    private String flightType; // e.g., domestic, international

    private String flightClass; // e.g., economy, business, first class

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
