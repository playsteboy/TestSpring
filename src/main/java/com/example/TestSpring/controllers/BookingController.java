package com.example.TestSpring.controllers;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import com.example.TestSpring.entities.Booking;
import com.example.TestSpring.services.BookingService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class BookingController {

    private BookingService bookingService;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @GetMapping("/booking")
    public List<Booking> getBooking() {
        return bookingService.getBookings();
    }

    @PostMapping("/booking")
    public ResponseEntity<?> createBooking(@RequestBody List<Booking> newBookings){
        try {
            List<Booking> bookings = bookingService.setBookings(newBookings);
            return ResponseEntity.ok(bookings);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        } catch (IllegalStateException e) {
            return ResponseEntity.status(409).body(e.getMessage());
        }
    }
}
