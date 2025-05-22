package BranchCoverage.EXO2;

import org.example.com.EXO2.Anagram;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/* EXO 02 TEST */
class AnagramTest {
    @Test
    void testAnagramWithValidAnagram() {
        assertTrue(Anagram.isAnagram("listen", "silent"));
    }

    @Test
    void testAnagramWithNonAnagram() {
        assertFalse(Anagram.isAnagram("hello", "world"));
    }

    @Test
    void testAnagramWithNull() {
        assertThrows(NullPointerException.class, () -> Anagram.isAnagram(null, "test"));
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
