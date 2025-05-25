package ConditionCoverage.EXO4;

import org.example.com.EXO4.QuadraticEquation;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class QuadraticEquationTest {
    @Test
    void testSolveWithPositiveDelta() {
        double[] roots = QuadraticEquation.solve(1, -3, 2);
        assertArrayEquals(new double[]{2, 1}, roots, 0.001);
    }

    @Test
    void testSolveWithZeroDelta() {
        double[] roots = QuadraticEquation.solve(1, -2, 1);
        assertArrayEquals(new double[]{1}, roots, 0.001);
    }

    @Test
    void testSolveWithNegativeDelta() {
        assertNull(QuadraticEquation.solve(1, 0, 1));
    }

    @Test
    void testSolveWithZeroA() {
        assertThrows(IllegalArgumentException.class, () -> QuadraticEquation.solve(0, 1, 1));
    }
}