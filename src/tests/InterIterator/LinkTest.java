package InterIterator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LinkTest {

    Link link, linker;

    @Before
    public void setUp() throws Exception {
        this.link = new Link(222);
        this.linker = new Link(-1203);
    }

    @After
    public void tearDown() throws Exception {
        this.linker = null;
        this.link = null;
    }

    @Test
    public void getdData() throws Exception {
        assertEquals(this.link.getdData(),222);
        assertEquals(this.linker.getdData(),-1203);
    }

    @Test
    public void getNext() throws Exception {
    }

}