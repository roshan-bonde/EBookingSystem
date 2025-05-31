package com.roshan.EBookingSystem.Controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.roshan.EBookingSystem.Entity.Bus;
import com.roshan.EBookingSystem.Entity.Flight;
import com.roshan.EBookingSystem.Entity.Vehicle;
import com.roshan.EBookingSystem.Service.FlightService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController("/api/flights")
public class FlightController {

    @Autowired
    FlightService flightService;

    @GetMapping("flight/search")
    public List<Flight> search(@RequestParam String from, @RequestParam String to,
            @RequestParam String dateOfJourmey) throws ParseException {
        LocalDate doj = LocalDate.parse(dateOfJourmey);
        return flightService.search(from, to, doj);
    }

    @GetMapping("flight/{id}")
    public ResponseEntity<? extends Vehicle> getDaeatils(@PathVariable String id) {
        return flightService.getDetails(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("/flight/add")
    public ResponseEntity<Flight> addBus(@RequestBody Flight flight) {
        Flight savedFlight = flightService.add(flight);
        return ResponseEntity.ok(savedFlight);
    }
}
