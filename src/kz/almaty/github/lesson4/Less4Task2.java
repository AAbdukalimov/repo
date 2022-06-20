package kz.almaty.github.lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class Less4Task2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers: ");
        int number = sc.nextInt();

        int[] array1 = {32, 99, 8, 99, 3, 11, 99};
        int sum = 0;

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == number) {
                sum++;
            }
        }
        int[] array2 = new int[array1.length - sum];
        int element = 0;
        for (int k = 0; k < array1.length; k++) {
            if (array1[k] != number) {
                array2[element] = array1[k];
                element++;
            }
        }
        System.out.println(Arrays.toString(array2));
    }
}


