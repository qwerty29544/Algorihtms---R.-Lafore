package SortedList;

import jdk.nashorn.internal.runtime.ECMAException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortedListTest {

    Link link, linker;
    SortedList sortedList, sortList;

    @Before
    public void setUp() throws Exception {
        this.sortedList = new SortedList();
        this.sortList = new SortedList();
        this.sortedList.insert(22);
        this.sortedList.insert(-123);
        this.sortedList.insert(2);
        this.sortedList.insert(1245);
        this.sortList.insert(1);
    }

    @After
    public void tearDown() throws Exception {
        this.sortList = null;
        this.sortedList = null;
    }

    @Test
    public void isEmpty() throws Exception {
        assertEquals(this.sortList.isEmpty(),false);
        this.sortList.remove();
        assertEquals(this.sortList.isEmpty(),true);
        assertEquals(this.sortedList.isEmpty(),false);
    }

    @Test
    public void empty() {
        SortedList list = new SortedList();
        list.isEmpty();
    }

    @Test
    public void insert() throws Exception {
        this.link = this.sortedList.getFirst();
        assertEquals(this.link.getdData(),-123);
        this.sortedList.insert(-124);
        this.linker = this.sortedList.getFirst();
        assertEquals(this.linker.getdData(),-124);
        assertNotSame(this.linker.getdData(),this.link.getdData());
    }

    @Test
    public void remove() throws Exception {
        this.link = this.sortedList.getFirst();
        assertEquals(this.link.getdData(),-123);
        this.sortedList.remove();
        this.linker = this.sortedList.getFirst();
        assertEquals(this.linker.getdData(),2);
        assertNotSame(this.linker.getdData(),this.link.getdData());
    }

    @Test(expected = NullPointerException.class)
    public void removeException() {
        this.sortList.remove();
        this.sortList.remove();
    }

    @Test
    public void displayList() throws Exception {
        this.sortedList.displayList();
        System.out.println("After action");
        this.sortedList.remove();
        this.sortedList.insert(23);
        this.sortedList.insert(-2000);
        this.sortedList.displayList();
    }

    @Test
    public void displayer() throws Exception {
        this.sortList.remove();
        this.sortList.displayList();
    }

    @Test
    public void getFirst() throws Exception {
        this.link = this.sortedList.getFirst();
        assertEquals(this.link.getdData(),-123);
    }

    @Test(expected = NullPointerException.class)
    public void getter1() throws Exception {
        this.sortList.remove();
        this.link = this.sortList.getFirst();
        assertEquals(this.link.getdData(),0);
    }


}