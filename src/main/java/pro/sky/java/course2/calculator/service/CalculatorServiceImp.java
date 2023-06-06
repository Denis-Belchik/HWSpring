package pro.sky.java.course2.calculator.service;

import org.springframework.stereotype.Service;
import pro.sky.java.course2.calculator.exception.NullArgumentException;

@Service
public class CalculatorServiceImp implements CalculatorService {

    @Override
    public int plus(Integer num1, Integer num2) {
        isNullArgument(num1, num2);
        return num1 + num2;
    }

    @Override
    public int minus(Integer num1, Integer num2) {
        isNullArgument(num1, num2);
        return num1 - num2;
    }

    @Override
    public int multiply(Integer num1, Integer num2) {
        isNullArgument(num1, num2);
        return num1 * num2;
    }

    @Override
    public int divide(Integer num1, Integer num2) {
        isNullArgument(num1, num2);
        if (num2 == 0)
            throw new NullArgumentException("Деление на 0");
        return num1 / num2;
    }

    private void isNullArgument(Integer num1, Integer num2) {
        if (num1 == null || num2 == null)
            throw new NullArgumentException("Аргумент = null");
    }
}
