package com.roshan.EBookingSystem.Repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;

import com.roshan.EBookingSystem.Entity.Vehicle;

public interface VehicleRepo extends JpaRepository<Vehicle, String> {

    ArrayList<Vehicle> findByFromCityAndToCityAndDateOfJourney(String fromCity, String toCity, LocalDate dateOfJourvey);

}
