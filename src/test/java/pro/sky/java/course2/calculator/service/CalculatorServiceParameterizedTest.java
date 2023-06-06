package pro.sky.java.course2.calculator.service;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import pro.sky.java.course2.calculator.exception.NullArgumentException;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static pro.sky.java.course2.calculator.constants.CalculatorServiceImpTestConstants.*;

public class CalculatorServiceParameterizedTest {

    private final CalculatorServiceImp out = new CalculatorServiceImp();

    @ParameterizedTest
    @MethodSource("provideParamsForPositiveTest")
    public void shouldPositiveSum(Integer num1, Integer num2){
        Integer actual = out.plus(num1, num2);
        Integer expected = num1 + num2;
        assertEquals(actual, expected);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForPositiveTest")
    public void shouldPositiveMinus(Integer num1, Integer num2){
        Integer actual = out.minus(num1, num2);
        Integer expected = num1 - num2;
        assertEquals(actual, expected);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForPositiveTest")
    public void shouldPositiveDivide(Integer num1, Integer num2){
        Integer actual = out.divide(num1, num2);
        Integer expected = num1 / num2;
        assertEquals(actual, expected);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForPositiveTest")
    public void shouldPositiveMultiply(Integer num1, Integer num2){
        Integer actual = out.multiply(num1, num2);
        Integer expected = num1 * num2;
        assertEquals(actual, expected);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForNegativeTest")
    public void shouldThrowNullArgumentExceptionWhenDivisionByZero(Integer num1, Integer num2){
        assertThrows(NullArgumentException.class,
                () -> out.divide(num1, num2));
    }

    public static Stream<Arguments> provideParamsForPositiveTest() {
        return Stream.of(
                Arguments.of(POSITIVE_NUMBER_1, POSITIVE_NUMBER_2),
                Arguments.of(NEGATIVE_NUMBER_1, POSITIVE_NUMBER_2),
                Arguments.of(NEGATIVE_NUMBER_1, NEGATIVE_NUMBER_2),
                Arguments.of(POSITIVE_NUMBER_1, NEGATIVE_NUMBER_2)
        );
    }

    public static Stream<Arguments> provideParamsForNegativeTest() {
        return Stream.of(
                Arguments.of(NULL, NULL),
                Arguments.of(POSITIVE_NUMBER_1, NULL),
                Arguments.of(NULL, POSITIVE_NUMBER_2),
                Arguments.of(POSITIVE_NUMBER_1, ZERO),
                Arguments.of(NEGATIVE_NUMBER_2, ZERO)
        );
    }



}
