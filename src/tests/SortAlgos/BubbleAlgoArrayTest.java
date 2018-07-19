package SortAlgos;

import SortAlgos.BubbleAlgoArray;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BubbleAlgoArrayTest {

    BubbleAlgoArray bubble, bubbleAlgoArrayException;

    @Before
    public void setUp() throws Exception {
        this.bubble = new BubbleAlgoArray(10);
        this.bubble.insert(10);
        this.bubble.insert(4);
        this.bubble.insert(1);
        this.bubble.insert(7);
        this.bubble.insert(12);
    }

    @After
    public void tearDown() throws Exception {
        this.bubble = null;
    }

    @Test
    public void insert() throws Exception {
        assertEquals(this.bubble.getArray()[6],0);
        assertEquals(this.bubble.getArray()[5],0);
        assertEquals(this.bubble.getArray()[0], 10);
        assertEquals(this.bubble.getnElems(),5);
        this.bubble.insert(19);
        assertEquals(this.bubble.getnElems(),6);
        assertEquals(this.bubble.getArray()[5],19);
    }

    @Test
    public void bubbleSort() throws Exception {
        assertEquals(this.bubble.getArray()[0],10);
        assertEquals(this.bubble.getArray()[3],7);
        this.bubble.bubbleSort();
        assertEquals(this.bubble.getArray()[0],1);
        assertEquals(this.bubble.getArray()[3],10);
    }

    @Test
    public void getArray() throws Exception {
        assertNotNull(this.bubble.getArray());
    }

    @Test
    public void getnElems() throws Exception {
        assertNotNull(this.bubble.getnElems());
        assertEquals(this.bubble.getnElems(),5);
    }

    @Test(expected = NegativeArraySizeException.class)
    public void setUpException(){
        bubbleAlgoArrayException = new BubbleAlgoArray(-12);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void insertException() {
        for (int i = 14; i<=20; i++){
            this.bubble.insert(i);
        }
    }

    @Test(expected = NullPointerException.class)
    public void getArrayException() {
        this.bubble = null;
        this.bubble.getArray();
    }

    @Test(expected = NullPointerException.class)
    public void getnElemsException() {
        this.bubble = null;
        this.bubble.getnElems();
    }

    @Test(expected = NullPointerException.class)
    public void bubbleSortException() {
        this.bubble = null;
        this.bubble.bubbleSort();
    }

    @Test(expected = NullPointerException.class)
    public void displayException() {
        this.bubble = null;
        this.bubble.display();
    }
}