import static org.junit.Assert.*;

import org.example.OpenAddressingHashTable;
import org.junit.Test;

public class OpenAddressingHashTableTest {

    @Test
    public void testAddAndContains() {
        OpenAddressingHashTable table = new OpenAddressingHashTable();
        table.add(5);
        table.add(10);
        table.add(15);

        assertTrue(table.contains(5));
        assertTrue(table.contains(10));
        assertTrue(table.contains(15));
        assertFalse(table.contains(7)); // 7 не было добавлено
    }

    @Test
    public void testCapacity() {
        OpenAddressingHashTable table = new OpenAddressingHashTable(3);
        table.add(5);
        table.add(10);
        table.add(15);

        assertTrue(table.contains(5));
        assertTrue(table.contains(10));
        assertTrue(table.contains(15));
    }


    @Test(expected = IllegalArgumentException.class)
    public void testAddNegativeValue() {
        OpenAddressingHashTable table = new OpenAddressingHashTable();
        table.add(-5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddDuplicateValue() {
        OpenAddressingHashTable table = new OpenAddressingHashTable();
        table.add(5);
        table.add(5); // дубликат
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddNaNValue() {
        OpenAddressingHashTable table = new OpenAddressingHashTable();
        table.add((int) Double.NaN);
    }
}

