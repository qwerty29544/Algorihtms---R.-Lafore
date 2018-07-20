package LinkedLists;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LinkList2Test {

    LinkList2 linkList, linker, linkerList;
    Link link;

    @Before
    public void setUp() throws Exception {
        this.linkList = new LinkList2();
        this.linkList.insertFirst(-34,90.84);
        this.linkList.insertFirst(10,54.21);
        this.linkList.insertFirst(2,23.4567);
        this.linker = new LinkList2();
        this.linkerList = new LinkList2();
    }

    @After
    public void tearDown() throws Exception {
        this.linkList = null;
        this.linker = null;
        this.linkerList = null;
        this.link = null;
    }

    @Test
    public void insertFirst() throws Exception {
        assertNull(this.linker.getFirst());
        this.linker.insertFirst(-10,241241);
        assertNotNull(this.linker.getFirst());
    }

    @Test
    public void find() throws Exception {
        this.link = this.linkList.getFirst();
        assertEquals(this.linkList.getFirst(),this.link);
        assertEquals(this.linkList.find(2),this.link);
        assertNotSame(this.linkList.find(10),this.link);
    }

    @Test(expected = NullPointerException.class)
    public void findException() {
        this.linker.find(4);
    }

    @Test(expected = NullPointerException.class)
    public void getFirstException() {
        this.linker = null;
        this.linker.getFirst();
    }

    @Test
    public void delete() throws Exception {
        this.link = this.linkList.find(-34);
        assertEquals(this.linkList.find(-34),this.link);
        this.linkList.delete(-34);
        assertNull(this.linkList.find(-34));
        this.linkList.delete(10);
        assertNull(this.linkList.find(10));
        assertNotNull(this.linkList.find(2));
    }

    @Test(expected = NullPointerException.class)
    public void deleteOutOfElementsException() {
        this.linkList.delete(-34);
        this.linkList.delete(10);
        this.linkList.delete(2);
        assertNull(this.linkList.find(39123));
    }

    @Test
    public void displayList() throws Exception {
        this.linkList.displayList();
        this.linkList.delete(-34);
        System.out.println(" ");
        this.linkList.displayList();
    }

    @Test
    public void getFirst() throws Exception {
        assertNull(this.linker.getFirst());
        assertNotNull(this.linkList.getFirst());
    }

    @Test(expected = NullPointerException.class)
    public void displayListException() {
        this.linker = null;
        this.linker.displayList();
    }

    @Test(expected = NullPointerException.class)
    public void deleteException() {
        this.linkList = null;
        this.linkList.delete(-34);
    }
}