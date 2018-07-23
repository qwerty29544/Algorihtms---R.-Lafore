package ListInsertionSort;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortedListTest {

    Link link, linker;
    SortedList sortedList, list;
    Link[] linkArray;

    @Before
    public void setUp() throws Exception {
        this.linkArray = new Link[6];
        this.linkArray[0] = new Link(55);
        this.linkArray[1] = new Link(60);
        this.linkArray[2] = new Link(-10);
        this.linkArray[3] = new Link(2);
        this.linkArray[4] = new Link(10);
        this.linkArray[5] = new Link(-3);
        this.sortedList = new SortedList(this.linkArray);
    }

    @Test(expected = NullPointerException.class)
    public void setUpException() {
        this.linkArray = new Link[10];
        this.linkArray[0] = new Link(1);
        this.linkArray[1] = new Link(3);
        this.linkArray[2] = new Link(-1);
        this.sortedList = new SortedList(this.linkArray);
    }

    @After
    public void tearDown() throws Exception {
        this.sortedList = null;
    }

    @Test
    public void insert() throws Exception {
        this.linker = new Link(22);
        this.sortedList.insert(this.linker);
        this.linker = new Link(-11);
        this.link = this.sortedList.getFirst();
        this.sortedList.insert(this.linker);
        this.linker = this.sortedList.getFirst();
        assertNotSame(this.linker.getdData(),this.link.getdData());
    }

    @Test
    public void remove() throws Exception {
        this.link = this.sortedList.getFirst();
        this.sortedList.remove();
        this.linker = this.sortedList.getFirst();
        assertNotSame(this.linker.getdData(),this.link.getdData());
        assertEquals(this.linker.getdData(),-3);
        assertEquals(this.link.getdData(),-10);
    }

    @Test(expected = NullPointerException.class)
    public void removeException() {
        for (int i=0; i<=12; i++){
            this.sortedList.remove();
        }
    }

    @Test
    public void getFirst() throws Exception {
        this.link = this.sortedList.getFirst();
        assertEquals(this.link.getdData(),-10);
    }

    @Test(expected = NullPointerException.class)
    public void getFirstException() {
        for (int i=0; i<6; i++){
            this.sortedList.remove();
        }
        this.link = this.sortedList.getFirst();
        assertEquals(this.link.getdData(),0);
    }

}