package com.example.TestSpring.services;

import com.example.TestSpring.entities.Booking;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookingService {
    private List<Booking> bookings = new ArrayList<>();

    public List<Booking> getBookings() {
        return bookings;
    }

    public List<Booking> setBookings(List<Booking> newBookings) {
        for (Booking booking : newBookings) {
            if (booking.getRoom().getNumber() < 1 || booking.getRoom().getNumber() > 9) {
                throw new IllegalArgumentException("Room number must be between 1 and 9");
            }

            for (int i = 0; i < bookings.size(); i++) {
                if (bookings.get(i).getRoom().getNumber() == booking.getRoom().getNumber()) {
                    if(bookings.get(i).getDate().equals(booking.getDate())) {
                        throw new IllegalStateException("Room already reserved for that date");
                    }
                }
            }

            this.bookings.add(booking);
        }
        return bookings;
    }
}
