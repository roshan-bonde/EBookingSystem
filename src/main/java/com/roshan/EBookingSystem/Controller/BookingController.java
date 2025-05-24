package com.roshan.EBookingSystem.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.roshan.EBookingSystem.Dto.BookingRequest;
import com.roshan.EBookingSystem.Service.BookingService;
import com.roshan.EBookingSystem.Service.EmailService;

@RestController
public class BookingController {

    @Autowired
    BookingService bookingService;
    @Autowired
    EmailService emailService;

    @PostMapping("/book")
    public String bookTicket(@RequestBody BookingRequest bookingRequest) {
        try {
            bookingService.bookTicket(bookingRequest);
            // emailService.sendBookingConfirmation(bookingRequest);
            return "Booking successful!";
        } catch (Exception e) {
            return "Booking failed: " + e.getMessage();
        }
    }
}
