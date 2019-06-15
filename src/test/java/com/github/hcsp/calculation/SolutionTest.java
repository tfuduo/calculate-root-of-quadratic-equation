package com.github.hcsp.calculation;

import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void test() {
        assertDoubleArrayEquals(new double[] {2d}, Solution.calculate(1, -4, 4));
        assertDoubleArrayEquals(new double[] {4d, -4d}, Solution.calculate(1, 0, -16));
        assertDoubleArrayEquals(new double[] {}, Solution.calculate(1, 1, 1));
    }

    private void assertDoubleArrayEquals(double[] expected, double[] actual) {
        Assertions.assertEquals(expected.length, actual.length);
        Arrays.sort(expected);
        Arrays.sort(actual);
        for (int i = 0; i < expected.length; ++i) {
            Assertions.assertTrue(Math.abs(expected[i] - actual[i]) < 0.0001);
        }
    }
}
