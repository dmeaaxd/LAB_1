import static org.junit.Assert.*;

import org.example.LegState;
import org.junit.Test;

public class LegStateTest {

    @Test
    public void testEnumValues() {
        assertEquals(2, LegState.values().length);
        assertArrayEquals(new LegState[]{LegState.RAISED, LegState.CANNOT_FIND_GROUND}, LegState.values());
    }
}
