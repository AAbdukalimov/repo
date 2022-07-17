package kz.almaty.github.lesson11.util;

import kz.almaty.github.lesson10.stringutils.StringUtils;

import static kz.almaty.github.lesson11.util.ExceptionUtils.*;

public class Main {

    public static void main(String[] args) {

        try {                                                                                      //1
            ExceptionUtils.throwNullPointerException(null);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }


        ExceptionUtils.throwArrayIndexOutOfBoundsException();                 //2


        try {
            ExceptionUtils.throwIllegalArgumentException(5);                      //3
        } catch (IllegalArgumentException e1) {
            System.out.println(e1.getMessage());
        }


        try {
            ExceptionUtils.throwRandomException();                                   //4
        } catch (ArrayStoreException | ClassCastException |
                 IndexOutOfBoundsException e4) {
            System.out.println(e4.getMessage());
        }


        try {
            ExceptionUtils.fiftyPercentThrowingException();                          //6
        } catch (ClassCastException e3) {
            System.out.println(e3.getMessage());
        } finally {
            System.out.println("The finally block is always executed");
        }


        try {
            ExceptionUtils.throwArithmeticException(5, 0);                           //5
        } catch (ArithmeticException e2) {
            e2.initCause(new ArithmeticException("<---- Was cause"));
            throw new UncheckedClassException(e2.getCause());
        }



    }
}





