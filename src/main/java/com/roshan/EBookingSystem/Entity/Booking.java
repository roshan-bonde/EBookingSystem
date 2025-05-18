package com.roshan.EBookingSystem.Entity;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Booking {

    // Unique ID for each booking
    @Id
    private String bookingId;

    // User ID of the person who made the booking
    private Integer userId;

    // Vehicle ID of the booked vehicle
    private String vehicleId;

    // Date of booking
    private String bookingDate;

    // Date of jourvey
    private String dataOfJourney;

    private String fromCity;

    private String toCity;

    // Total amount paid for the booking
    private Double totalAmount;

    // Status of the booking (e.g., confirmed, cancelled)
    private String status;

    // Number of seats booked
    private Integer numberOfSeatsBooked;

    // Payment method used (e.g., credit card, debit card, etc.)
    private String paymentMethod;
}
