package com.roshan.EBookingSystem.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.roshan.EBookingSystem.Repository.VehicleRepo;
import com.roshan.EBookingSystem.Entity.Train;;

@Service
public class TrainService implements VehicleService {

    @Autowired
    private VehicleRepo vehicleRepo;

    @Override
    public List<Train> search(String from, String to, LocalDate dateOfJourmey, String travelClass) {
        return vehicleRepo.findByFromAndToAndDateOfJourneyAndTravelClass(from, to, dateOfJourmey, travelClass).stream()
                .filter(vehicle -> vehicle instanceof Train).map(vehicle -> (Train) vehicle).toList();
    }

    @Override
    public Optional<Train> getDatails(String id) {
        return vehicleRepo.findById(id).filter(vehicle -> vehicle instanceof Train).map(vehicle -> (Train)vehicle);
    }

}
