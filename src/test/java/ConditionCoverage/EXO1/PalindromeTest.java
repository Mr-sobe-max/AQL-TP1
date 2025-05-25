package ConditionCoverage.EXO1;

import org.example.com.EXO1.Palindrome;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {
    @Test
    void testPalindromeWithValidPalindrome() {
        assertTrue(Palindrome.isPalindrome("deked"));
    }

    @Test
    void testPalindromeWithNonPalindrome() {
        assertFalse(Palindrome.isPalindrome("hello"));
    }

    @Test
    void testPalindromeWithNull() {
        assertThrows(NullPointerException.class, () -> Palindrome.isPalindrome(null));
    }

    @Test
    void testPalindromeWithEmptyString() {
        assertTrue(Palindrome.isPalindrome(""));
    }

    @Test
    void testPalindromeWithSingleCharacter() {
        assertTrue(Palindrome.isPalindrome("a"));
    }
}
