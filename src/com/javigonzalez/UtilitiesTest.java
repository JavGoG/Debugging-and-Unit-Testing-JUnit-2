package com.javigonzalez;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.fail;


public class UtilitiesTest {
    private Object ArithmeticException;

    @org.junit.Test
    public void everyNthChar() throws Exception {
        fail("This test has not been implemented");
    }

    @org.junit.Test
    public void removePairs() throws Exception {
        Utilities util = new Utilities();
        assertEquals("ABCDEF", util.removePairs("AABCDDEFF"));
        Assertions.assertEquals("ABCABDEF", util.removePairs("ABCCABDEEF"));
    }

    @org.junit.Test
    public void converter() throws Exception {
        Utilities util = new Utilities();
        assertEquals(300,util.converter(10, 5));
    }
    @org.junit.Test(expected = java.lang.ArithmeticException.class)
    public void converter2() throws Exception {
        Utilities util = new Utilities();
        assertEquals(ArithmeticException,util.converter2(10, 0));
    }

    @org.junit.Test
    public void nullIfOddLength() throws Exception {
        fail("This test has not been implemented");
    }

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testEveryNthChar() {
    }

    @Test
    void testRemovePairs() {
    }

    @Test
    void testConverter() {
    }

    @Test
    void testNullIfOddLength() {
    }
}