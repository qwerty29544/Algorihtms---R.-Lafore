package LinkQueue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FirstLastListTest {

    Link link, linker;
    FirstLastList firstLastList, firstLastList2, firstLastList3;

    @Before
    public void setUp() throws Exception {
        this.firstLastList = new FirstLastList();
        this.firstLastList.insertLast(123);
        this.firstLastList.insertLast(22);
        this.firstLastList.insertLast(932);
        this.firstLastList2 = new FirstLastList();
        this.firstLastList2.insertLast(43);
        this.firstLastList3 = new FirstLastList();
    }

    @After
    public void tearDown() throws Exception {
        this.firstLastList3 = null;
        this.firstLastList2 = null;
        this.firstLastList = null;
    }

    @Test
    public void isEmpty() throws Exception {
        assertEquals(this.firstLastList3.isEmpty(),true);
        assertEquals(this.firstLastList2.isEmpty(),false);
        this.firstLastList2.deleteFirst();
        assertEquals(this.firstLastList2.isEmpty(),true);
        assertEquals(this.firstLastList.isEmpty(),false);
    }

    @Test
    public void insertLast() throws Exception {
        this.link = this.firstLastList.getLast();
        assertEquals(this.link.getdData(),932);
        this.firstLastList.insertLast(34);
        this.linker = this.firstLastList.getLast();
        assertEquals(this.linker.getdData(),34);
        assertNotSame(this.link.getdData(),this.linker.getdData());
        assertEquals(this.firstLastList3.isEmpty(),true);
        this.firstLastList3.insertLast(22);
        assertEquals(this.firstLastList3.isEmpty(),false);
        this.link = this.firstLastList3.getLast();
        assertEquals(this.link.getdData(),22);
    }

    @Test
    public void deleteFirst() throws Exception {
        this.link = this.firstLastList.getFirst();
        assertEquals(this.link.getdData(),123);
        this.firstLastList.deleteFirst();
        this.linker = this.firstLastList.getFirst();
        assertEquals(this.linker.getdData(),22);
        assertNotSame(this.linker.getdData(),this.link.getdData());
        assertEquals(this.firstLastList2.isEmpty(),false);
        this.firstLastList2.deleteFirst();
        assertEquals(this.firstLastList2.isEmpty(),true);
    }

    @Test(expected = NullPointerException.class)
    public void deleteFirstException() {
        this.firstLastList3.deleteFirst();
    }

    @Test
    public void displayList() throws Exception {
        this.firstLastList.displayList();
        System.out.println("After action");
        this.firstLastList.insertLast(2345);
        this.firstLastList.deleteFirst();
        this.firstLastList.displayList();
    }

    @Test
    public void showEmpty() throws  Exception {
        this.firstLastList3.displayList();
    }

    @Test
    public void getFirst() throws Exception {
        this.link = this.firstLastList2.getFirst();
        assertEquals(this.link.getdData(),43);
    }

    @Test(expected = NullPointerException.class)
    public void getFirstException() {
        this.firstLastList2.deleteFirst();
        this.link = this.firstLastList2.getFirst();
        assertEquals(this.link.getdData(),0);
    }

    @Test
    public void getLast() throws Exception {
        this.link = this.firstLastList.getLast();
        assertEquals(this.link.getdData(),932);
    }

    @Test(expected = NullPointerException.class)
    public void getLastException() {
        this.link = this.firstLastList3.getLast();
        assertEquals(this.link.getdData(),0);
    }
}