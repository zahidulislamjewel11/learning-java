package com.zahid.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


public class CalculatorTest {

    @Test
   public void testAddTwoNumbers() {
       Calculator calculator = new Calculator();
       int expected = 13;
       int actual = calculator.add(4, 9);

       assertEquals(expected, actual);
    }

    @Test
    public void testAddNumberArray() {
        Calculator calculator = new Calculator();

        int[] nums = {4, 9, 2, 3, 5};
        int expected = 23;
        int actual = calculator.add(nums);

        assertEquals(expected, actual);
    }
}