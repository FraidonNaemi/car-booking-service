package com.carBooking.Car;

import java.math.BigDecimal;

public class CarDAO {
    // declare and initialize three static cars
    private static final Car[] CARS = {
            new Car("1234", new BigDecimal("89.00"), Brand.TESLA, true),
            new Car("5657", new BigDecimal("78.00"), Brand.BMW, false),
            new Car("5679", new BigDecimal("73.00"), Brand.MERCEDES, false)
    };

    public Car[] getAllCars() {
        return CARS;
    }
}