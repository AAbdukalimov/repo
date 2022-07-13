package kz.almaty.github.lesson10.stringutils;

public final class Lesson10HomeTask1 {

    private Lesson10HomeTask1() {
    }

    public static boolean isNotNull(String str) {
        return str != null;
    }

    public static boolean checkForPalindrome(String str) {

        String str1 = str.replaceAll("\\s", "");

        char[] arrayCharsForString1 = new char[str1.length()];
        char[] arrayCharsForReverseString1 = new char[str1.length()];

        for (int i = 0; i < arrayCharsForString1.length; i++) {
            arrayCharsForString1[i] = str1.charAt(i);
        }
        for (int k = 0; k < arrayCharsForString1.length; k++) {
            arrayCharsForReverseString1[k] = arrayCharsForString1[arrayCharsForString1.length - 1 - k];
        }
        String reverseString = new String(arrayCharsForReverseString1);

        return str1.equalsIgnoreCase(reverseString);
    }
}
