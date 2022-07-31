package kz.almaty.github.lesson13.car;

import java.util.Objects;

public abstract class Car {

    public String make;

    public String model;
    public int firstRegistration;
    public String fuelType;
    public int numberOfSeats;
    public int numberOfDoors;
    public String bodyType;

    public Car(String make, String model, int firstRegistration, String fuelType, int numberOfSeats, int numberOfDoors, String bodyType) {
        this.make = make;
        this.model = model;
        this.firstRegistration = firstRegistration;
        this.fuelType = fuelType;
        this.numberOfSeats = numberOfSeats;
        this.numberOfDoors = numberOfDoors;
        this.bodyType = bodyType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(make, model, firstRegistration, fuelType, numberOfSeats,
                numberOfDoors, bodyType);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Car car = (Car) obj;
        return make == car.make && model == car.model && firstRegistration == car.firstRegistration &&
                fuelType == car.fuelType && numberOfSeats == car.numberOfSeats &&
                numberOfDoors == car.numberOfDoors && bodyType == car.bodyType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", firstRegistration=" + firstRegistration +
                ", fuelType='" + fuelType + '\'' +
                ", numberOfSeats=" + numberOfSeats +
                ", numberOfDoors=" + numberOfDoors +
                ", typeAndCondition='" + bodyType + '\'' +
                '}';
    }
}
