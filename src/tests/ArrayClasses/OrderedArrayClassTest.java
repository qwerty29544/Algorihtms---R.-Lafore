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

    @Test(expected = NegativeArraySizeException.class)
    public void excepionPoiter(){
        this.orderedArrayClassException = new OrderedArrayClass(-19);
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

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void insertException() {
        this.orderedArray.insert(1000);
        this.orderedArray.insert(1000);
        this.orderedArray.insert(1000);
    }

    @Test
    public void insert() throws Exception{
        assertEquals(this.orderedArray.getnElems(),4);
        this.orderedArray.insert(1000);
        assertEquals(this.orderedArray.getnElems(),5);
        assertEquals(this.orderedArray.find(1000),3);
    }

    @Test
    public void delete() throws Exception {
        assertEquals(this.orderedArray.getnElems(),4);
        assertEquals(this.orderedArray.find(20178),3);
        this.orderedArray.delete(10);
        assertEquals(this.orderedArray.getnElems(),3);
        assertEquals(this.orderedArray.find(20178),2);
    }

    @Test
    public void display() throws Exception {
        this.orderedArray.display();
    }

    @Test
    public void getArray() throws Exception {
        assertEquals(this.orderedArray.getArray()[2],99);
        assertNotSame(this.orderedArray.getArray()[0],20178);
    }

    @Test
    public void getnElems() throws Exception {
        assertEquals(this.orderedArray.getnElems(),4);
        assertNotSame(this.orderedArray.getnElems(),2);
    }

    @Ignore("Message for ignored test")
    @Test
    public void ignoredTest() {
        System.out.println("will not print it");
    }

    @Test(expected = NullPointerException.class)
    public void displayException() {
        this.orderedArray = null;
        this.orderedArray.display();
    }

    @Test(expected = NullPointerException.class)
    public void getArrayException() {
        this.orderedArray = null;
        this.orderedArray.getArray();
    }

    @Test(expected = NullPointerException.class)
    public void getnElemsException() {
        this.orderedArray = null;
        this.orderedArray.getnElems();
    }


}