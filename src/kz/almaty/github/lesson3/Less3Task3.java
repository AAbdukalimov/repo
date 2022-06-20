package kz.almaty.github.lesson3;

import java.util.Scanner;

public class Less3Task3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите количество дней : ");
        int numberOfDays = scan.nextInt();
        System.out.println("Введите количество осадков за каждый день : ");
        int rainfall;
        int amountOfRainfall = 0;
        double averageOfRainfall = 0;
        int maxRainfallDay = 0;

        for (int i = 0; i < numberOfDays; i++) {
            rainfall = scan.nextInt();
            if (rainfall > maxRainfallDay) {
                maxRainfallDay = rainfall;
            }
            amountOfRainfall += rainfall;
            averageOfRainfall = (double) amountOfRainfall / numberOfDays;
        }
        System.out.println("Сумма осадков за " + numberOfDays + " дней(день): " + amountOfRainfall);
        System.out.println("Среднее количество осадков за " + numberOfDays + " дней(день): " + averageOfRainfall);
        System.out.println("Максимальное количество дневных осадков за " + numberOfDays + " дней(день): " + maxRainfallDay);
    }
}

