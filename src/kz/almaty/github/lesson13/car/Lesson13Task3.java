package kz.almaty.github.lesson13.car;

import java.util.List;
import java.util.ListIterator;

public final class Lesson13Task3 {
    public static int charCount = 4;
    public static String marker = "****";
    public static String nextWord;

    private Lesson13Task3() {
    }

    public static void markLength4(List<String> wordList) {
        ListIterator<String> listIterator = wordList.listIterator();
        while (listIterator.hasNext()) {
            nextWord = listIterator.next();
            if (nextWord.length() == charCount) {
                listIterator.set(marker);
                listIterator.add(nextWord);
            }
        }
    }
}
