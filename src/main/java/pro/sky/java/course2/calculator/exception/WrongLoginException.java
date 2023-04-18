package pro.sky.java.course2.calculator.exception;

public class WrongLoginException extends RuntimeException {
    public WrongLoginException(String message) {
        super(message);
    }
}
