package com.cts;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AssertionDemoTest {

    AssertionDemo demo = new AssertionDemo();

    @Test
    public void testAdd() {
        assertEquals(15, demo.add(10, 5));
    }

    @Test
    public void testEvenNumber() {
        assertTrue(demo.isEven(8));
    }

    @Test
    public void testOddNumber() {
        assertFalse(demo.isEven(7));
    }

    @Test
    public void testMessage() {
        assertNotNull(demo.getMessage());
    }
}