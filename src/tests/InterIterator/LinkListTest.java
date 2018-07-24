package InterIterator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LinkListTest {

    LinkList linkList, list;
    ListIterator listIterator, iterator;

    @Before
    public void setUp() throws Exception {
        this.linkList = new LinkList();
        this.list = new LinkList();
        this.listIterator = this.list.getIterator();
        this.listIterator.reset();
        this.listIterator.insertAfter(22);
        this.listIterator.insertBefore(90);
        this.listIterator.nextLink();
        this.listIterator.insertBefore(900);
        this.iterator = this.linkList.getIterator();
    }

    @After
    public void tearDown() throws Exception {
        this.iterator=null;
        this.listIterator=null;
        this.list=null;
        this.linkList=null;
    }

    @Test
    public void getFirst() throws Exception {
        assertEquals(this.list.getFirst().getdData(),90);
        this.listIterator.reset();
        this.listIterator.insertBefore(91);
        assertEquals(this.list.getFirst().getdData(),91);
        this.listIterator.reset();
        this.listIterator.insertBefore(94);
        this.listIterator.reset();
        this.listIterator.insertAfter(81);
        assertEquals(this.list.getFirst().getdData(),94);
    }

    @Test
    public void setFirst() throws Exception {
        assertEquals(this.list.getFirst().getdData(),90);
        this.listIterator.insertBefore(97);
        this.list.setFirst(this.listIterator.getCurrent());
        assertEquals(this.list.getFirst().getdData(),97);
        this.listIterator.insertAfter(104);
        this.list.setFirst(this.listIterator.getCurrent());
        assertEquals(this.list.getFirst().getdData(),104);
    }

    @Test(expected = NullPointerException.class)
    public void testExceptionSecond() {
        this.linkList.setFirst(this.iterator.getCurrent());
        assertEquals(this.linkList.getFirst().getdData(),0);
    }

    @Test(expected = NullPointerException.class)
    public void testException() {
        assertEquals(this.linkList.getFirst().getdData(),0);
    }

    @Test
    public void isEmpty() throws Exception {
        assertEquals(this.linkList.isEmpty(),true);
        assertEquals(this.list.isEmpty(),false);
        this.listIterator.reset();
        this.listIterator.deleteCurrent();
        this.listIterator.deleteCurrent();
        this.listIterator.deleteCurrent();
        assertEquals(this.list.isEmpty(),true);
    }

    @Test
    public void getIterator() throws Exception {
        this.iterator = this.list.getIterator();
        assertEquals(this.iterator.getCurrent().getdData(),90);
        this.iterator.reset();
        assertEquals(this.iterator.getCurrent().getdData(),90);
        this.iterator.nextLink();
        assertEquals(this.iterator.getCurrent().getdData(),900);
        this.iterator.nextLink();
        assertEquals(this.iterator.getCurrent().getdData(),22);
    }

    @Test
    public void displayList() throws Exception {
        this.list.displayList();
        this.listIterator.reset();
        this.listIterator.insertAfter(23);
        this.listIterator.nextLink();
        this.listIterator.insertAfter(908);
        this.list.displayList();
    }

}