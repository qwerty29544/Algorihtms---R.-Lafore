package PriorityQueues;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PriorityQueueArrayClassTest {

    PriorityQueueArrayClass priorityQueueArray, priorityQueueArrayException, emptyQ, fullQ;

    @Before
    public void setUp() throws Exception {
        this.priorityQueueArray = new PriorityQueueArrayClass(6);
        this.priorityQueueArray.insert(20);
        this.priorityQueueArray.insert(9);
        this.priorityQueueArray.insert(42);
        this.priorityQueueArray.insert(-21);
        this.emptyQ = new PriorityQueueArrayClass(10);
        this.fullQ = new PriorityQueueArrayClass(3);
        this.fullQ.insert(2);
        this.fullQ.insert(25);
    }

    @After
    public void tearDown() throws Exception {
        this.fullQ = null;
        this.emptyQ = null;
        this.priorityQueueArray = null;
    }

    @Test(expected = NegativeArraySizeException.class)
    public void constructorException() {
        this.priorityQueueArrayException = new PriorityQueueArrayClass(-20);
    }

    @Test
    public void insert() throws Exception {

    }

    @Test
    public void remove() throws Exception {
    }

    @Test
    public void peekMin() throws Exception {
    }

    @Test
    public void isEmpty() throws Exception {
    }

    @Test
    public void isFull() throws Exception {
    }

    @Test
    public void getMaxSize() throws Exception {
    }

    @Test
    public void getQueArray() throws Exception {
    }

    @Test
    public void getnItems() throws Exception {
    }

}