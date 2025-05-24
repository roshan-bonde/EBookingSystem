package com.roshan.EBookingSystem.Service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.roshan.EBookingSystem.Dto.BookingRequest;
import com.roshan.EBookingSystem.Entity.Booking;
import com.roshan.EBookingSystem.Entity.Bus;
import com.roshan.EBookingSystem.Entity.Flight;
import com.roshan.EBookingSystem.Entity.Train;
import com.roshan.EBookingSystem.Entity.Vehicle;
import com.roshan.EBookingSystem.Repository.BookingRepo;

@Service
public class BookingService {

    @Autowired
    BookingRepo bookingRepo;
    @Autowired
    FlightService flightService;
    @Autowired
    TrainService trainService;
    @Autowired
    BusService busService;

    public Booking bookTicket(BookingRequest request) {

        Vehicle vehicle = null;
        
        switch (request.getVehicleType().toUpperCase()) {
            case "FLIGHT":
                vehicle = flightService.getDatails(request.getVehicleId()).orElseThrow(() -> new RuntimeException("Flight not found"));
                break;
            case "TRAIN":
                vehicle = trainService.getDatails(request.getVehicleId()).orElseThrow(() -> new RuntimeException("Train not found"));
                break;
            case "BUS":
                vehicle = busService.getDatails(request.getVehicleId()).orElseThrow(() -> new RuntimeException("Bus not found"));
                break;
            default:
                throw new IllegalArgumentException("Invalid vehicle type: " + request.getVehicleType());
        };

        Booking booking = new Booking();

        booking.setUserId(request.getUserId());
        booking.setBookingDate(LocalDate.now().toString());
        booking.setDataOfJourney(request.getDateOfJourney());
        booking.setFromCity(request.getFromCity());
        booking.setToCity(request.getToCity());
        booking.setVehicleId(vehicle.getId());
        booking.setTotalAmount(request.getAmount());
        booking.setStatus("CONFIRMED");
        booking.setNumberOfSeatsBooked(request.getNoOfSeats());
        booking.setPaymentMethod(request.getPaymentMethod());
        booking.setEmail(request.getEmail());
        if(vehicle instanceof Bus){
            booking.setVehicleType("BUS");
        }
        else if(vehicle instanceof Train){
            booking.setVehicleType("TRAIN");
        }
        else if(vehicle instanceof Flight){
            booking.setVehicleType("FLIGHT");
        }

        Booking saved = bookingRepo.save(booking);

        return saved;
    }
}
