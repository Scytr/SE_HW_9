import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import uni.koeln.se.Calendar;

import java.util.GregorianCalendar;

import static org.junit.jupiter.api.Assertions.*;

class TestCalendar {
    @ParameterizedTest
    @ValueSource(ints = {1904, 1908, 1912, 1916, 2000})
    void Should_check_if_year_is_leap_also_in_gregorian(int year) {
        boolean expectedResult = ((GregorianCalendar) GregorianCalendar.getInstance()).isLeapYear(year);
        boolean actualResult = (new Calendar(year)).isLeapYear();

        assertEquals(expectedResult, actualResult);
    }

// Implement test cases for the equivalent partitions
    @ParameterizedTest
    @ValueSource(ints = {1901, 1902, 1903, 1905})
    void Should_check_if_year_is_not_leap_also_in_gregorian(int year) {
        boolean expectedResult = ((GregorianCalendar) GregorianCalendar.getInstance()).isLeapYear(year);
        boolean actualResult = (new Calendar(year)).isLeapYear();

        assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 1800, 1802, 1804, 1900})
    void Should_always_return_false_for_years_before_20th_century(int year) {
        boolean actualResult = (new Calendar(year)).isLeapYear();

        assertFalse(actualResult);
    }

    @ParameterizedTest
    @ValueSource(ints = {2001, 2004, 3000, 4000})
    void Should_always_return_false_for_years_after_20th_century(int year) {
        boolean actualResult = (new Calendar(year)).isLeapYear();

        assertFalse(actualResult);
    }
}
