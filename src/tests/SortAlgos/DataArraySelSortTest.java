package SortAlgos;

import SortAlgos.DataArraySelSort;
import ArrayClasses.DataClass;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DataArraySelSortTest {

    DataArraySelSort dataArrayClass, dataArrayClassException;

    @Before
    public void setUp() throws Exception {
        this.dataArrayClass = new DataArraySelSort(5);
        this.dataArrayClass.insert("Alpha","Den",13);
        this.dataArrayClass.insert("Susano","Otachi",24);
        this.dataArrayClass.insert("Birmingem","Deughtish",95);
    }

    @Test(expected = NegativeArraySizeException.class)
    public void constructorException() {
        this.dataArrayClassException = new DataArraySelSort(-10);
    }

    @After
    public void tearDown() throws Exception {
        this.dataArrayClass = null;
    }

    @Test
    public void insert() throws Exception {
        assertEquals(this.dataArrayClass.getnElems(),3);
        this.dataArrayClass.insert("Tritoo","Franky",32);
        assertEquals(this.dataArrayClass.getnElems(),4);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void insertException(){
        for (int i=15; i<=20; i++){
            this.dataArrayClass.insert("boo","baa", i);
        }
    }

    @Test
    public void insertionSort() throws Exception {
        System.out.println("Before: ");
        this.dataArrayClass.display();
        this.dataArrayClass.insertionSort();
        System.out.println(" ");
        System.out.println("After: ");
        this.dataArrayClass.display();
    }

    @Test
    public void display() throws Exception {
        assertEquals(this.dataArrayClass.getnElems(),3);
        this.dataArrayClass.display();
        this.dataArrayClass.insert("Tritoo","Franky",32);
        System.out.println("After insertion");
        this.dataArrayClass.display();
        this.dataArrayClass.insertionSort();
        System.out.println("after sort");
        this.dataArrayClass.display();
    }

    @Test
    public void getClassArray() throws Exception {
        assertNotNull(this.dataArrayClass.getClassArray());
    }

    @Test
    public void getnElems() throws Exception {
        assertEquals(this.dataArrayClass.getnElems(),3);
        this.dataArrayClass.insert("Tritoo","Franky",32);
        assertEquals(this.dataArrayClass.getnElems(),4);
    }

    @Test(expected = NullPointerException.class)
    public void getClassArrayException() {
        this.dataArrayClass = null;
        this.dataArrayClass.getClassArray();
    }

    @Test(expected = NullPointerException.class)
    public void getnElemsException() {
        this.dataArrayClass = null;
        this.dataArrayClass.getnElems();
    }

    @Test(expected = NullPointerException.class)
    public void insertionSortException() {
        this.dataArrayClass = null;
        this.dataArrayClass.insertionSort();
    }

    @Test(expected = NullPointerException.class)
    public void displayException() {
        this.dataArrayClass = null;
        this.dataArrayClass.display();
    }

}