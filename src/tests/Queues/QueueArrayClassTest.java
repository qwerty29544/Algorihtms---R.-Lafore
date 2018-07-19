package Queues;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class QueueArrayClassTest{

    QueueArrayClass queueArray, queueArrayClassException, emptyQueue, fullQueue;

    @Before
    public void setUp() throws Exception {
        this.queueArray = new QueueArrayClass(7);
        this.queueArray.insert(12);
        this.queueArray.insert(20);
        this.queueArray.insert(0);
        this.queueArray.insert(-10);
        this.emptyQueue = new QueueArrayClass(10);
        this.fullQueue = new QueueArrayClass(3);
        this.fullQueue.insert(12);
    }

    @Test(expected = NegativeArraySizeException.class)
    public void constructorException(){
        this.queueArrayClassException = new QueueArrayClass(-10);
    }

    @After
    public void tearDown() throws Exception {
        this.queueArray = null;
        this.fullQueue = null;
        this.emptyQueue = null;
    }

    @Test
    public void insert() throws Exception {
        assertEquals(this.queueArray.getRear(),3);
        assertEquals(this.queueArray.peekFront(),12);
        this.queueArray.insert(20);
        assertEquals(this.queueArray.getRear(),4);
        assertEquals(this.queueArray.peekFront(),12);
        this.queueArray.insert(20);
        this.queueArray.insert(20);
        this.queueArray.insert(20);
        this.queueArray.insert(20);
        assertEquals(this.queueArray.getRear(),1);
    }

    @Test
    public void remove() throws Exception {
        assertEquals(this.queueArray.peekFront(),12);
        assertEquals(this.queueArray.getRear(),3);
        assertEquals(this.queueArray.getFront(),0);
        this.queueArray.remove();
        assertEquals(this.queueArray.peekFront(),20);
        assertEquals(this.queueArray.getFront(),1);
        assertEquals(this.queueArray.getRear(),3);
    }

    @Test
    public void peekFront() throws Exception {
        assertEquals(this.queueArray.peekFront(),12);
        this.queueArray.remove();
        assertEquals(this.queueArray.peekFront(),20);
    }

    @Test
    public void isEmpty() throws Exception {
        assertEquals(this.emptyQueue.isEmpty(),true);
        this.emptyQueue.insert(3);
        assertEquals(this.emptyQueue.isEmpty(),false);
        this.emptyQueue.remove();
        assertEquals(this.emptyQueue.isEmpty(),true);
    }

    @Test
    public void isFull() throws Exception {
        assertEquals(this.fullQueue.isFull(),false);
        assertEquals(this.fullQueue.getMaxSize(),3);
        assertEquals(this.fullQueue.size(),1);
        this.fullQueue.insert(21);
        assertEquals(this.fullQueue.isFull(),false);
        this.fullQueue.insert(21);
        assertEquals(this.fullQueue.isFull(),true);
    }

    @Test
    public void size() throws Exception {
        assertEquals(this.fullQueue.size(),1);
        assertEquals(this.queueArray.size(),4);
        this.queueArray.remove();
        assertEquals(this.queueArray.size(),3);
    }

    @Test
    public void getMaxSize() throws Exception {
        assertEquals(this.queueArray.getMaxSize(),7);
        assertEquals(this.fullQueue.getMaxSize(),3);
    }

    @Test
    public void getQueArray() throws Exception {
        assertNotNull(this.queueArray.getQueArray());
        assertEquals(this.queueArray.getQueArray()[1],20);
    }

    @Test
    public void getFront() throws Exception {
        assertEquals(this.queueArray.getFront(),0);
        this.queueArray.remove();
        assertEquals(this.queueArray.getFront(),1);
    }

    @Test
    public void getRear() throws Exception {
        assertEquals(this.queueArray.getRear(),3);
    }

    @Test(expected = NullPointerException.class)
    public void getRearException() {
        this.queueArray = null;
        this.queueArray.getRear();
    }

    @Test(expected = NullPointerException.class)
    public void peekFrontException() {
        this.queueArray = null;
        this.queueArray.peekFront();
    }

    @Test(expected = NullPointerException.class)
    public void getFrontException() {
        this.queueArray = null;
        this.queueArray.getFront();
    }

    @Test(expected = NullPointerException.class)
    public void getQueArrayException() {
        this.queueArray = null;
        this.queueArray.getQueArray();
    }

    @Test(expected = NullPointerException.class)
    public void getMaxSizeException() {
        this.queueArray = null;
        this.queueArray.getMaxSize();
    }

    @Test(expected = NullPointerException.class)
    public void isFullException() {
        this.queueArray = null;
        this.queueArray.isFull();
    }

    @Test(expected = NullPointerException.class)
    public void isEmptyException() {
        this.queueArray = null;
        this.queueArray.isEmpty();
    }

    @Test(expected = NullPointerException.class)
    public void sizeException() {
        this.queueArray = null;
        this.queueArray.size();
    }

    @Test(expected = NullPointerException.class)
    public void removeException() {
        this.queueArray = null;
        this.queueArray.remove();
    }

}