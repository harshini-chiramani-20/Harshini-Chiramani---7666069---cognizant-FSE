package com.cts;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
        System.out.println("Setup completed.");
    }

    @AfterEach
    public void tearDown() {
        calculator = null;
        System.out.println("Teardown completed.");
    }

    @Test
    public void testMultiply() {

        // Arrange
        int firstNumber = 5;
        int secondNumber = 4;

        // Act
        int result = calculator.multiply(firstNumber, secondNumber);

        // Assert
        assertEquals(20, result);
    }
}