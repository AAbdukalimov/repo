package kz.almaty.github.lesson12;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

public final class Lesson12HomeTask2 {

    private Lesson12HomeTask2() {
    }
    public static void printSortedNumberInFile(File file) {

        if (!file.exists()) {
            file.getParentFile().mkdirs();
        }
        Random random = new Random();
        int[]randomIntArray = new int[36];

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {
            for (int i = 0; i < randomIntArray.length; i++) {
                int number = random.nextInt(999);
                randomIntArray[i] = number;
                bufferedWriter.write(randomIntArray[i] + ",");
            }
            Arrays.sort(randomIntArray);
            File fileName = new File("resources/lesson12task2part2.txt");
            fileName.getParentFile().mkdirs();

            try (BufferedWriter buffWriter = new BufferedWriter(new FileWriter("resources/lesson12task2part2.txt"))) {
                buffWriter.write(Arrays.toString(randomIntArray));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}







