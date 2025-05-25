package LineCoverage.EXO6;

import org.example.com.EXO6.FizzBuzz;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FizzBuzzTest {
    @Test
    void testFizzBuzzWithDivisibleBy3() {
        assertEquals("Fizz", FizzBuzz.fizzBuzz(3));
    }

    @Test
    void testFizzBuzzWithDivisibleBy5() {
        assertEquals("Buzz", FizzBuzz.fizzBuzz(5));
    }

    @Test
    void testFizzBuzzWithDivisibleBy15() {
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(15));
    }

    @Test
    void testFizzBuzzWithNonDivisible() {
        assertEquals("7", FizzBuzz.fizzBuzz(7));
    }

    @Test
    void testFizzBuzzWithInvalidNumber() {
        assertThrows(IllegalArgumentException.class, () -> FizzBuzz.fizzBuzz(0));
    }
}
