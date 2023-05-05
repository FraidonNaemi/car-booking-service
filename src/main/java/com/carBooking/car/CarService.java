package com.carBooking.car;

import java.util.List;
import java.util.stream.Collectors;

public class CarService {
    private final CarDAO carDAO;

    public CarService(CarDAO carDAO) {
        this.carDAO = carDAO;
    }

    public List<Car> getAllCars() {
        return carDAO.getAllCars();
    }

    // get car by regNumber
    public Car getCar(String regNumber) {
        for(Car car : getAllCars()) {
            if(regNumber.equals(car.getRegNumber())) {
                return car;
            }
        }
        throw new IllegalStateException(String.format("Car with reg %s not found", regNumber));
    }

    // check and get all electric cars
    public List<Car> getAllElectricCars() {
        List<Car> electricCars = getAllCars()
                .stream()
                .filter(car -> car.isElectric())
                .collect(Collectors.toList());

        return electricCars;
    }
}