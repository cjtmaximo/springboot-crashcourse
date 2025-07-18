package org.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    void setup () {
        calculator = new Calculator();
    }

    @Test
    void shouldBeTurnedOff() {
        assertFalse(calculator.isOn());
    }

    @Test
    void shouldTurnOn() {
        calculator.turnOn();
        assertTrue(calculator.isOn());
    }

    @Test
    void shouldTurnOff() {
        calculator.turnOn();
        assertTrue(calculator.isOn());

        calculator.turnOff();
        assertFalse(calculator.isOn());
    }

    @Test
    void shouldBeTurnedOffAfterOpened() {
        calculator.turnOn();
        assertTrue(calculator.isOn());

        calculator.turnOff();
        assertTrue(calculator.isOff());
    }

    @Test
    void testSumInt() {
        int result = calculator.add(1, 5);
        assertEquals(6, result);
    }

    @Test
    void testSumDouble() {
        double result = calculator.add(1.5, 5.5);
        assertEquals(7.0, result, .0001);
    }

    @Test
    void testSumFloat() {
        float result = calculator.add(1.5f, 5.5f);
        assertEquals(7.0, result, .0001);
    }

    @Test
    void testSumLong() {
        long result = calculator.add(1L, 2L);
        assertEquals(3, result, .0001);
    }

    @Test
    void testSumShort() {
        short result = calculator.add((short) 1, (short) 2);
        assertEquals(3, result, .0001);
    }

    @Test
    void testSubtractInt() {
        int result = calculator.subtract(5, 1);
        assertEquals(4, result);
    }

    @Test
    void testSubtractDouble() {
        int result = calculator.subtract(5, 1);
        assertEquals(4, result);
    }

    @Test
    void testSubtractFloat() {
        float result = calculator.subtract(5.5f, 1.9f);
        assertEquals(3.6, result, .0001);
    }

    @Test
    void testSubtractLong() {
        long result = calculator.subtract(5L, 2L);
        assertEquals(3L, result);
    }

    @Test
    void testSubtractShort() {
        short result = calculator.subtract((short) 5, (short) 2);
        assertEquals(3, result);
    }

    @Test
    void testMultiplyInt() {
        int result = calculator.multiply(5, 3);
        assertEquals(15, result);
    }

    @Test
    void testMultiplyDouble() {
        double result = calculator.multiply(5.0, 3.0);
        assertEquals(15.0, result, .0001);
    }

    @Test
    void testMultiplyFloat() {
        float result = calculator.multiply(5.0f, 3.0f);
        assertEquals(15.0f, result, .0001);
    }

    @Test
    void testMultiplyLong() {
        long result = calculator.multiply(5L, 3L);
        assertEquals(15L, result, .0001);
    }

    @Test
    void testMultiplyShort() {
        short result = calculator.multiply((short) 5, (short) 3);
        assertEquals(15L, result, .0001);
    }

    @Test
    void testDivideInt() {
        int result = calculator.divide(15, 3);
        assertEquals(5, result);
    }

    @Test
    void testDivideDouble() {
        double result = calculator.divide(15.0, 3.0);
        assertEquals(5.0, result, .0001);
    }

    @Test
    void testDivideFloat() {
        float result = calculator.divide(15.0f, 3.0f);
        assertEquals(5.0f, result, .0001);
    }

    @Test
    void testDivideLong() {
        long result = calculator.divide(15L, 3L);
        assertEquals(5L, result, .0001);
    }

    @Test
    void testDivideShort() {
        short result = calculator.divide((short) 15, (short) 3);
        assertEquals(5, result, .0001);
    }

    @Test(expected=Ari)
    void testDivideIntByZero() {
        int result = calculator.divide(15, 0);
        assertEquals(-1, result); // Dividing by zero should return -1
    }
}