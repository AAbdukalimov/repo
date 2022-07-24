package kz.almaty.github.lesson12;

import java.io.*;
import java.util.Arrays;

public final class Lesson12HomeTask1 {

    private Lesson12HomeTask1() {
    }

    public static void printFrequencyOfAllLettersOfText(File file) {

        if (file != null && file.exists() && file.isFile()) {

            try (BufferedReader fileReader = new BufferedReader(new FileReader(file))) {
                String fileCharStrings;
                StringBuilder allChars = new StringBuilder();
                String stringAllOfChars;

                while ((fileCharStrings = fileReader.readLine()) != null) {
                    allChars.append(fileCharStrings);
                }
                stringAllOfChars = allChars.toString().toLowerCase();
                char[] arrayAllOfChars = stringAllOfChars.toCharArray();
                Arrays.sort(arrayAllOfChars);
                String letter = "";
                int[] letterCount = new int[45];
                int indexLetterInString;

                for (int i = 0; i < arrayAllOfChars.length; i++) {
                    indexLetterInString = letter.indexOf(arrayAllOfChars[i]);
                    if (indexLetterInString >= 0) {
                        letterCount[indexLetterInString]++;
                    } else if (Character.isLetter(arrayAllOfChars[i])) {
                        letter += arrayAllOfChars[i];
                        letterCount[letter.length() - 1]++;
                    }
                }
                File lesson12task1part2 = new File("resources/lesson12task1part2.txt");
                lesson12task1part2.getParentFile().mkdirs();

                try (FileWriter fileWriter = new FileWriter("resources/lesson12task1part2.txt")) {
                    for (int i = 0; i < letter.length(); i++) {
                        fileWriter.write(letter.charAt(i) + "-" + letterCount[i] + "\r\n");
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}










