package kz.almaty.github.lesson11.util;

public class UncheckedClassException extends RuntimeException {

    public UncheckedClassException() {
    }

    public UncheckedClassException(String messageFromException) {

        super(messageFromException);
    }

    public UncheckedClassException(String message, Throwable cause) {
        super(message, cause);
    }

    public UncheckedClassException(Throwable causeForTheException) {

        super(causeForTheException);
    }


}
