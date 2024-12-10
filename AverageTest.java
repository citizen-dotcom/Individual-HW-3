import static org.junit.Assert.*;
import org.junit.Test;

public class AverageTest {
    private Average avg = new Average();

    @Test
    public void testNormalCase() {
        int[] input = {1, 2, 3, 4, 5};
        assertEquals(2, avg.average(3, input));
    }

    @Test
    public void testEmptyArray() {
        int[] input = {};
        assertEquals(0, avg.average(3, input));
    }

    @Test
    public void testNegativeK() {
        int[] input = {1, 2, 3};
        assertEquals(0, avg.average(-1, input));
    }

    @Test
    public void testZeroK() {
        int[] input = {1, 2, 3};
        assertEquals(0, avg.average(0, input));
    }

    @Test
    public void testKLargerThanLength() {
        int[] input = {1, 2, 3};
        assertEquals(2, avg.average(5, input));
    }

    @Test
    public void testSingleElement() {
        int[] input = {5};
        assertEquals(5, avg.average(1, input));
    }
}
