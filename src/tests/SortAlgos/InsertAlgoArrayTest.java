package SortAlgos;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class InsertAlgoArrayTest {

    InsertAlgoArray algoArray, algoArrayException;

    @Before
    public void setUp() throws Exception {
        this.algoArray = new InsertAlgoArray(6);
        this.algoArray.insert(21);
        this.algoArray.insert(10);
        this.algoArray.insert(-9);
        this.algoArray.insert(0);
    }

    @Test(expected = NegativeArraySizeException.class)
    public void constructorException() {
        this.algoArrayException = new InsertAlgoArray(-12);
    }

    @After
    public void tearDown() throws Exception {
        this.algoArray = null;
    }

    @Test
    public void insert() throws Exception {
        assertEquals(this.algoArray.getnElems(),4);
        assertEquals(this.algoArray.getArray()[4],0);
        this.algoArray.insert(2);
        assertEquals(this.algoArray.getArray()[4],2);
        assertEquals(this.algoArray.getnElems(),5);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void insertException(){
        for (int i=3; i<=8; i++){
            this.algoArray.insert(i);
        }
    }

    @Test
    public void display() throws Exception {
        this.algoArray.display();
        this.algoArray.insert(12);
        System.out.println("After insertion");
        this.algoArray.display();
        this.algoArray.insertionSort();
        System.out.println("After Sort");
        this.algoArray.display();
    }

    @Test
    public void insertionSort() throws Exception {
        assertEquals(this.algoArray.getArray()[0],21);
        assertEquals(this.algoArray.getArray()[1],10);
        assertEquals(this.algoArray.getArray()[2],-9);
        assertEquals(this.algoArray.getArray()[3],0);
        this.algoArray.insertionSort();
        assertEquals(this.algoArray.getArray()[0],-9);
        assertEquals(this.algoArray.getArray()[1],0);
        assertEquals(this.algoArray.getArray()[2],10);
        assertEquals(this.algoArray.getArray()[3],21);

    }

    @Test
    public void getArray() throws Exception {
        assertNotNull(this.algoArray.getArray());
        assertEquals(this.algoArray.getArray()[2],-9);
    }

    @Test
    public void getnElems() throws Exception {
        assertEquals(this.algoArray.getnElems(),4);
        this.algoArray.insert(3);
        assertEquals(this.algoArray.getnElems(),5);
    }

}