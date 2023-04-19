package pro.sky.java.course2.calculator.exception;

public class WrongPasswordException extends RuntimeException {
    public WrongPasswordException(String  message) {
        super(message);
    }
}
