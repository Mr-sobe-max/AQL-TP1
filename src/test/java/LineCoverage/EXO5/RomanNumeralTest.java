package LineCoverage.EXO5;

import org.example.com.EXO5.RomanNumeral;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RomanNumeralTest {
    @Test
    void testToRomanWithSimpleNumber() {
        assertEquals("I", RomanNumeral.toRoman(1));
    }

    @Test
    void testToRomanWithSubtraction() {
        assertEquals("IV", RomanNumeral.toRoman(4));
        assertEquals("IX", RomanNumeral.toRoman(9));
    }

    @Test
    void testToRomanWithComplexNumber() {
        assertEquals("MCMLIV", RomanNumeral.toRoman(1954));
    }

    @Test
    void testToRomanWithInvalidNumber() {
        assertThrows(IllegalArgumentException.class, () -> RomanNumeral.toRoman(0));
        assertThrows(IllegalArgumentException.class, () -> RomanNumeral.toRoman(4000));
    }
}
