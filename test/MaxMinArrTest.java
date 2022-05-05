import org.junit.Test;

import static org.junit.Assert.*;

public class MaxMinArrTest {

    @Test
    public void minArr5() {
        MaxMinArr tester = new MaxMinArr();
        int[] arr = {5,99,8};
        assertEquals("5 should be the minimum", 5,tester.minArr(arr));
    }

    @Test
    public void minArr0() {
        MaxMinArr tester = new MaxMinArr();
        int[] arr = {5,99,8,0,3};
        assertEquals("0 should be the minimum", 0,tester.minArr(arr));
    }

    @Test
    public void minArrNegative5() {
        MaxMinArr tester = new MaxMinArr();
        int[] arr = {-5,99,8,-0,-3};
        assertEquals("-5 should be the minimum", -5,tester.minArr(arr));
    }

    @Test
    public void minArrNegative9() {
        MaxMinArr tester = new MaxMinArr();
        int[] arr = {-5,-9,8,-0,-3};
        assertEquals("-9 should be the minimum", -9,tester.minArr(arr));
    }

    @Test
    public void maxArr8() {
        MaxMinArr tester = new MaxMinArr();
        int[] arr = {-5,-9,8,-0,-3};
        assertEquals("8 should be the maximum", 8,tester.maxArr(arr));
    }

    @Test
    public void maxArr5() {
        MaxMinArr tester = new MaxMinArr();
        int[] arr = {5,99,8};
        assertEquals("99 should be the maximum", 99,tester.maxArr(arr));
    }

    @Test
    public void maxArr9() {
        MaxMinArr tester = new MaxMinArr();
        int[] arr = {5,9,8,0,3};
        assertEquals("9 should be the maximum", 9,tester.maxArr(arr));
    }
}