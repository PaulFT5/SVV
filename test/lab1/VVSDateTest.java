package lab1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VVSDateTest {

    private int diff(int d1, int m1, int y1, int d2, int m2, int y2) {
        return new VVSDate(d1, m1, y1).getDays(new VVSDate(d2, m2, y2));
    }

    @Test
    void sameDate() {
        assertEquals(0, diff(15, 6, 2023, 15, 6, 2023));
    }

    @Test
    void nextDay() {
        assertEquals(1, diff(2, 1, 2020, 1, 1, 2020));
    }

    @Test
    void previousDayIsNegative() {
        assertEquals(-1, diff(1, 1, 2020, 2, 1, 2020));
    }

    @Test
    void monthBoundary() {
        assertEquals(1, diff(1, 2, 2021, 31, 1, 2021));
    }

    @Test
    void febToMarNormalYear() {
        assertEquals(1, diff(1, 3, 2021, 28, 2, 2021));
    }

    @Test
    void febToMarLeapYear() {
        assertEquals(2, diff(1, 3, 2020, 28, 2, 2020));
    }

    @Test
    void leapDayItself() {
        assertEquals(1, diff(29, 2, 2020, 28, 2, 2020));
        assertEquals(1, diff(1, 3, 2020, 29, 2, 2020));
    }

    @Test
    void year1900IsNotLeap() {
        assertEquals(1, diff(1, 3, 1900, 28, 2, 1900));
    }

    @Test
    void year2000IsLeap() {
        assertEquals(2, diff(1, 3, 2000, 28, 2, 2000));
    }

    @Test
    void yearBoundary() {
        assertEquals(1, diff(1, 1, 2021, 31, 12, 2020));
    }

    @Test
    void fullLeapYear() {
        assertEquals(366, diff(1, 1, 2021, 1, 1, 2020));
    }

    @Test
    void fullNormalYear() {
        assertEquals(365, diff(1, 1, 2022, 1, 1, 2021));
    }

    @Test
    void fourHundredYears() {
        assertEquals(146097, diff(1, 1, 2400, 1, 1, 2000));
    }
}