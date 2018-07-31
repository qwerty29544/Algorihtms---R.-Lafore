package NonTrivialSortAlgos.ActualQuickSort;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class QuickSortTest {

    QuickSort qSortAlgo1, qSort, qSortException, quickSortThree;

    @Before
    public void setUp() throws Exception {
        this.qSort = new QuickSort(22);
        this.qSort.insert(222);
        this.qSort.insert(10);
        this.qSort.insert(-109);
        this.qSort.insert(5);
        this.qSort.insert(-13);
        this.qSort.insert(54);
        this.qSort.insert(21);
        this.qSortAlgo1 = new QuickSort(10);
        this.quickSortThree = new QuickSort(3);
        this.quickSortThree.insert(22);
        this.quickSortThree.insert(14);
        this.quickSortThree.insert(-10);
    }

    @Test(expected = NegativeArraySizeException.class)
    public void setUpException() {
        this.qSortException = new QuickSort(-10);
    }

    @After
    public void tearDown() throws Exception {
        this.qSort = null;
        this.qSortAlgo1 = null;
    }

    @Test
    public void insert() throws Exception {
        assertEquals(this.qSort.getTheArray()[6],21);
        assertEquals(this.qSort.getTheArray()[7],0);
        this.qSort.insert(203);
        assertEquals(this.qSort.getTheArray()[7],203);
        assertEquals(this.qSort.getTheArray()[8],0);
        this.qSort.insert(-109);
        assertEquals(this.qSort.getTheArray()[8],-109);
        this.qSort.quickSort();
        assertEquals(this.qSort.getTheArray()[8],222);
        assertEquals(this.qSort.getTheArray()[9],0);
        this.qSort.insert(220);
        assertEquals(this.qSort.getTheArray()[9],220);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void insertException() {
        for (long i=0; i<156 ; i++) {
            this.qSort.insert(i);
        }
    }

    @Test(expected = NullPointerException.class)
    public void insertException2() {
        this.qSortException.insert(222);
    }

    @Test
    public void display() throws Exception {
        this.qSort.display();
        this.qSort.quickSort();
        this.qSort.display();
        this.qSort.insert(2014);
        this.qSort.insert(301491);
        this.qSort.insert(-100);
        this.qSort.display();
        this.qSort.quickSort();
        this.qSort.display();
    }

    @Test(expected = NullPointerException.class)
    public void displayException() {
        this.qSortException.display();
    }

    @Test
    public void quickSort() throws Exception {
        assertEquals(this.qSort.getTheArray()[0],222);
        assertEquals(this.qSort.getTheArray()[1],10);
        assertEquals(this.qSort.getTheArray()[2],-109);
        assertEquals(this.qSort.getTheArray()[3],5);
        assertEquals(this.qSort.getTheArray()[4],-13);
        assertEquals(this.qSort.getTheArray()[5],54);
        assertEquals(this.qSort.getTheArray()[6],21);
        this.qSort.quickSort();
        assertEquals(this.qSort.getTheArray()[0],-109);
        assertEquals(this.qSort.getTheArray()[1],-13);
        assertEquals(this.qSort.getTheArray()[2],5);
        assertEquals(this.qSort.getTheArray()[3],10);
        assertEquals(this.qSort.getTheArray()[4],21);
        assertEquals(this.qSort.getTheArray()[5],54);
        assertEquals(this.qSort.getTheArray()[6],222);
        this.qSort.insert(-90);
        assertEquals(this.qSort.getTheArray()[7],-90);
        this.qSort.insert(-10);
        this.qSort.insert(-5);
        this.qSort.insert(-909);
        this.qSort.insert(45);
        assertEquals(this.qSort.getTheArray()[8],-10);
        assertEquals(this.qSort.getTheArray()[9],-5);
        assertEquals(this.qSort.getTheArray()[10],-909);
        assertEquals(this.qSort.getTheArray()[11],45);
        this.qSort.quickSort();
        assertEquals(this.qSort.getTheArray()[0],-909);
        assertEquals(this.qSort.getTheArray()[1],-109);
        assertEquals(this.qSort.getTheArray()[2],-90);
        assertEquals(this.qSort.getTheArray()[3],-13);
        assertEquals(this.qSort.getTheArray()[4],-10);
        assertEquals(this.qSort.getTheArray()[5],-5);
        assertEquals(this.qSort.getTheArray()[6],5);
        assertEquals(this.qSort.getTheArray()[7],10);
        assertEquals(this.qSort.getTheArray()[8],21);
        assertEquals(this.qSort.getTheArray()[9],45);
        assertEquals(this.qSort.getTheArray()[10],54);
        assertEquals(this.qSort.getTheArray()[11],222);


        assertEquals(this.qSortAlgo1.getTheArray()[0],0);
        this.qSortAlgo1.quickSort();

        assertEquals(this.quickSortThree.size(),3);
        assertEquals(this.quickSortThree.getTheArray()[0],22);
        assertEquals(this.quickSortThree.getTheArray()[1],14);
        assertEquals(this.quickSortThree.getTheArray()[2],-10);
        this.quickSortThree.quickSort();
        assertEquals(this.quickSortThree.size(),3);
        assertEquals(this.quickSortThree.getTheArray()[0],-10);
        assertEquals(this.quickSortThree.getTheArray()[1],14);
        assertEquals(this.quickSortThree.getTheArray()[2],22);


    }

    @Test(expected = NullPointerException.class)
    public void quickSortException() {
        this.qSortException.quickSort();
    }

    @Test
    public void getTheArray() throws Exception {
        long[] ant = this.qSort.getTheArray();
        assertEquals(this.qSort.getTheArray()[0],222);
        assertEquals(this.qSort.getTheArray()[1],10);
        assertEquals(this.qSort.getTheArray()[2],-109);
        assertEquals(this.qSort.getTheArray()[3],5);
        assertEquals(this.qSort.getTheArray()[4],-13);
        assertEquals(this.qSort.getTheArray()[5],54);
        assertEquals(this.qSort.getTheArray()[6],21);
        assertEquals(ant[0],222);
        assertEquals(ant[1],10);
        assertEquals(ant[2],-109);
        assertEquals(ant[3],5);
        assertEquals(ant[4],-13);
        assertEquals(ant[5],54);
        assertEquals(ant[6],21);
        assertEquals(this.qSortAlgo1.getTheArray()[1],0);
    }

    @Test(expected = NullPointerException.class)
    public void getTheArrayException() {
        this.qSortException.getTheArray();
    }

    @Test
    public void size() throws Exception {
        assertEquals(this.qSort.size(),7);
        this.qSort.insert(1);
        assertEquals(this.qSort.size(),8);
        this.qSort.quickSort();
        assertEquals(this.qSort.size(),8);
        this.qSort.insert(0);
        assertEquals(this.qSort.size(),9);
    }

    @Test(expected = NullPointerException.class)
    public void getnElemsException() {
        this.qSortException.size();
    }

}