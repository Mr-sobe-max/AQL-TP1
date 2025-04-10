package BranchCoverage.EXO5;

import org.example.com.EXO5.RomanNumeral;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RomanNumeralTest {
    @Test
    void testToRomanWithSimpleNumber() {
        assertEquals("X", RomanNumeral.toRoman(10));
    }

    @Test
    void testToRomanWithSubtraction() {
        assertEquals("XL", RomanNumeral.toRoman(40));
        assertEquals("XC", RomanNumeral.toRoman(90));
    }

    @Test
    void testToRomanWithComplexNumber() {
        assertEquals("MMXXI", RomanNumeral.toRoman(2021));
    }

    @Test
    void testToRomanWithInvalidNumber() {
        assertThrows(IllegalArgumentException.class, () -> RomanNumeral.toRoman(-1));
        assertThrows(IllegalArgumentException.class, () -> RomanNumeral.toRoman(4000));
    }
}