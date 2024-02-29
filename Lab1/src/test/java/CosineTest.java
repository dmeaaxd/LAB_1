import static org.junit.Assert.*;

import org.example.Cosine;
import org.junit.Test;

public class CosineTest {

    // Погрешность для сравнения значений double
    private static final double DELTA = 1e-10;

    @Test
    public void testCosineZero() {
        assertEquals(1.0, Cosine.cosine(0), DELTA);
    }

    @Test
    public void testCosinePi() {
        assertEquals(-1.0, Cosine.cosine(Math.PI), DELTA);
    }

    @Test
    public void testCosinePiOver2() {
        assertEquals(0.0, Cosine.cosine(Math.PI / 2), DELTA);
    }

    @Test
    public void testCosinePiOver4() {
        assertEquals(Math.sqrt(2) / 2, Cosine.cosine(Math.PI / 4), DELTA);
    }

    @Test
    public void testCosineNegative() {
        assertEquals(Cosine.cosine(-Math.PI / 3), Cosine.cosine(Math.PI / 3), DELTA);
    }

    // Дополнительные тесты для обеспечения покрытия
    @Test
    public void testCosinePositiveInput() {
        assertTrue(Cosine.cosine(0.5) < 1);
        assertTrue(Cosine.cosine(1) < 1);
        assertTrue(Cosine.cosine(2) < 1);
    }

    @Test
    public void testCosineNegativeInput() {
        assertTrue(Cosine.cosine(-0.5) > -1);
        assertTrue(Cosine.cosine(-1) > -1);
        assertTrue(Cosine.cosine(-2) > -1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCosineNaN() {
        Cosine.cosine(Double.NaN);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCosinePositiveInfinity() {
        Cosine.cosine(Double.POSITIVE_INFINITY);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCosineNegativeInfinity() {
        Cosine.cosine(Double.NEGATIVE_INFINITY);
    }
}
