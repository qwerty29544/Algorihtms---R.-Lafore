package ArrayClasses;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class OrderedArrayClassTest {

    OrderedArrayClass orderedArray, orderedArrayClassException, orderedArrayException;

    @Before
    public void setUp() throws Exception {
        this.orderedArray = new OrderedArrayClass(5);
        this.orderedArray.insert(99);
        this.orderedArray.insert(10);
        this.orderedArray.insert(20178);
        this.orderedArray.insert(-10);
    }

    @After
    public void tearDown() throws Exception {
        this.orderedArray = null;
        this.orderedArrayClassException = null;
        this.orderedArrayException = null;
    }

    @Test
    public void size() throws Exception {
        assertEquals(this.orderedArray.size(), 4);
        assertNotSame(this.orderedArray.size(), 3);
    }

    @Test
    public void find() throws Exception {
        assertEquals(this.orderedArray.find(99),2);
        assertNotSame(this.orderedArray.find(20178),1);
    }

    @Test
    public void insert() throws Exception {
        this.orderedArray.insert(1000);
        this.orderedArray.insert(1000);
        this.orderedArray.insert(1000);
    }

    @Test
    public void delete() throws Exception {
    }

    @Test
    public void display() throws Exception {
    }

    @Test
    public void getArray() throws Exception {
    }

    @Test
    public void getnElems() throws Exception {
    }

    @Ignore("Message for ignored test")
    @Test
    public void ignoredTest() {
        System.out.println("will not print it");
    }

}