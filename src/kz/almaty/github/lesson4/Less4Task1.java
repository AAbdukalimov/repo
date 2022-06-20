package kz.almaty.github.lesson4;

import java.util.Arrays;

public class Less4Task1 {

    public static void main(String[] args) {

        int[] array1 = {18,99,3,45};
        int first = array1[3];
        for (int i = array1.length - 1; i > 0; i--) {
            array1[i] = array1[i - 1];
        }
        array1[0] = first;
        System.out.println(Arrays.toString(array1));
    }
}

