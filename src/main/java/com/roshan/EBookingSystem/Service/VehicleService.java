package com.roshan.EBookingSystem.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import com.roshan.EBookingSystem.Entity.Vehicle;


public interface VehicleService {

    List<? extends Vehicle> search(String from, String to, LocalDate dateOfJourney) ;

    Optional<? extends Vehicle> getDatails(String id);
}
