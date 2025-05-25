package LineCoverage.EXO3;

import org.example.com.EXO3.BinarySearch;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {
    @Test
    void testBinarySearchWithElementPresent() {
        int[] array = {1, 2, 3, 4, 5};
        assertEquals(2, BinarySearch.binarySearch(array, 3));
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

    @Test
    void testBinarySearchWithEmptyArray() {
        int[] array = {};
        assertEquals(-1, BinarySearch.binarySearch(array, 1));
    }

    @Test
    void testBinarySearchWithSingleElement() {
        int[] array = {1};
        assertEquals(0, BinarySearch.binarySearch(array, 1));
    }
}