package com.carBooking.booking;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class CarBookingDao {
    private final static List<CarBooking> carBookings;

    static {
        carBookings = new ArrayList<CarBooking>();
    }

    public List<CarBooking> getCarBookings() {
        return carBookings;
    }

    public void book(CarBooking carBooking) {
        carBookings.add(carBooking);
    }

    // TODO later
    public void cancelCarBooking(UUID id) { }
}