package ConditionCoverage.EXO3;

import org.example.com.EXO3.BinarySearch;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {
    @Test
    void testBinarySearchWithElementInMiddle() {
        int[] array = {1, 2, 3, 4, 5};
        assertEquals(2, BinarySearch.binarySearch(array, 3));
    }

    @Test
    void testBinarySearchWithElementGreaterThanMiddle() {
        int[] array = {1, 2, 3, 4, 5};
        assertEquals(4, BinarySearch.binarySearch(array, 5));
    }

    @Test
    void testBinarySearchWithElementLessThanMiddle() {
        int[] array = {1, 2, 3, 4, 5};
        assertEquals(0, BinarySearch.binarySearch(array, 1));
    }

    @Test
    void testBinarySearchWithElementAbsent() {
        int[] array = {1, 2, 3, 4, 5};
        assertEquals(-1, BinarySearch.binarySearch(array, 6));
    }

    @Test
    void testBinarySearchWithNullArray() {
        assertThrows(NullPointerException.class, () -> BinarySearch.binarySearch(null, 1));
    }
}
