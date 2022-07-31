package kz.almaty.github.lesson13.car;

import java.util.*;

public class Garage {

    private Map<Car, Integer> garageObjects = new HashMap<>();

    public void entryInGarage(Car car) {
        if (car != null) {
            int count = garageObjects.getOrDefault(car, 0);
            garageObjects.put(car, count + 1);
        }
    }

    public void exitFromGarage(Car car) {
        if (car != null) {
            int count = garageObjects.getOrDefault(car, 0);
            Integer newCount = count == 0 ? null : count - 1;
            garageObjects.put(car, newCount);
        }
    }

    public int number(Car car) {
        int numberOfCars = 0;
        if (car != null) {
            for (Map.Entry<Car, Integer> entry : garageObjects.entrySet()) {
                if (entry.getKey() == car) {
                    numberOfCars = numberOfCars + entry.getValue();
                }
            }
        }
        return numberOfCars;
    }

    @Override
    public String toString() {
        return "Car parked in a garage: " + garageObjects + '.';
    }
}

