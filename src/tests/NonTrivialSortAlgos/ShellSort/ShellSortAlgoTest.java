package NonTrivialSortAlgos.ShellSort;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShellSortAlgoTest {

    long[] array;
    ShellSortAlgo shellSortAlgo, sortAlgo, emptySortAlgo, sortAlgoException;

    @Before
    public void setUp() throws Exception {
        this.shellSortAlgo = new ShellSortAlgo(10);
        this.shellSortAlgo.insert(22);
        this.shellSortAlgo.insert(11);
        this.shellSortAlgo.insert(-10);
        this.shellSortAlgo.insert(-9);
        this.shellSortAlgo.insert(222);
        this.shellSortAlgo.insert(108);
        this.sortAlgo = new ShellSortAlgo(122);
        for (long i=158; i>-100; i=i-8){
            this.sortAlgo.insert(i);
        }
        this.emptySortAlgo = new ShellSortAlgo(24);

    }

    @After
    public void tearDown() throws Exception {
        this.shellSortAlgo = null;
        this.emptySortAlgo = null;
        this.sortAlgo = null;
    }

    @Test(expected = NegativeArraySizeException.class)
    public void setUpException() {
        this.sortAlgoException = new ShellSortAlgo(-100);
    }

    @Test
    public void insert() throws Exception {
        assertEquals(this.shellSortAlgo.getTheArray()[0],22);
        assertEquals(this.shellSortAlgo.getTheArray()[5],108);
        assertEquals(this.shellSortAlgo.getTheArray()[6],0);
        this.shellSortAlgo.insert(2222);
        assertEquals(this.shellSortAlgo.getTheArray()[6],2222);
        assertEquals(this.shellSortAlgo.getTheArray()[7],0);
        this.shellSortAlgo.insert(-2222);
        assertEquals(this.shellSortAlgo.getTheArray()[7],-2222);
    }

    @Test(expected = NullPointerException.class)
    public void insertException() {
        this.sortAlgoException.insert(2222);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void insertException2() {
        for (long i=0; i<158; i++){
            this.sortAlgo.insert(i);
        }
    }

    @Test
    public void display() throws Exception {
        this.sortAlgo.display();
        this.sortAlgo.shellSort();
        this.sortAlgo.display();
        this.sortAlgo.insert(22222);
        this.sortAlgo.insert(-10);
        this.sortAlgo.display();
        this.sortAlgo.shellSort();
        this.sortAlgo.display();
    }

    @Test(expected = NullPointerException.class)
    public void displayException() {
        this.sortAlgoException.display();
    }

    @Test
    public void shellSort() throws Exception {
        this.sortAlgo.display();
        assertEquals(this.sortAlgo.getTheArray()[0],158);
        assertEquals(this.sortAlgo.getTheArray()[this.sortAlgo.getnElems() - 1],-98);
        this.sortAlgo.shellSort();
        assertEquals(this.sortAlgo.getTheArray()[0],-98);
        assertEquals(this.sortAlgo.getTheArray()[this.sortAlgo.getnElems() - 1],158);
        this.sortAlgo.display();

        this.shellSortAlgo.display();
        assertEquals(this.shellSortAlgo.getTheArray()[0],22);
        assertEquals(this.shellSortAlgo.getTheArray()[1],11);
        assertEquals(this.shellSortAlgo.getTheArray()[2],-10);
        assertEquals(this.shellSortAlgo.getTheArray()[3],-9);
        assertEquals(this.shellSortAlgo.getTheArray()[4],222);
        assertEquals(this.shellSortAlgo.getTheArray()[5],108);
        this.shellSortAlgo.shellSort();
        this.shellSortAlgo.display();
        assertEquals(this.shellSortAlgo.getTheArray()[0],-10);
        assertEquals(this.shellSortAlgo.getTheArray()[1],-9);
        assertEquals(this.shellSortAlgo.getTheArray()[2],11);
        assertEquals(this.shellSortAlgo.getTheArray()[3],22);
        assertEquals(this.shellSortAlgo.getTheArray()[4],108);
        assertEquals(this.shellSortAlgo.getTheArray()[5],222);
    }

    @Test(expected = NullPointerException.class)
    public void shellSortException() {
        this.sortAlgoException.shellSort();
    }

    @Test
    public void getTheArray() throws Exception {
        assertEquals(this.shellSortAlgo.getTheArray()[2],-10);
        this.array = this.shellSortAlgo.getTheArray();
        assertEquals(this.array[0],22);
        assertEquals(this.array[1],11);
        assertEquals(this.array[2],-10);
        assertEquals(this.array[3],-9);
        assertEquals(this.array[4],222);
        assertEquals(this.array[5],108);
        this.shellSortAlgo.shellSort();
        this.array = this.shellSortAlgo.getTheArray();
        assertEquals(this.array[0],-10);
        assertEquals(this.array[1],-9);
        assertEquals(this.array[2],11);
        assertEquals(this.array[3],22);
        assertEquals(this.array[4],108);
        assertEquals(this.array[5],222);
    }

    @Test(expected = NullPointerException.class)
    public void getTheArrayException() {
        this.sortAlgoException.getTheArray();
    }

    @Test
    public void getnElems() throws Exception {
        assertEquals(this.shellSortAlgo.getnElems(),6);
        this.shellSortAlgo.shellSort();
        assertEquals(this.shellSortAlgo.getnElems(),6);
        this.shellSortAlgo.insert(2222);
        this.shellSortAlgo.insert(2222);
        assertEquals(this.shellSortAlgo.getnElems(),8);
    }

    @Test(expected = NullPointerException.class)
    public void getnElemsException() {
        this.sortAlgoException.getnElems();
    }

}