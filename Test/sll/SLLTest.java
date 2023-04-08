package sll;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class SLLTest {
    private SLL sll;

    @Before
    public void setUp() {
        sll = new SLL();
    }

    @Test(expected = NullPointerException.class)
    public void testInsert_n1IsNull() {
        Node n1 = null;
        Node n2 = new Node("test");
        sll.insert(n1, n2);
    }

    @Test
    public void testInsert_headIsNull() {
        Node n1 = new Node("test");
        Node n2 = new Node("second");
        sll.insert(n1, n2);
        assertEquals("test ", sll.toString());
        assertEquals(1, sll.size());
    }

    @Test(expected = NullPointerException.class)
    public void testInsert_n2IsNull() {
        Node n1 = new Node("test");
        Node n3 = new Node("hello");
        sll.insert(n1, null);
        sll.insert(n3, null);
        assertEquals(2, sll.size());
    }

    @Test
    public void testInsert_n2IsHead() {
        Node n1 = new Node("second");
        sll.insert(n1, null); // Insert the first node
        Node n2 = new Node("first");
        sll.insert(n2, n1);
        assertEquals("first second ", sll.toString());
        assertEquals(2, sll.size());
    }

    @Test
    public void testInsert_n2NotHead() {
        Node n1 = new Node("first");
        Node n2 = new Node("second");
        Node n3 = new Node("third");
        sll.insert(n1, null); // Insert the first node
        sll.insert(n3, n1); // Insert the second node
        sll.insert(n2, n1);    // Insert n3 before n2
        assertEquals("third second first ", sll.toString());
        assertEquals(3, sll.size());
    }


}
