package com.github.hcsp.calculation;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    public void test() {
        assertDoubleArrayEquals(new double[] {2d}, Solution.calculate(1, -4, 4));
        assertDoubleArrayEquals(new double[] {4d, -4d}, Solution.calculate(1, 0, -16));
        assertDoubleArrayEquals(new double[] {}, Solution.calculate(1, 1, 1));
    }

    private void assertDoubleArrayEquals(double[] expected, double[] actual) {
        assertEquals(expected.length, actual.length);
        java.util.Arrays.sort(expected);
        java.util.Arrays.sort(actual);
        for (int i = 0; i < expected.length; ++i) {
            assertTrue(Math.abs(expected[i] - actual[i]) < 0.0001);
        }
    }
}
