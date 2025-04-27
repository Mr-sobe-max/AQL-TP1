package BranchCoverage.EXO6;

import org.example.com.EXO6.FizzBuzz;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/* EXO 06 TEST */
class FizzBuzzTest {
    @Test
    void testFizzBuzzWithDivisibleBy3() {
        assertEquals("Fizz", FizzBuzz.fizzBuzz(6));
    }

    @Test
    void testFizzBuzzWithDivisibleBy5() {
        assertEquals("Buzz", FizzBuzz.fizzBuzz(10));
    }

    @Test
    void testFizzBuzzWithDivisibleBy15() {
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(30));
    }

    @Test
    void testFizzBuzzWithNonDivisible() {
        assertEquals("7", FizzBuzz.fizzBuzz(7));
    }

    @Test
    void testFizzBuzzWithInvalidNumber() {
        assertThrows(IllegalArgumentException.class, () -> FizzBuzz.fizzBuzz(1));
    }
}