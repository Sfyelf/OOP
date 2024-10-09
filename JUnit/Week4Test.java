import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Week4Test {
    @Test
    public void testMax2Int1() {
        assertEquals(5, Week4.max2Int(5, 3));
    }

    @Test
    public void testMax2Int2() {
        assertEquals(10, Week4.max2Int(10, 10));
    }

    @Test
    public void testMax2Int3() {
        assertEquals(-1, Week4.max2Int(-1, -5));
    }

    @Test
    public void testMax2Int4() {
        assertEquals(0, Week4.max2Int(0, -1));
    }

    @Test
    public void testMax2Int5() {
        assertEquals(100, Week4.max2Int(100, 50));
    }

    @Test
    public void testMinArray1() {
        int[] array = {3, 1, 4, 1, 5};
        assertEquals(1, Week4.minArray(array));
    }

    @Test
    public void testMinArray2() {
        int[] array = {-1, -3, -2};
        assertEquals(-3, Week4.minArray(array));
    }

    @Test
    public void testMinArray3() {
        int[] array = {0, 0, 0};
        assertEquals(0, Week4.minArray(array));
    }

    @Test
    public void testMinArray4() {
        int[] array = {5, 7, 9, 2, 4};
        assertEquals(2, Week4.minArray(array));
    }

    @Test
    public void testMinArray5() {
        int[] array = {10};
        assertEquals(10, Week4.minArray(array));
    }

    @Test
    public void testCalculateBMI1() {
        assertEquals("Thừa cân", Week4.calculateBMI(70, 1.75));
    }

    @Test
    public void testCalculateBMI2() {
        assertEquals("Bình thường", Week4.calculateBMI(60, 1.65));
    }

    @Test
    public void testCalculateBMI3() {
        assertEquals("Béo phì", Week4.calculateBMI(90, 1.75));
    }

    @Test
    public void testCalculateBMI4() {
        assertEquals("Bình thường", Week4.calculateBMI(50, 1.70));
    }

    @Test
    public void testCalculateBMI5() {
        assertEquals("Béo phì", Week4.calculateBMI(120, 1.60));
    }
}
