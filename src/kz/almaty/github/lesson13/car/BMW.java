package kz.almaty.github.lesson13.car;

import java.util.Objects;

public class BMW extends Car {

    public BMW(String make, String model, int firstRegistration, String fuelType, int numberOfSeats, int numberOfDoors, String typeAndCondition) {
        super(make, model, firstRegistration, fuelType, numberOfSeats, numberOfDoors, typeAndCondition);
    }

    @Override
    public int hashCode() {
        return Objects.hash(make);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Car car = (Car) obj;
        return Objects.equals(make, car.make);
    }

    @Override
    public String toString() {
        return "BMW";
    }
}
