package pro.sky.java.course2.calculator.service;

import org.junit.jupiter.api.Test;
import pro.sky.java.course2.calculator.exception.NullArgumentException;

import static org.junit.jupiter.api.Assertions.*;
import static pro.sky.java.course2.calculator.constants.CalculatorServiceImpTestConstants.*;

public class CalculatorServiceImpTest {

    private final CalculatorServiceImp out = new CalculatorServiceImp();

    @Test
    public void shouldReturnSumWhenPositiveNumberInArgument() {
        Integer actual = out.plus(POSITIVE_NUMBER_1, POSITIVE_NUMBER_2);
        Integer expected = POSITIVE_NUMBER_1 + POSITIVE_NUMBER_2;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturnSumWhenNegativeNumberInArgument() {
        Integer actual = out.plus(NEGATIVE_NUMBER_1, NEGATIVE_NUMBER_2);
        Integer expected = NEGATIVE_NUMBER_1 + NEGATIVE_NUMBER_2;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldThrowNullArgumentExceptionWhenNullInArgumentInSum() {
        assertThrows(NullArgumentException.class,
                () -> out.plus(NULL, NULL));
    }
    @Test
    public void shouldReturnMinusWhenPositiveNumberInArgument() {
        Integer actual = out.minus(POSITIVE_NUMBER_1, POSITIVE_NUMBER_2);
        Integer expected = POSITIVE_NUMBER_1 - POSITIVE_NUMBER_2;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturnMinusWhenNegativeNumberInArgument() {
        Integer actual = out.minus(NEGATIVE_NUMBER_1, NEGATIVE_NUMBER_2);
        Integer expected = NEGATIVE_NUMBER_1 - NEGATIVE_NUMBER_2;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldThrowNullArgumentExceptionWhenNullInArgumentInMinus() {
        assertThrows(NullArgumentException.class,
                () -> out.minus(NULL, NULL));
    }
    @Test
    public void shouldReturnMultiplyWhenPositiveNumberInArgument() {
        Integer actual = out.multiply(POSITIVE_NUMBER_1, POSITIVE_NUMBER_2);
        Integer expected = POSITIVE_NUMBER_1 * POSITIVE_NUMBER_2;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturnMultiplyWhenNegativeNumberInArgument() {
        Integer actual = out.multiply(NEGATIVE_NUMBER_1, NEGATIVE_NUMBER_2);
        Integer expected = NEGATIVE_NUMBER_1 * NEGATIVE_NUMBER_2;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldThrowNullArgumentExceptionWhenNullInArgumentInMultiply() {
        assertThrows(NullArgumentException.class,
                () -> out.multiply(NULL, NULL));
    }
    @Test
    public void shouldReturnDivideWhenPositiveNumberInArgument() {
        Integer actual = out.divide(POSITIVE_NUMBER_1, POSITIVE_NUMBER_2);
        Integer expected = POSITIVE_NUMBER_1 / POSITIVE_NUMBER_2;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturnDivideWhenNegativeNumberInArgument() {
        Integer actual = out.divide(NEGATIVE_NUMBER_1, NEGATIVE_NUMBER_2);
        Integer expected = NEGATIVE_NUMBER_1 / NEGATIVE_NUMBER_2;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldThrowNullArgumentExceptionWhenNullInArgumentInDivide() {
        assertThrows(NullArgumentException.class,
                () -> out.divide(NULL, NULL));
    }

    @Test
    public void shouldThrowNullArgumentExceptionWhenDivisionByZero() {
        assertThrows(NullArgumentException.class,
                () -> out.divide(POSITIVE_NUMBER_2, ZERO));
    }



}
