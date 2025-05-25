package BranchCoverage.EXO4;

import org.example.com.EXO4.QuadraticEquation;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class QuadraticEquationTest {
    @Test
    void testSolveWithTwoRoots() {
        double[] roots = QuadraticEquation.solve(2, -7, 3);
        assertArrayEquals(new double[]{3, 0.5}, roots, 0.001);
    }

    @Test
    void testSolveWithOneRoot() {
        double[] roots = QuadraticEquation.solve(1, -2, 1);
        assertArrayEquals(new double[]{1}, roots, 0.001);
    }

    @Test
    void testSolveWithNoRoots() {
        assertNull(QuadraticEquation.solve(1, 0, 1));
    }

    @Test
    void testSolveWithZeroA() {
        assertThrows(IllegalArgumentException.class, () -> QuadraticEquation.solve(0, 1, 1));
    }
}