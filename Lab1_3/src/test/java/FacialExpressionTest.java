import static org.junit.Assert.*;

import org.example.FacialExpression;
import org.junit.Test;

public class FacialExpressionTest {

    @Test
    public void testEnumValues() {
        assertEquals(5, FacialExpression.values().length);
        assertArrayEquals(new FacialExpression[]{FacialExpression.SHOCK, FacialExpression.SURPRISE, FacialExpression.BEWILDERMENT,
                FacialExpression.ASTONISHMENT, FacialExpression.AMAZEMENT}, FacialExpression.values());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidExpressionCreation() {
        try {
            FacialExpression expression = FacialExpression.fromString(null);
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (Exception e) {
            fail("Unexpected exception type");
        }
    }
}
