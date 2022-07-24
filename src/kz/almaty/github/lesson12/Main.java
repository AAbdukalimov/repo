package kz.almaty.github.lesson12;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) {


Lesson12HomeTask1.printFrequencyOfAllLettersOfText(Paths.get("resources", "lesson12task1part1.txt").toFile());

Lesson12HomeTask2.printSortedNumberInFile(Paths.get("resources", "lesson12task2part1.txt").toFile());

    }
}
