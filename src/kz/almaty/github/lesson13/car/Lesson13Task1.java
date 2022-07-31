package kz.almaty.github.lesson13.car;

import java.io.*;
import java.util.*;

public final class Lesson13Task1 {

    private Lesson13Task1() {
    }

    public static void printAllDifferentWordsAndFrequencyOfEachWords(File file) {

        if (file != null && file.exists() && file.isFile()) {
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
                String allWordsOfFile;
                StringBuilder stringBuilder = new StringBuilder();
                while ((allWordsOfFile = bufferedReader.readLine()) != null) {
                    stringBuilder.append(allWordsOfFile);
                }
                String oneStringForAllWords = stringBuilder.toString();
                String charsForDelete = "«,».’?!-+=_“”—";
                for (char ch : charsForDelete.toCharArray()) {
                    oneStringForAllWords = oneStringForAllWords.replace(ch, ' ');
                }
                Scanner scanner = new Scanner(oneStringForAllWords);
                Set<String> hashSet = new HashSet<>();
                while (scanner.hasNext()) {
                    hashSet.add(scanner.next());
                }
                Scanner sc = new Scanner(oneStringForAllWords);
                Map<String, Integer> map = new HashMap<>();
                while (sc.hasNext()) {
                    String word = sc.next();
                    Integer frequency = map.get(word);
                    map.put(word, frequency == null ? 1 : frequency + 1);
                }
                System.out.println(hashSet);
                System.out.println(map + "\n");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}


