package test.java;

import main.java.Adder;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AdderTest {

    @Test
    public void testAdd() {
        Adder adder = new Adder();

        // Test adding positive numbers
        assertEquals(10, adder.add(5, 5));

        // Test adding negative numbers
        assertEquals(-10, adder.add(-5, -5));

        // Test adding a positive and a negative number
        assertEquals(0, adder.add(5, -5));
    }
}
