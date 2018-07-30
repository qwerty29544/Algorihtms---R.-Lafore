package RecAlgos.MergeSort;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MergeSortArrayTest {

    long[] testArray;
    MergeSortArray mergeSortArray, sortArray, array;

    @Before
    public void setUp() throws Exception {
        this.array = new MergeSortArray(20);
        this.mergeSortArray = new MergeSortArray(10);
        this.mergeSortArray.insert(22);
        this.mergeSortArray.insert(10);
        this.mergeSortArray.insert(15);
        this.mergeSortArray.insert(-110);
    }

    @After
    public void tearDown() throws Exception {
        this.mergeSortArray = null;
        this.array = null;
    }

    @Test(expected = NegativeArraySizeException.class)
    public void setUpException() {
        this.sortArray = new MergeSortArray(-10);
    }

    @Test
    public void insert() throws Exception {
        assertEquals(this.mergeSortArray.getnElems(),4);
        this.mergeSortArray.insert(110);
        assertEquals(this.mergeSortArray.getnElems(),5);
        assertEquals(this.mergeSortArray.getTheArray()[4],110);
        this.mergeSortArray.insert(-111);
        assertEquals(this.mergeSortArray.getTheArray()[5],-111);
        this.mergeSortArray.mergeSort();
        assertEquals(this.mergeSortArray.getnElems(),6);
        this.mergeSortArray.insert(-6);
        assertEquals(this.mergeSortArray.getTheArray()[6],-6);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void insertException1() {
        for (int i = 0 ; i < 11 ; i++){
            this.mergeSortArray.insert(i);
        }
    }

    @Test(expected = NullPointerException.class)
    public void insertException2() {
        this.sortArray.insert(22);
    }

    @Test
    public void display() throws Exception {
        this.mergeSortArray.display();
        this.mergeSortArray.mergeSort();
        this.mergeSortArray.display();
        this.mergeSortArray.insert(2222);
        this.mergeSortArray.insert(-1029);
        this.mergeSortArray.display();
        this.mergeSortArray.mergeSort();
        this.mergeSortArray.display();
    }

    @Test(expected = NullPointerException.class)
    public void displayException() {
        this.sortArray.display();
    }

    @Test
    public void mergeSort() throws Exception {
        assertEquals(this.mergeSortArray.getTheArray()[0],22);
        assertEquals(this.mergeSortArray.getTheArray()[1],10);
        assertEquals(this.mergeSortArray.getTheArray()[2],15);
        assertEquals(this.mergeSortArray.getTheArray()[3],-110);
        this.mergeSortArray.mergeSort();
        assertEquals(this.mergeSortArray.getTheArray()[0],-110);
        assertEquals(this.mergeSortArray.getTheArray()[1],10);
        assertEquals(this.mergeSortArray.getTheArray()[2],15);
        assertEquals(this.mergeSortArray.getTheArray()[3],22);
        this.mergeSortArray.insert(-111);
        assertEquals(this.mergeSortArray.getTheArray()[4],-111);
        this.mergeSortArray.mergeSort();
        assertEquals(this.mergeSortArray.getTheArray()[0],-111);
    }

    @Test(expected = NullPointerException.class)
    public void mergeSortException() {
        this.sortArray.mergeSort();
    }

    @Test
    public void getTheArray() throws Exception {
        this.testArray = this.mergeSortArray.getTheArray();
        assertEquals(this.testArray[0],22);
        assertEquals(this.testArray[1],10);
        assertEquals(this.testArray[2],15);
        assertEquals(this.testArray[3],-110);
        this.mergeSortArray.mergeSort();
        this.testArray = this.mergeSortArray.getTheArray();
        assertEquals(this.testArray[0],-110);
        assertEquals(this.testArray[1],10);
        assertEquals(this.testArray[2],15);
        assertEquals(this.testArray[3],22);
    }

    @Test(expected = NullPointerException.class)
    public void getArrayException() {
        this.testArray = this.sortArray.getTheArray();
    }

    @Test
    public void getnElems() throws Exception {
        assertEquals(this.mergeSortArray.getnElems(),4);
        assertEquals(this.array.getnElems(),0);
        this.mergeSortArray.insert(1110);
        this.mergeSortArray.insert(22);
        assertEquals(this.mergeSortArray.getnElems(),6);
    }

    @Test(expected = NullPointerException.class)
    public void getnElemsException() {
        assertEquals(this.sortArray.getnElems(),0);
    }

}