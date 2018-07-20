package FirstLastList;

import com.sun.istack.internal.localization.NullLocalizable;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FirstLastListTest {

    FirstLastList firstLastList, firstList, lastList, linkException;
    Link link, linker;

    @Before
    public void setUp() throws Exception {
        this.firstLastList = new FirstLastList();
        this.firstLastList.insertFirst(245);
        this.firstLastList.insertLast(54);
        this.firstList = new FirstLastList();
        this.firstList.insertFirst(44);
        this.lastList = new FirstLastList();
        this.lastList.insertLast(12);
        this.linkException = new FirstLastList();
    }

    @After
    public void tearDown() throws Exception {
        this.firstLastList = null;
        this.firstList = null;
        this.lastList = null;
        this.linkException = null;
    }

    @Test
    public void isEmpty() throws Exception {
        assertEquals(this.firstList.isEmpty(),false);
        this.firstList.deleteFirst();
        assertEquals(this.firstList.isEmpty(),true);
        assertEquals(this.lastList.isEmpty(),false);
        this.lastList.deleteFirst();
        assertEquals(this.lastList.isEmpty(),true);
        assertEquals(this.firstLastList.isEmpty(),false);
        this.firstLastList.deleteFirst();
        assertEquals(this.firstLastList.isEmpty(),false);
        this.firstLastList.deleteFirst();
        assertEquals(this.firstLastList.isEmpty(),true);
    }

    @Test
    public void insertFirst() throws Exception {
        this.link = this.firstLastList.getFirst();
        assertEquals(this.link.getdData(),245);
        this.firstLastList.insertFirst(56);
        this.linker = this.firstLastList.getFirst();
        assertEquals(this.linker.getdData(),56);
        assertNotSame(this.linker.getdData(),this.link.getdData());
    }

    @Test
    public void insertLast() throws Exception {
        this.link = this.firstLastList.getLast();
        assertEquals(this.link.getdData(),54);
        this.firstLastList.insertLast(22);
        this.linker = this.firstLastList.getLast();
        assertEquals(this.linker.getdData(),22);
        assertNotSame(this.linker.getdData(),this.link.getdData());
        assertNotSame(this.linker,this.link);
    }

    @Test
    public void deleteFirst() throws Exception {
        this.firstLastList.insertFirst(234);
        this.link = this.firstLastList.getFirst();
        assertEquals(this.link.getdData(),234);
        this.firstLastList.deleteFirst();
        this.link = this.firstLastList.getFirst();
        assertEquals(this.link.getdData(),245);
        this.firstLastList.deleteFirst();
        this.link = this.firstLastList.getFirst();
        this.linker = this.firstLastList.getLast();
        assertEquals(this.link.getdData(),54);
        assertEquals(this.linker.getdData(),54);
        assertEquals(this.link.getdData(),this.linker.getdData());
    }

    @Test(expected = NullPointerException.class)
    public void deleteFirstException() {
        this.linkException.deleteFirst();
    }

    @Test
    public void displayList() throws Exception {
        System.out.println("Before action");
        this.firstLastList.displayList();
        this.firstLastList.insertLast(2325);
        this.firstLastList.deleteFirst();
        this.firstLastList.insertFirst(-10);
        this.firstLastList.insertFirst(1);
        System.out.println("After action");
        this.firstLastList.displayList();
    }

    @Test
    public void displayListExcluded() throws Exception {
        this.linkException.displayList();
    }

    @Test
    public void getFirst() throws Exception {
        this.link = this.firstLastList.getFirst();
        assertEquals(this.link.getdData(),245);
        this.firstLastList.insertFirst(45);
        this.linker = this.firstLastList.getFirst();
        assertEquals(this.linker.getdData(),45);
        assertNotSame(this.linker.getdData(),this.link.getdData());
        assertNotSame(this.linker,this.link);
    }

    @Test(expected = NullPointerException.class)
    public void getFirstException() {
        this.link = this.linkException.getFirst();
        assertEquals(this.link.getdData(),0);
    }

    @Test
    public void getLast() throws Exception {
        this.link = this.firstLastList.getLast();
        assertEquals(this.link.getdData(),54);
        this.firstLastList.insertLast(34);
        this.linker = this.firstLastList.getLast();
        assertEquals(this.linker.getdData(),34);
        assertNotSame(this.linker.getdData(),this.link.getdData());
        assertNotSame(this.linker,this.link);
    }

    @Test(expected = NullPointerException.class)
    public void getLastException() {
        this.link = this.linkException.getLast();
        assertEquals(this.link.getdData(),0);
    }

}