package kz.almaty.github.lesson3;

import java.util.Scanner;

public class Less3Task2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a whole number: ");

        int number = scan.nextInt();
        int firstFibonacciNumber = 0;
        int secondFibonacciNumber = 1;
        int nextFibonacciNumber;

        System.out.print(firstFibonacciNumber + " " + secondFibonacciNumber + " ");

        while (firstFibonacciNumber + secondFibonacciNumber < number) {
            nextFibonacciNumber = firstFibonacciNumber + secondFibonacciNumber;
            firstFibonacciNumber = secondFibonacciNumber;
            secondFibonacciNumber = nextFibonacciNumber;

            System.out.print(nextFibonacciNumber + " ");
        }
    }
}
