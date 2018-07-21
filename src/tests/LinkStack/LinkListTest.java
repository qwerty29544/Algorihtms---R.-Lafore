package LinkStack;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LinkListTest {

    Link link, linker;
    LinkList linkList, linkedList, linkerList;

    @Before
    public void setUp() throws Exception {
        this.linkList = new LinkList();
        this.linkList.insertFirst(2323);
        this.linkList.insertFirst(15);
        this.linkList.insertFirst(-976);
        this.linkedList = new LinkList();
        this.linkedList.insertFirst(22);
        this.linkerList =  new LinkList();
    }

    @After
    public void tearDown() throws Exception {
        this.linkerList = null;
        this.linkList = null;
        this.linkedList = null;
    }

    @Test
    public void isEmpty() throws Exception {
        assertEquals(this.linkList.isEmpty(),false);
        assertEquals(this.linkerList.isEmpty(),true);
        assertEquals(this.linkedList.isEmpty(),false);
        this.linkedList.deleteFirst();
        assertEquals(this.linkedList.isEmpty(),true);
    }

    @Test
    public void insertFirst() throws Exception {
        this.link = this.linkList.getFirst();
        assertEquals(this.link.getdData(),-976);
        this.linkList.insertFirst(333);
        this.linker = this.linkList.getFirst();
        assertEquals(this.linker.getdData(),333);
        assertNotSame(this.linker.getdData(),this.link.getdData());
    }

    @Test
    public void deleteFirst() throws Exception {
        this.link = this.linkList.getFirst();
        assertEquals(this.link.getdData(),-976);
        this.linkList.deleteFirst();
        this.linker = this.linkList.getFirst();
        assertEquals(this.linker.getdData(),15);
        assertNotSame(this.linker.getdData(),this.link.getdData());
    }

    @Test
    public void displayList() throws Exception {
        System.out.println("Before action");
        this.linkList.displayList();
        this.linkList.insertFirst(9000);
        System.out.println("After action");
        this.linkList.displayList();
    }

    @Test
    public void getFirst() throws Exception {
        this.link = this.linkList.getFirst();
        assertEquals(this.link.getdData(),-976);
    }

    @Test
    public void displayListExcluded() {
        this.linkerList.displayList();
    }

}