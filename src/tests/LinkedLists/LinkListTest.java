package LinkedLists;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LinkListTest {

    Link linkTest, linkTester;
    LinkList linkList, link;

    @Before
    public void setUp() throws Exception {
        this.linkList = new LinkList();
        this.link = new LinkList();
        this.linkList.insertFirst(1,22.22);
        this.linkList.insertFirst(-3,54.5678);
        this.linkTest = new Link(1,22.22);
        this.linkTester = new Link(-3,54.5678);
    }

    @After
    public void tearDown() throws Exception {
        this.link = null;
        this.linkList = null;
    }

    @Test
    public void isEmpty() throws Exception {
        assertEquals(this.link.isEmpty(),true);
        this.link.insertFirst(-45,22);
        assertEquals(this.link.isEmpty(),false);
        this.link.deleteFirst();
        assertEquals(this.link.isEmpty(),true);
    }

    @Test
    public void insertFirst() throws Exception {
        assertEquals(this.linkList.isEmpty(),false);
    }

    @Test
    public void getFirst() throws Exception {
        assertNotNull(this.linkList.getFirst());
        this.linkList.deleteFirst();
        assertNotNull(this.linkList.getFirst());
        this.linkList.deleteFirst();
        assertNull(this.linkList.getFirst());
    }

    @Test
    public void deleteFirst() throws Exception {
        assertNotNull(this.linkList.getFirst());
        this.linkList.deleteFirst();
        assertNotNull(this.linkList.getFirst());
        this.linkList.deleteFirst();
        assertNull(this.linkList.getFirst());
    }

    @Test
    public void displayList() throws Exception {
        System.out.println("Before");
        this.linkList.displayList();
        this.linkList.deleteFirst();
        System.out.println("After deleting first");
        this.linkList.displayList();
    }

    @Test(expected = NullPointerException.class)
    public void displayListException() {
        this.link = null;
        this.link.displayList();
    }

    @Test(expected = NullPointerException.class)
    public void deletefirstException() {
        this.link = null;
        this.link.deleteFirst();
    }

    @Test(expected = NullPointerException.class)
    public void getFirstException() {
        this.link = null;
        this.link.getFirst();
    }

    @Test(expected = NullPointerException.class)
    public void isEmptyException() {
        this.link = null;
        this.link.isEmpty();
    }

}