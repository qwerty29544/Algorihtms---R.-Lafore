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
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void insert() throws Exception {
        this.bubble.insert(10);
        assertEquals(this.bubble.getArray()[0], 10);
        assertEquals(this.bubble.getnElems(),1);
    }

    @Test
    public void bubbleSort() throws Exception {
    }

    @Test
    public void getArray() throws Exception {
    }

    @Test
    public void getnElems() throws Exception {
    }

}