package ConditionCoverage.EXO6;

import org.example.com.EXO6.FizzBuzz;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    @Test
    void testFizzBuzzWithDivisibleBy3Only() {
        assertEquals("Fizz", FizzBuzz.fizzBuzz(3));
    }

    @Test
    void testFizzBuzzWithDivisibleBy5Only() {
        assertEquals("Buzz", FizzBuzz.fizzBuzz(5));
    }

    @Test
    void testFizzBuzzWithDivisibleBy3And5() {
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(15));
    }

    @Test
    void testFizzBuzzWithNonDivisible() {
        assertEquals("7", FizzBuzz.fizzBuzz(7));
    }

    @Test
    void testFizzBuzzWithNumberLessThanOrEqualToOne() {
        assertThrows(IllegalArgumentException.class, () -> FizzBuzz.fizzBuzz(0));
        assertThrows(IllegalArgumentException.class, () -> FizzBuzz.fizzBuzz(1));
    }
}
