package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalcTest {

    @Test
    void testAddition() {
        Calc c = new Calc();
        assertEquals(7, c.add(3, 4));
    }

    // Add this per the tutorial
    @Test
    void testSubtraction() {
        Calc c = new Calc();
        assertEquals(2, c.subtract(4, 2));
    }
}
