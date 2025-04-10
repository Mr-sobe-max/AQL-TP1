package ConditionCoverage.EXO5;

import org.example.com.EXO5.RomanNumeral;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RomanNumeralTest {
    @Test
    void testToRomanWithSimpleNumber() {
        assertEquals("V", RomanNumeral.toRoman(5));
    }

    @Test
    void testToRomanWithSubtraction() {
        assertEquals("CM", RomanNumeral.toRoman(900));
    }

    @Test
    void testToRomanWithComplexNumber() {
        assertEquals("MCMLIV", RomanNumeral.toRoman(1954));
    }

    @Test
    void testToRomanWithNumberLessThanOne() {
        assertThrows(IllegalArgumentException.class, () -> RomanNumeral.toRoman(0));
    }

    @Test
    void testToRomanWithNumberGreaterThan3999() {
        assertThrows(IllegalArgumentException.class, () -> RomanNumeral.toRoman(4000));
    }
}
