package DoublyLinkedList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LinkTest {

    Link link, linker;

    @Before
    public void setUp() throws Exception {
        this.link = new Link(22);
        this.linker = new Link(-10);
    }

    @After
    public void tearDown() throws Exception {
        this.link = null;
        this.linker = null;
    }

    @Test
    public void displayLink() throws Exception {
        this.link.displayLink();
        this.link = new Link(23);
        this.link.displayLink();
    }

    @Test
    public void getdData() throws Exception {
        assertEquals(this.link.getdData(), 22);
        assertEquals(this.linker.getdData(), -10);
    }

}