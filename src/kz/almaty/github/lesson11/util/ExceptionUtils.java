package kz.almaty.github.lesson11.util;

import java.io.CharConversionException;
import java.io.FileNotFoundException;
import java.security.KeyException;
import java.util.IllegalFormatCodePointException;

public final class ExceptionUtils {

    private ExceptionUtils() {
    }

    public static void throwNullPointerException(Object nullPointer) {

        nullPointer.toString();
    }

    public static void throwArrayIndexOutOfBoundsException() {
        try {
            int[] array = new int[2];
            for (int i = -1; i < array.length; i++) {
                array[i] = 3;
                System.out.println(array[-1]);
            }
        } catch (ArrayIndexOutOfBoundsException e1) {
            e1.printStackTrace();
        }
    }

    public static void throwIllegalArgumentException(int argument) {
        if (argument < 10) {
            throw new IllegalArgumentException("IllegalArgumentException has been throw");
        }
    }

    public static int throwArithmeticException(int i, int j) {
        return i / j;
    }

    public static void throwRandomException() {

        int randomArgument = (int) (Math.random() * 3);

            if (randomArgument == 2) {
                throw new ArrayStoreException("Method has been throw ArrayStoreException");
            } else if (randomArgument == 0) {
                throw new ClassCastException("Method has been throw ClassCastException");
            } else if (randomArgument == 1) {
                throw new IndexOutOfBoundsException("Method has been throw IndexOutOfBoundsException");
            }
    }


    public static void fiftyPercentThrowingException() {
        int randomNumber = (int) (Math.random() * 2);
        if (randomNumber == 0) {
            throw new ClassCastException("Exception thrown");
        }
    }
}
