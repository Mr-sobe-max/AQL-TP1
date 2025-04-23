package BranchCoverage.EXO3;

import org.example.com.EXO3.BinarySearch;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/* EXO 03 TEST */
class BinarySearchTest {
    @Test
    void testBinarySearchWithElementAtStart() {
        int[] array = {1, 2, 3, 4, 5};
        assertEquals(0, BinarySearch.binarySearch(array, 1));
    }

    @Test
    void testBinarySearchWithElementAtEnd() {
        int[] array = {1, 2, 3, 4, 5};
        assertEquals(4, BinarySearch.binarySearch(array, 5));
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
}
