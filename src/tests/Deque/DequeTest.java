package Deque;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DequeTest {

    Deque deque, dequearray, fullDeque, emptyDeque;

    @Before
    public void setUp() throws Exception {
        this.deque = new Deque(6);
        this.deque.insertLeft(3);
        this.deque.insertRight(6);
        this.deque.insertLeft(9);
        this.fullDeque = new Deque(3);
        this.fullDeque.insertLeft(3);
        this.fullDeque.insertLeft(123);
        this.emptyDeque = new Deque(10);
    }

    @After
    public void tearDown() throws Exception {
        this.emptyDeque = null;
        this.fullDeque = null;
        this.deque = null;
    }

    @Test(expected = NegativeArraySizeException.class)
    public void constructorException(){
        this.dequearray = new Deque(-10);
    }

    @Test
    public void insert2(){
        for(int i=1; i<=9; i++){
            this.deque.insertLeft(i);
        }
    }

    @Test
    public void insertLeft() throws Exception {
        assertEquals(this.deque.getQueArray()[5],3);
        assertEquals(this.deque.getQueArray()[4],9);
        assertEquals(this.deque.getQueArray()[0],6);
        assertEquals(this.deque.size(),3);
        this.deque.insertLeft(5);
        assertEquals(this.deque.size(),4);
        assertEquals(this.deque.getQueArray()[3],5);
        this.deque.insertLeft(2);
        assertEquals(this.deque.size(),5);
        assertEquals(this.deque.getQueArray()[(int)this.deque.getFront()],2);
    }

    @Test
    public void removeRight() throws Exception {
        assertEquals(this.deque.size(),3);
        assertEquals(this.deque.getQueArray()[this.deque.getRear()],6);
        this.deque.removeRight();
        assertEquals(this.deque.size(),2);
        assertEquals(this.deque.getQueArray()[this.deque.getRear()],3);
    }

    @Test
    public void insertRight() throws Exception {
        assertEquals(this.deque.size(),3);
        assertEquals(this.deque.getQueArray()[this.deque.getRear()],6);
        this.deque.insertRight(8);
        assertEquals(this.deque.getQueArray()[this.deque.getRear()],8);
        assertEquals(this.deque.size(),4);
    }

    @Test
    public void removeLeft() throws Exception {
        assertEquals(this.deque.size(),3);
        assertEquals(this.deque.peekFront(),9);
        this.deque.removeLeft();
        assertEquals(this.deque.size(),2);
        assertEquals(this.deque.peekFront(),3);
    }

    @Test
    public void peekFront() throws Exception {
        assertEquals(this.emptyDeque.peekFront(),0);
        assertEquals(this.deque.peekFront(),this.deque.getQueArray()[this.deque.getFront()]);
    }

    @Test
    public void peekRear() throws Exception {
        assertEquals(this.emptyDeque.peekFront(),0);
        assertEquals(this.deque.peekRear(),this.deque.getQueArray()[this.deque.getRear()]);

    }

    @Test
    public void isEmpty() throws Exception {
        assertEquals(this.emptyDeque.isEmpty(),true);
        this.emptyDeque.insertLeft(3);
        assertEquals(this.emptyDeque.isEmpty(),false);
        this.emptyDeque.removeLeft();
        assertEquals(this.emptyDeque.isEmpty(),true);

    }

    @Test
    public void isFull() throws Exception {
        assertEquals(this.fullDeque.isFull(),false);
        this.fullDeque.insertRight(54);
        assertEquals(this.fullDeque.isFull(),true);
    }

    @Test
    public void size() throws Exception {
        assertEquals(this.deque.size(),3);
        this.deque.removeLeft();
        assertEquals(this.deque.size(),2);
    }

    @Test
    public void getMaxSize() throws Exception {
        assertEquals(this.deque.getMaxSize(),6);
    }

    @Test
    public void getQueArray() throws Exception {
        long[] distance = {6, 0, 0, 0, 9, 3};
        assertNotNull(this.deque.getQueArray());
        assertArrayEquals(this.deque.getQueArray(), distance);
    }

    @Test
    public void getFront() throws Exception {
        assertEquals(this.deque.getFront(),4);
    }

    @Test
    public void getRear() throws Exception {
        assertEquals(this.deque.getRear(),0);
    }

    @Test(expected = NullPointerException.class)
    public void getRearException() {
        this.deque = null;
        this.deque.getRear();
    }

    @Test(expected = NullPointerException.class)
    public void getFrontException() {
        this.deque = null;
        this.deque.getFront();
    }

    @Test(expected = NullPointerException.class)
    public void getQueArrayException() {
        this.deque = null;
        this.deque.getQueArray();
    }

    @Test(expected = NullPointerException.class)
    public void getMaxSizeException() {
        this.deque = null;
        this.deque.getMaxSize();
    }

    @Test(expected = NullPointerException.class)
    public void sizeException() {
        this.deque = null;
        this.deque.size();
    }

    @Test(expected = NullPointerException.class)
    public void isFullException() {
        this.deque = null;
        this.deque.isFull();
    }

    @Test(expected = NullPointerException.class)
    public void isEmptyException() {
        this.deque = null;
        this.deque.isEmpty();
    }

    @Test(expected = NullPointerException.class)
    public void peekRearException() {
        this.deque = null;
        this.deque.peekRear();
    }

    @Test(expected = NullPointerException.class)
    public void peekFrontException() {
        this.deque = null;
        this.deque.peekFront();
    }

    @Test(expected = NullPointerException.class)
    public void removeRightException() {
        this.deque = null;
        this.deque.removeRight();
    }

    @Test(expected = NullPointerException.class)
    public void removeLeftException() {
        this.deque = null;
        this.deque.removeLeft();
    }





}