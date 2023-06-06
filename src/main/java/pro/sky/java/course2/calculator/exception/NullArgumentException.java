package pro.sky.java.course2.calculator.exception;

public class NullArgumentException extends IllegalArgumentException{
    public NullArgumentException() {
    }

    public NullArgumentException(String message) {
        super(message);
    }
}
