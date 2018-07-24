package InterIterator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ListIteratorTest {

    Link link;
    LinkList linkList, linkedList;
    ListIterator iterator, listIterator;

    @Before
    public void setUp() throws Exception {
        this.linkList = new LinkList();
        this.iterator = this.linkList.getIterator();
        this.iterator.insertAfter(894);
        this.iterator.nextLink();
        this.iterator.insertBefore(892);
        this.iterator.insertAfter(893);
        this.iterator.nextLink();
        this.iterator.insertBefore(99);
        this.linkedList = new LinkList();
        this.listIterator = this.linkedList.getIterator();
    }

    @After
    public void tearDown() throws Exception {
        this.listIterator = null;
        this.iterator = null;
        this.linkList = null;
        this.linkedList = null;
    }

    @Test
    public void reset() throws Exception {
        assertEquals(this.iterator.getCurrent().getdData(),99);
        this.iterator.reset();
        assertEquals(this.iterator.getCurrent().getdData(),894);
        this.iterator.nextLink();
        assertEquals(this.iterator.getCurrent().getdData(),892);
        this.iterator.reset();
        assertEquals(this.iterator.getCurrent().getdData(),894);
    }

    @Test
    public void atEnd() throws Exception {
        assertEquals(this.iterator.atEnd(),true);
        this.iterator.reset();
        assertEquals(this.iterator.atEnd(),false);
        this.iterator.nextLink();
        this.iterator.nextLink();
        assertEquals(this.iterator.atEnd(),false);
        this.iterator.nextLink();
        assertEquals(this.iterator.atEnd(),true);
    }

    @Test(expected = NullPointerException.class)
    public void atEndException() {
        assertEquals(this.iterator.atEnd(),true);
        this.iterator.nextLink();
        assertEquals(this.iterator.atEnd(),true);
    }

    @Test
    public void nextLink() throws Exception {
        this.iterator.nextLink();
        this.iterator.reset();
        assertEquals(this.iterator.atEnd(),false);
        assertEquals(this.iterator.getCurrent().getdData(),894);
        this.iterator.nextLink();
        assertEquals(this.iterator.getCurrent().getdData(),892);
        this.iterator.nextLink();
        assertEquals(this.iterator.getCurrent().getdData(),893);
    }

    @Test
    public void getCurrent() throws Exception {
        assertEquals(this.iterator.getCurrent().getdData(),99);
        this.link = this.iterator.getCurrent();
        assertEquals(this.link.getdData(),99);
    }

    @Test
    public void insertAfter() throws Exception {
        this.linkList.displayList();
        this.iterator.insertAfter(909);
        assertEquals(this.iterator.getCurrent().getdData(),909);
        this.iterator.reset();
        this.iterator.insertAfter(9099);
        assertEquals(this.iterator.getCurrent().getdData(),9099);
        this.linkList.displayList();
    }

    @Test
    public void insertBefore() throws Exception {
        this.linkList.displayList();
        assertEquals(this.iterator.getCurrent().getdData(),99);
        this.iterator.insertBefore(9099);
        assertEquals(this.iterator.getCurrent().getdData(),9099);
        this.iterator.reset();
        this.iterator.insertBefore(98);
        assertEquals(this.iterator.getCurrent().getdData(),98);
        this.linkList.displayList();
    }

    @Test(expected = NullPointerException.class)
    public void deleteCurrentException() {
        assertEquals(this.iterator.deleteCurrent(),99);
        assertEquals(this.iterator.deleteCurrent(),894);
        assertEquals(this.iterator.deleteCurrent(),892);
        assertEquals(this.iterator.deleteCurrent(),893);
        assertNotSame(this.iterator.deleteCurrent(),0);
    }

    @Test
    public void deleteCurrent() throws Exception {
        assertEquals(this.iterator.deleteCurrent(),99);
        assertEquals(this.iterator.deleteCurrent(),894);
        assertEquals(this.iterator.deleteCurrent(),892);
        assertEquals(this.iterator.deleteCurrent(),893);
    }

    @Test(expected = NullPointerException.class)
    public void getPreviousException() {
        assertEquals(this.iterator.getPrevious().getdData(),893);
        this.iterator.reset();
        assertEquals(this.iterator.getPrevious().getdData(),99);
    }

    @Test
    public void getPrevious() throws Exception {
        assertEquals(this.iterator.getPrevious().getdData(),893);
        this.iterator.reset();
        this.iterator.nextLink();
        assertEquals(this.iterator.getPrevious().getdData(),894);
    }

    @Test
    public void getOurList() throws Exception {
        this.linkedList = this.iterator.getOurList();
        assertEquals(this.linkedList.isEmpty(),false);
        assertEquals(this.linkedList.getFirst().getdData(),894);
        this.linkedList.displayList();
    }

}