import org.junit.jupiter.api.Test;

import uni.koeln.se.Calculator;

import static org.junit.jupiter.api.Assertions.*;


class TestCalculator {

    Calculator calculator = new Calculator();

    @Test
    void Should_add_two_numbers_and_return_result() {
        int expectedResult = 2 + 3;
        int actualResult = calculator.add(2, 3);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void Should_subtract_two_numbers_and_return_result() {
        int expectedResult = 5 - 7;
        int actualResult = calculator.sub(5, 7);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void Should_multiply_two_numbers_and_return_result() {
        int expectedResult = 4 * 4;
        int actualResult = calculator.multiply(4, 4);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void Should_divide_two_numbers_and_return_result() {
        float expectedResult = 9f / 2;
        float actualResult = calculator.divide(9, 2);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void Should_throw_an_arithmetic_exception_if_denominator_is_zero() {
        assertThrows(ArithmeticException.class, () -> calculator.divide(1, 0));
    }
}