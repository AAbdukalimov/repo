package kz.almaty.github.lesson13.car;

import java.nio.file.Paths;
import java.util.*;

public class Test {

    public static void main(String[] args) {

        System.out.println();
        Lesson13Task1.printAllDifferentWordsAndFrequencyOfEachWords(Paths.get("resources", "lesson13task1.txt").toFile());

        Garage garage = new Garage();

        Car mercedes = new Mercedes("Mercedes", "E320CDI", 2006, "gasoline", 5, 4, "sedan");
        Car bmw = new BMW("BMW", "M5", 2019, "gasoline", 5, 4, "sedan");
        Car bmw1 = new BMW("BMW", "X5", 2015, "gasoline", 5, 4, "SUV");
        Car toyota = new Toyota("Toyota", "Corolla", 2010, "gasoline", 5, 4, "sedan");
        Car toyota1 = new Toyota("Toyota", "Camry", 2014, "gasoline", 5, 4, "sedan");
        Car toyota2 = new Toyota("Toyota", "Land Cruiser 200", 2014, "gasoline", 5, 4, "SUV");
        Car toyota3 = new Toyota("Toyota", "Corolla", 2010, "gasoline", 5, 4, "sedan");

        garage.entryInGarage(mercedes);
        garage.entryInGarage(bmw);
        garage.entryInGarage(bmw1);
        garage.entryInGarage(toyota);
        garage.entryInGarage(toyota1);
        garage.entryInGarage(toyota2);
        garage.entryInGarage(toyota3);

        garage.exitFromGarage(bmw);
        garage.exitFromGarage(toyota);

        System.out.println(garage);
        System.out.println("Number of cars of this brand in the garage: " + garage.number(toyota) + "\n");

        List<String> list = new LinkedList<>(List.of("this", "is", "lots", "of", "fun", "for", "every", "Java", "programmer"));
        Lesson13Task3.markLength4(list);
        System.out.println(list + "\n");

        List<Student> studentList = new ArrayList<>(List.of(new Student("Alex", "Ivanov", 20, 4.3),
                new Student("Sergey", "Petrov", 19, 4.4),
                new Student("Boris", "Smirnov", 21, 4.1)));

        ListIterator<Student> listIterator = studentList.listIterator();
        double maxAverageScore = 0;
        while (listIterator.hasNext()) {
            if (listIterator.next().averageScore >= maxAverageScore) {
                maxAverageScore = listIterator.next().averageScore;
            }
        }
        System.out.println("Maximum average score among students: " + maxAverageScore);
        studentList.sort(new StudentNameComparator().thenComparing(new StudentSurnameComparator()));
        System.out.println(studentList);
        studentList.sort(new StudentAgeComparator());
        System.out.println(studentList);
        studentList.sort(new StudentAverageScoreComparator());
        System.out.println(studentList);
    }
}
