package ConditionCoverage.EXO2;

import org.example.com.EXO2.Anagram;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {
    @Test
    void testAnagramWithValidAnagram() {
        assertTrue(Anagram.isAnagram("debit", "bited"));
    }

    @Test
    void testAnagramWithNonAnagram() {
        assertFalse(Anagram.isAnagram("hello", "world"));
    }

    @Test
    void testAnagramWithNullS1() {
        assertThrows(NullPointerException.class, () -> Anagram.isAnagram(null, "test"));
    }

    @Test
    void testAnagramWithNullS2() {
        assertThrows(NullPointerException.class, () -> Anagram.isAnagram("test", null));
    }

    @Test
    void testAnagramWithEmptyStrings() {
        assertTrue(Anagram.isAnagram("", ""));
    }

    @Test
    void testAnagramWithDifferentLengths() {
        assertFalse(Anagram.isAnagram("cat", "cats"));
    }
}
