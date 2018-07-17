package SortAlgos;

import SortAlgos.BubbleAlgoArray;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BubbleAlgoArrayTest {

    BubbleAlgoArray bubble;

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
        assertNull(this.bubble.getArray()[5]);
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

    }

    @Test
    public void getnElems() throws Exception {
    }

}