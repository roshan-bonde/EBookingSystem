package com.roshan.EBookingSystem.Entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("Train")
public class Train extends Vehicle{

    // Train number
    private String trainNumber;

    // Train name
    private String trainName;

    // Train type (e.g., express, local)
    private String trainType;

    // Number of coaches
    private Integer numberOfCoaches;

    // Train speed in km/h
    private Double trainSpeed;

    // Train operator name
    private String operatorName;
}
