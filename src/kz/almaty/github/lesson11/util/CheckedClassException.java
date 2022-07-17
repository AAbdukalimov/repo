package kz.almaty.github.lesson11.util;

public class CheckedClassException extends Exception {

    public CheckedClassException() {
    }

    public CheckedClassException(String message) {
        super(message);
    }

    public CheckedClassException(String message, Throwable cause) {
        super(message, cause);
    }

    public CheckedClassException(Throwable cause) {
        super(cause);
    }


}
