package com.roshan.EBookingSystem.Entity;

import jakarta.persistence.Entity;

@Entity
public class Train extends Vehicle{

    // Train number
    private String trainNumber;

    // Train name
    private String trainName;

    // Train type (e.g., express, local)
    private String trainType;

    // Number of coaches
    private Integer numberOfCoaches;

    // Seat configuration (e.g., 2S, Sleeper, AC)
    private String seatConfiguration;

    // Amenities available (e.g., Wi-Fi, food service)
    private String amenities;

    // Train speed in km/h
    private Double trainSpeed;

    // Train operator name
    private String operatorName;
}
