package com.roshan.EBookingSystem.Repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import com.roshan.EBookingSystem.Entity.Booking;;

public interface BookingRepo extends JpaRepository<Booking, String>{

    ArrayList<Booking> findByUserId(Integer userId);
}
