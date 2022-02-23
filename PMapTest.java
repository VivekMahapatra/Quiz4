/*
 * Phase A <studentA EID><studentB EID>
 * Phase B <studentB EID><studentA EID>
 */

package pmap.phasea;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;

public class PMapTest {

    @Test
    public void testPut() {
        PMap m = new PMap();
        assertTrue(m.isEmpty());
        assertEquals(null, m.put(1, 2));
        assertEquals(1, m.size().intValue());
        assertEquals(2, m.put(1, 3).intValue());
        assertEquals(1, m.size().intValue());
    }

    @Test
    public void testSize() {
        PMap m = new PMap();
        m.put(1, 2);
        assertEquals(1, m.size().intValue());
    }

    @Test
    public void testGet() {
        PMap m = new PMap();
        m.put(1, 2);
        assertEquals(2, m.get(1).intValue());
        assertEquals(null, m.get(2));
    }
    
    @Test
    public void testcontainsVal() {
        PMap m = new PMap();
        m.put(1, 2);
        m.put(3, 4);
        m.put(6, 7);
        assertTrue(m.containsValue(4));
    }
    
    @Test
    public void testcontainsKey() {
        PMap m = new PMap();
        m.put(1, 2);
        m.put(3, 4);
        m.put(6, 7);
        assertTrue(m.containsKey(3));
    }
    
    @Test
    public void testEntrySet() {
        PMap m = new PMap();
        m.put(1, 2);
        m.put(3, 4);
        PEntry[] list = m.entrySet();
        assertEquals(list[0].getKey().intValue(), 1);
        assertEquals(list[0].getValue().intValue(), 2);
        assertEquals(list[1].getKey().intValue(), 3);
        assertEquals(list[1].getValue().intValue(), 4);
    }
    
    @Test

    public void testIsEmpty() {

              PMap m = new PMap();

              assertTrue(m.isEmpty());

              m.put(1,3);

              assertFalse(m.isEmpty());

    }

   

    @Test

    public void testKeySet() {

              PMap m = new PMap();

              Integer[] keys = {1,3,5};

              m.put(1,4);

              m.put(3, 3);

              m.put(5, 2);

              assertArrayEquals(keys, m.keySet());

    }
    
}
