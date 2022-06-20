package kz.almaty.github.lesson4;


import java.util.Arrays;

public class Less4Task3 {

    public static void main(String[] args) {

        int[][] array;
        int index1 = 0;
        int index2 = 0;
        array = new int[index1][index2];
        int[] array2;
        array2 = new int[index1 * index2];
        int index3 = 0;

        for (int i = 0; i < index1; i++) {
            for (int j = 0; j < index2; j++) {
                array2[index3++] = array[i][j];
            }
        }
        System.out.println(Arrays.toString(array2));
    }
}

