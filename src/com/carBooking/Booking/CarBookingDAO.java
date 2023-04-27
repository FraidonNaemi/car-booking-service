package com.carBooking.Booking;

import java.util.UUID;

public class CarBookingDAO {
    private final static CarBooking[] carBookings;

    static {
        carBookings = new CarBooking[10];
    }

    public CarBooking[] getCarBookings() {
        return carBookings;
    }

    public void book(CarBooking carBooking) {
        int nextFreeIndex = -1;

        for(int i = 0; i < carBookings.length; i++) {
            if(carBookings[i] == null) {
                nextFreeIndex = i;
            }
        }

        if(nextFreeIndex > -1) {
            carBookings[nextFreeIndex] = carBooking;
            return;
        }

        // if array be full, then create a new one with double size
        CarBooking[] biggerCarBookings = new CarBooking[carBookings.length + 10];

        for(int i = 0; i < carBookings.length; i++) {
            biggerCarBookings[i] = carBookings[i];
        }

        // add new booking
        biggerCarBookings[carBookings.length] = carBooking;
    }

    // TODO later
    public void cancelCarBooking(UUID id) { }
}