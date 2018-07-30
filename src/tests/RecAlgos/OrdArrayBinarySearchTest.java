package RecAlgos;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.nio.BufferOverflowException;

import static org.junit.Assert.*;

public class OrdArrayBinarySearchTest {

    long[] testArray;
    OrdArrayBinarySearch ordArray, ordArrayException, ordArrayTest;

    @Before
    public void setUp() throws Exception {
        this.ordArray = new OrdArrayBinarySearch(10);
        this.ordArrayTest = new OrdArrayBinarySearch(20);
        this.ordArray.insert(22);
        this.ordArray.insert(11);
        this.ordArray.insert(220);
        this.ordArray.insert(-10);
    }

    @After
    public void tearDown() throws Exception {
        this.ordArray = null;
        this.ordArrayTest = null;
    }

    @Test(expected = NegativeArraySizeException.class)
    public void setUpException() {
        this.ordArrayException = new OrdArrayBinarySearch(-12);
    }

    @Test
    public void size() throws Exception {
        assertEquals(this.ordArray.size(),4);
        assertEquals(this.ordArrayTest.size(),0);
        this.ordArray.insert(90);
        assertEquals(this.ordArray.size(),5);
        this.ordArrayTest.insert(10);
        assertEquals(this.ordArrayTest.size(),1);
    }

    @Test(expected = NullPointerException.class)
    public void sizeException() {
        assertEquals(this.ordArrayException.size(),18);
    }

    @Test
    public void find() throws Exception {
        assertEquals(this.ordArray.find(22),2);
        assertEquals(this.ordArray.find(-10),0);
        assertEquals(this.ordArray.find(90),4); // item wasn't found
        this.ordArray.insert(909);
        assertEquals(this.ordArray.find(909),4);
        assertEquals(this.ordArrayTest.find(909),0);
    }

    @Test(expected = NullPointerException.class)
    public void findException() {
        assertEquals(this.ordArrayException.find(22),0);
    }

    @Test
    public void insert() throws Exception {
        assertEquals(this.ordArray.find(202),4);
        this.ordArray.insert(90);
        this.ordArray.insert(100);
        this.ordArray.insert(202);
        assertEquals(this.ordArray.find(202),5);
        assertEquals(this.ordArray.find(201),7);//item wasn't found
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void insertException() {
        for (int i=0; i<11; i++){
            this.ordArray.insert(i);
        }
    }

    @Test(expected = NullPointerException.class)
    public void insertException2() {
        this.ordArrayException.insert(22);
    }

    @Test
    public void display() throws Exception {
        this.ordArray.display();
        this.ordArray.insert(222);
        this.ordArray.insert(-101);
        this.ordArray.insert(2024);
        this.ordArray.display();
    }

    @Test(expected = NullPointerException.class)
    public void displayException() {
        this.ordArrayException.display();
    }

    @Test
    public void getArray() throws Exception {
        this.testArray = this.ordArray.getArray();
        assertEquals(this.testArray.length,10);
        assertEquals(this.testArray[0],-10);
        assertEquals(this.testArray[1],11);
        assertEquals(this.testArray[2],22);
        assertEquals(this.testArray[3],220);
    }

    @Test(expected = NullPointerException.class)
    public void getArrayException() {
        this.testArray = this.ordArrayException.getArray();
    }

}