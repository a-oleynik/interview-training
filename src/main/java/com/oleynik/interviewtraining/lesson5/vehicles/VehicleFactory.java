package com.oleynik.interviewtraining.lesson5.vehicles;

public class VehicleFactory {
    public static Vehicle createVehicle(VehicleType type) {
        if (type.equals(VehicleType.BIKE)) {
            return new Bike();
        } else if (type.equals(VehicleType.CAR)) {
            return new Car();
        }
        throw new IllegalArgumentException("Unknown vehicle type");
    }

    public static void main(String[] args) {
        Vehicle car = VehicleFactory.createVehicle(VehicleType.CAR);
        Vehicle bike = VehicleFactory.createVehicle(VehicleType.BIKE);
        System.out.println(car);
        System.out.println(bike);
    }
}
