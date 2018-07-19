package LinkedLists;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LinkTest {

    Link link, nullLink;

    @Before
    public void setUp() throws Exception {
        this.link = new Link(1,22.22);
        this.nullLink = null;
    }

    @After
    public void tearDown() throws Exception {
        this.link = null;
    }

    @Test
    public void displayLink() throws Exception {
        this.link.displayLink();
    }

    @Test(expected = NullPointerException.class)
    public void nullPointerDisplay() {
        this.link = null;
        this.link.displayLink();
    }

    @Test
    public void getiData() throws Exception {
        assertEquals(this.link.getiData(),1);
    }

    @Test(expected = NullPointerException.class)
    public void getiDataException() {
        this.link = null;
        assertEquals(this.link.getiData(),0);
    }

    @Test
    public void getdData() throws Exception {
        assertEquals(this.link.getdData(),22.22);
    }

    @Test(expected = NullPointerException.class)
    public void getdDataException() {
        this.link = null;
        assertEquals(this.link.getdData(),0);
    }

    @Test
    public void getNext() throws Exception {
        assertEquals(this.link.getNext(),this.nullLink);
    }

    @Test(expected = NullPointerException.class)
    public void getNextException() {
        this.link = null;
        assertNull(this.link.getNext());
    }

}