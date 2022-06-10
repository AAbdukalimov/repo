package kz.almaty.github;

import java.util.Scanner;

public class Less3Task1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a whole number: ");
        int number = scan.nextInt();
        int remainderOfDivision;
        int firstDigitNumber = 0;
        int sumOfDigits = 0;
        int result;

        while (number <= -10 || number >= 10) {
            remainderOfDivision = number % 10;
            number = number / 10;
            sumOfDigits += remainderOfDivision;
        }
        if (number >= -9) {
            firstDigitNumber = number;
        }
        result = sumOfDigits + firstDigitNumber;

        System.out.println("The sum of digits of this number: " + "\n" + result);
    }
}

