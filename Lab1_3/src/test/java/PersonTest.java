import static org.junit.Assert.*;

import org.example.FacialExpression;
import org.example.LegState;
import org.example.Person;
import org.junit.Test;

public class PersonTest {

    @Test
    public void testPersonCreation() {
        Person ford = new Person("Ford");
        assertEquals("Ford", ford.getName());
    }

    @Test
    public void testFacialExpression() {
        Person ford = new Person("Ford");
        ford.setFacialExpression(FacialExpression.SHOCK);
        assertEquals(FacialExpression.SHOCK, ford.getFacialExpression());
    }

    @Test
    public void testLegState() {
        Person ford = new Person("Ford");
        ford.setLegState(LegState.CANNOT_FIND_GROUND);
        assertEquals(LegState.CANNOT_FIND_GROUND, ford.getLegState());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidPersonCreation() {
        Person person = new Person(null);
    }
}
