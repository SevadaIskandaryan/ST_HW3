package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class StringManipulatorTest {

    @Test
    public void testConcat() {
        StringManipulator manipulator = new StringManipulator();
        assertEquals("HelloWorld", manipulator.concat("Hello", "World"));
    }

    @Test
    public void testCapitalize() {
        StringManipulator manipulator = new StringManipulator();
        assertEquals("HELLO WORLD", manipulator.capitalize("hello world"));
    }

    @Test
    public void testRemoveWhitespaces() {
        StringManipulator manipulator = new StringManipulator();
        assertEquals("HelloWorld", manipulator.removeWhitespaces("Hello World"));
    }

    @Test
    public void testTruncate() {
        StringManipulator manipulator = new StringManipulator();
        assertEquals("Hello...", manipulator.truncate("Hello World", 5));
    }

    @Test
    public void testTruncateLowerThanMax() {
        StringManipulator manipulator = new StringManipulator();
        assertEquals("Hello", manipulator.truncate("Hello", 6));
    }
}
