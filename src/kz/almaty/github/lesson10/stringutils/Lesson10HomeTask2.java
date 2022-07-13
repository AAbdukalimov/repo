package kz.almaty.github.lesson10.stringutils;

public final class Lesson10HomeTask2 {

    public static final int ARABIC_NUMBER = 0;
    public static final int FINAL_ARABIC_NUMBER = 0;

    private Lesson10HomeTask2() {
    }

    public static int romanToArabic(String romanNumber) {

        if (romanNumber == null) {
            return 0;
        }

        char[] arrayRomanNumber1 = new char[romanNumber.length()];
        int[] arrayArabicNumber = new int[romanNumber.length()];

        for (int i = 0; i < arrayRomanNumber1.length; i++) {
            arrayRomanNumber1[i] = romanNumber.charAt(i);
        }
        for (int i = 0; i < arrayArabicNumber.length; i++) {
            if (arrayRomanNumber1[i] == 'I') {
                arrayArabicNumber[i] = 1;
            } else if (arrayRomanNumber1[i] == 'V') {
                arrayArabicNumber[i] = 5;
            } else if (arrayRomanNumber1[i] == 'X') {
                arrayArabicNumber[i] = 10;
            } else if (arrayRomanNumber1[i] == 'L') {
                arrayArabicNumber[i] = 50;
            } else if (arrayRomanNumber1[i] == 'C') {
                arrayArabicNumber[i] = 100;
            } else if (arrayRomanNumber1[i] == 'D') {
                arrayArabicNumber[i] = 500;
            } else if (arrayRomanNumber1[i] == 'M') {
                arrayArabicNumber[i] = 1000;
            }
        }
        int arabicNumber = ARABIC_NUMBER;
        int arrayNumberToCompare;
        int finalArabicNumber = FINAL_ARABIC_NUMBER;

        for (int i = arrayArabicNumber.length - 1; i >= 0; i--) {

            arrayNumberToCompare = arabicNumber;
            arabicNumber = arrayArabicNumber[i];

            if (arrayArabicNumber[i] >= arrayNumberToCompare) {
                finalArabicNumber = arrayArabicNumber[i] + finalArabicNumber;
            } else finalArabicNumber = finalArabicNumber - arrayArabicNumber[i];
        }
        return finalArabicNumber;
    }
}


