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
        assertEquals(this.priorityQueueArray.peekMin(),-21);
        this.priorityQueueArray.insert(-22);
        assertEquals(this.priorityQueueArray.peekMin(),-22);
        this.priorityQueueArray.insert(10);
        assertEquals(this.priorityQueueArray.getQueArray()[2],10);
        assertEquals(this.priorityQueueArray.isFull(),true);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void insertException(){
        for (int i=123; i<=132; i++){
            this.priorityQueueArray.insert(i);
        }
    }

    @Test
    public void remove() throws Exception {
        assertEquals(this.priorityQueueArray.getQueArray()[3],-21);
        this.priorityQueueArray.remove();
        assertEquals(this.priorityQueueArray.getQueArray()[2],9);
        this.priorityQueueArray.remove();
        this.priorityQueueArray.remove();
        this.priorityQueueArray.remove();
        assertEquals(this.priorityQueueArray.isEmpty(),true);
    }

    @Test
    public void peekMin() throws Exception {
        assertEquals(this.priorityQueueArray.peekMin(),-21);
        this.priorityQueueArray.insert(-1230);
        this.priorityQueueArray.insert(0);
        assertEquals(this.priorityQueueArray.peekMin(),-1230);
    }

    @Test
    public void isEmpty() throws Exception {
        assertEquals(this.emptyQ.isEmpty(),true);
        this.emptyQ.insert(2);
        assertEquals(this.emptyQ.isEmpty(),false);
        this.emptyQ.remove();
        assertEquals(this.emptyQ.isEmpty(),true);
    }

    @Test
    public void isFull() throws Exception {
        assertEquals(this.fullQ.isFull(),false);
        this.fullQ.insert(3);
        assertEquals(this.fullQ.isFull(),true);
    }

    @Test
    public void getMaxSize() throws Exception {
        assertEquals(this.fullQ.getMaxSize(),3);
        assertEquals(this.priorityQueueArray.getMaxSize(),6);
    }

    @Test
    public void getQueArray() throws Exception {
        assertNotNull(this.priorityQueueArray.getQueArray());
        assertEquals(this.priorityQueueArray.getQueArray()[0],42);
        assertEquals(this.emptyQ.getQueArray()[0],0);
    }

    @Test
    public void getnItems() throws Exception {
        assertEquals(this.priorityQueueArray.getnItems(),4);
        this.priorityQueueArray.remove();
        assertEquals(this.priorityQueueArray.getnItems(),3);
        this.priorityQueueArray.remove();
        this.priorityQueueArray.remove();
        this.priorityQueueArray.remove();
        assertEquals(this.priorityQueueArray.getnItems(),0);
    }

}