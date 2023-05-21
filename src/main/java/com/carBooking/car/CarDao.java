package com.carBooking.car;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class CarDao {
    private static final List<Car> CARS = Arrays.asList(
            new Car("1234", new BigDecimal("89.00"), Brand.TESLA, true),
            new Car("5657", new BigDecimal("78.00"), Brand.BMW, false),
            new Car("5679", new BigDecimal("73.00"), Brand.MERCEDES, false)
    );

    public List<Car> getAllCars() {
        return CARS;
    }
}