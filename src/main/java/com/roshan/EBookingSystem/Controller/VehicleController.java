package com.roshan.EBookingSystem.Controller;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.roshan.EBookingSystem.Entity.Vehicle;
import com.roshan.EBookingSystem.Service.VehicleService;

@RestController
@RequestMapping("/vehicles")
public class VehicleController {

    @Autowired
    @Qualifier("flightService")
    private VehicleService flightService;

    @Autowired
    @Qualifier("trainService")
    private VehicleService trainService;

    @Autowired
    @Qualifier("busService")
    private VehicleService busService;

    @GetMapping("/search")
    public List<? extends Vehicle> search(@RequestParam String type, @RequestParam String from, @RequestParam String to,
            @RequestParam String dateOfJourmey, @RequestParam String travelClass) {

        LocalDate doj = LocalDate.parse(dateOfJourmey);

        return switch (type.toUpperCase()) {
            case "FLIGHT" -> flightService.search(from, to, doj, travelClass);
            case "TRAIN" -> trainService.search(from, to, doj, travelClass);
            case "BUS" -> busService.search(from, to, doj, travelClass);
            default -> Collections.emptyList();
        };
    }

    @GetMapping("/id")
    public ResponseEntity<? extends Vehicle> getDaeatils(@PathVariable String id, @RequestParam String type) {

        return switch(type.toUpperCase()) {
            case "FLIGHT" -> flightService.getDatails(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
            case "TRAIN" -> trainService.getDatails(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
            case "BUS" -> busService.getDatails(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
            default -> ResponseEntity.badRequest().build();
        };
    }

}
