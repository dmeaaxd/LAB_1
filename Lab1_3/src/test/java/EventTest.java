import static org.junit.Assert.*;

import org.example.Event;
import org.junit.Ignore;
import org.junit.Test;

public class EventTest {

    @Ignore
    @Test
    public void testEventDescription() {
        Event event = new Event("Unexplained occurrence");
        assertEquals("Unexplained occurrence", event.getDescription());
    }


    @Ignore
    @Test(expected = IllegalArgumentException.class)
    public void testInvalidEventCreation() {
        Event event = new Event(null);
    }
}
