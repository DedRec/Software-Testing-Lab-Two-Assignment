import org.junit.Test;

import static org.junit.Assert.*;

public class NumberTest {

    @Test
    public void testEvenOddChecker2() {
        Number tester = new Number();
        assertEquals("2 should be Even", "Even", tester.evenOddChecker(2));
    }
    @Test
    public void testEvenOddChecker5() {
        Number tester = new Number();
        assertEquals("5 should be Odd", "Odd", tester.evenOddChecker(5));
    }
    @Test
    public void testEvenOddChecker10() {
        Number tester = new Number();
        assertEquals("10 should be Even", "Even", tester.evenOddChecker(10));
    }
    @Test
    public void testEvenOddChecker1() {
        Number tester = new Number();
        assertEquals("1 should be Odd", "Odd", tester.evenOddChecker(1));
    }
    @Test
    public void testEvenOddChecker0() {
        Number tester = new Number();
        assertEquals("0 should be Even", "Even", tester.evenOddChecker(0));
    }
    @Test
    public void testEvenOddCheckernegative0() {
        Number tester = new Number();
        assertEquals("-0 should be Even", "Even", tester.evenOddChecker(-0));
    }
    @Test
    public void testEvenOddCheckernegative2() {
        Number tester = new Number();
        assertEquals("-2 should be Even", "Even", tester.evenOddChecker(-2));
    }
    @Test
    public void testEvenOddCheckernegative5() {
        Number tester = new Number();
        assertEquals("-5 should be Odd", "Odd", tester.evenOddChecker(-5));
    }
}