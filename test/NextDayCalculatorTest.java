import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {

    @Test
    void testNextDayCalculator1() {
        int day = 1;
        int month = 1;
        int year = 2018;
        String expected = "2/1/2018";

        String result = NextDayCalculator.nextDayCalculator(day, month, year);
        assertEquals(expected,result);
    }

    @Test
    void testNextDayCalculator2() {
        int day = 31;
        int month = 1;
        int year = 2018;
        String expected = "1/2/2018";

        String result = NextDayCalculator.nextDayCalculator(day, month, year);
        assertEquals(expected,result);
    }

    @Test
    void testNextDayCalculator3() {
        int day = 30;
        int month = 4;
        int year = 2018;
        String expected = "1/5/2018";

        String result = NextDayCalculator.nextDayCalculator(day, month, year);
        assertEquals(expected,result);
    }

    @Test
    void testNextDayCalculator4() {
        int day = 28;
        int month = 2;
        int year = 2018;
        String expected = "1/3/2018";

        String result = NextDayCalculator.nextDayCalculator(day, month, year);
        assertEquals(expected,result);
    }

    @Test
    void testNextDayCalculator5() {
        int day = 29;
        int month = 2;
        int year = 2020;
        String expected = "1/3/2020";

        String result = NextDayCalculator.nextDayCalculator(day, month, year);
        assertEquals(expected,result);
    }

    @Test
    void testNextDayCalculator6() {
        int day = 31;
        int month = 12;
        int year = 2018;
        String expected = "1/1/2019";

        String result = NextDayCalculator.nextDayCalculator(day, month, year);
        assertEquals(expected,result);
    }

    @Test
    void testNextDayCalculator7() {
        int day = 32;
        int month = 12;
        int year = 2018;
        String expected = "Input error";

        String result = NextDayCalculator.nextDayCalculator(day, month, year);
        assertEquals(expected,result);
    }
}