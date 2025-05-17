package com.roshan.EBookingSystem.Entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
// @Table(name = "vehicles")
public class Vehicle {

    @Id
    // Unique ID for each vehicle
    private String id;

    // Type of vehicle (e.g., bus, train, etc.)
    private String type;
    private String from;
    private String to;
    private LocalDate dateOfJourney;
    // Economy, Business, AC1, AC2, AC2, etc.
    private String travelClass;
    private Double price;
    private String departureTime;
    private String arrivalTime;
    private String midStations; // Comma seprated list
}
