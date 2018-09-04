package Tree234;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DataItemTest {

    DataItem dataItem, item;

    @Before
    public void setUp() throws Exception {
        this.dataItem = new DataItem(234);
    }

    @After
    public void tearDown() throws Exception {
        this.dataItem = null;
    }

    @Test
    public void displayItem() throws Exception {
        this.dataItem.displayItem();
        this.dataItem = new DataItem(76);
        this.dataItem.displayItem();
    }

    @Test(expected = NullPointerException.class)
    public void displayItemException() {
        this.item.displayItem();
    }

    @Test
    public void getdData() throws Exception {
        assertEquals(this.dataItem.getdData(),234);
        long tima = this.dataItem.getdData();
        assertEquals(tima, 234);
        assertEquals(tima, this.dataItem.getdData());
    }

    @Test(expected = NullPointerException.class)
    public void getdDataException() {
        long tyma = this.item.getdData();
    }

}