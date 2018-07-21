package LinkQueue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LinkTest {
    Link link, linker;

    @Before
    public void setUp() throws Exception {
        this.link = new Link(23);
    }

    @After
    public void tearDown() throws Exception {
        this.link = null;
    }

    @Test
    public void displayLink() throws Exception {
        this.link.displayLink();
    }

    @Test
    public void getdData() throws Exception {
        assertEquals(this.link.getdData(),23);
    }

    @Test
    public void getNext() throws Exception {
        assertEquals(this.link.getNext(),null);
    }

}