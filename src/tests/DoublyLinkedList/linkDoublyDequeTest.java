package DoublyLinkedList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class linkDoublyDequeTest {

    Link link, dLink;
    DoublyLinkedList doublyLinkedList, list;
    linkDoublyDeque deque, linkDoublyDeque;

    @Before
    public void setUp() throws Exception {
        this.deque = new linkDoublyDeque();
        this.deque.insertRight(12);
        this.deque.insertRight(-13);
        this.deque.insertLeft(90);
        this.deque.insertLeft(10);
        this.linkDoublyDeque = new linkDoublyDeque();
    }

    @After
    public void tearDown() throws Exception {
        this.linkDoublyDeque = null;
        this.deque = null;
    }

    @Test
    public void insertRight() throws Exception {
        assertEquals(this.deque.getFront().getdData(),-13);
        this.deque.insertRight(99);
        assertEquals(this.deque.getFront().getdData(),99);
        this.linkDoublyDeque.insertRight(78);
        assertEquals(this.linkDoublyDeque.getFront().getdData(),78);
        this.linkDoublyDeque.insertRight(0);
        assertEquals(this.linkDoublyDeque.getFront().getdData(),0);
    }

    @Test
    public void insertLeft() throws Exception {
        assertEquals(this.deque.getRear().getdData(),10);
        this.deque.insertLeft(14);
        assertEquals(this.deque.getRear().getdData(),14);
        this.deque.insertLeft(-10000);
        assertEquals(this.deque.getRear().getdData(),-10000);
        this.linkDoublyDeque.insertLeft(0);
        assertEquals(this.linkDoublyDeque.getRear().getdData(),0);
    }

    @Test
    public void removeRight() throws Exception {
        assertEquals(this.deque.getFront().getdData(),-13);
        assertEquals(this.deque.removeRight(),-13);
        assertEquals(this.deque.getFront().getdData(),12);
        assertEquals(this.deque.removeRight(),12);
        assertEquals(this.deque.getFront().getdData(),90);
        assertEquals(this.linkDoublyDeque.removeRight(),0);
    }

    @Test(expected = NullPointerException.class)
    public void removeRightException() {
        assertEquals(this.linkDoublyDeque.removeRight(),0);
        assertEquals(this.linkDoublyDeque.getFront().getdData(),0);
    }

    @Test
    public void removeLeft() throws Exception {
        assertEquals(this.deque.getRear().getdData(),10);
        assertEquals(this.deque.removeLeft(),10);
        assertEquals(this.deque.getRear().getdData(),90);
        assertEquals(this.deque.removeLeft(),90);
        assertEquals(this.deque.getRear().getdData(),12);
    }

    @Test(expected = NullPointerException.class)
    public void removeLeftException() {
        assertEquals(this.linkDoublyDeque.removeLeft(),0);
        assertEquals(this.linkDoublyDeque.getFront().getdData(),0);
    }

    @Test
    public void displayDeque() throws Exception {
        this.deque.displayDeque();
        this.deque.removeRight();
        this.deque.insertLeft(222);
        this.deque.displayDeque();
    }

    @Test
    public void displayDequeReverse() throws Exception {
        this.deque.displayDequeReverse();
        this.deque.removeRight();
        this.deque.insertLeft(222);
        this.deque.displayDequeReverse();
    }

    @Test
    public void isEmpty() throws Exception {
        assertEquals(this.deque.isEmpty(),false);
        this.deque.removeRight();
        assertEquals(this.deque.isEmpty(),false);
        this.deque.removeRight();
        this.deque.removeRight();
        this.deque.removeRight();
        assertEquals(this.deque.isEmpty(),true);
    }

    @Test
    public void peekFront() throws Exception {
        assertEquals(this.deque.peekFront(),-13);
        this.deque.removeRight();
        assertEquals(this.deque.peekFront(),12);
        this.deque.removeRight();
        assertEquals(this.deque.peekFront(),90);
        this.deque.removeRight();
        assertEquals(this.deque.peekFront(),10);
    }

    @Test(expected = NullPointerException.class)
    public void peekFrontException() {
        assertEquals(this.linkDoublyDeque.peekFront(),0);
    }

    @Test
    public void peekRear() throws Exception {
        assertEquals(this.deque.peekRear(),10);
        this.deque.removeLeft();
        assertEquals(this.deque.peekRear(),90);
        this.deque.removeLeft();
        assertEquals(this.deque.peekRear(),12);
        this.deque.removeLeft();
        assertEquals(this.deque.peekRear(),-13);
    }

    @Test
    public void getFront() throws Exception {
        assertEquals(this.deque.getFront().getdData(),-13);
        this.link = this.deque.getFront();
        assertEquals(this.link.getdData(),-13);
        this.deque.removeRight();
        assertEquals(this.deque.getFront().getdData(),12);
        this.dLink = this.deque.getFront();
        assertEquals(this.dLink.getdData(),12);
        assertNotSame(this.dLink,this.link);
    }

    @Test(expected = NullPointerException.class)
    public void getFrontException() {
        this.link = this.linkDoublyDeque.getFront();
        assertEquals(this.link.getdData(),10);
    }

    @Test
    public void getRear() throws Exception {
        assertEquals(this.deque.getRear().getdData(),10);
        this.link = this.deque.getRear();
        assertEquals(this.link.getdData(),10);
        this.deque.removeLeft();
        assertEquals(this.deque.getRear().getdData(),90);
        this.dLink = this.deque.getRear();
        assertEquals(this.dLink.getdData(),90);
        assertNotSame(this.dLink,this.link);
    }

    @Test(expected = NullPointerException.class)
    public void getReaeException() {
        this.link = this.linkDoublyDeque.getRear();
        assertNotSame(this.link.getdData(),10);
    }

    @Test
    public void getDequeLinkedList() throws Exception {
        this.doublyLinkedList = this.deque.getDequeLinkedList();
        assertEquals(this.doublyLinkedList.getFirst().getdData(),10);
        this.doublyLinkedList.displayBackward();
        this.doublyLinkedList.deleteFisrt();
        assertEquals(this.doublyLinkedList.getFirst().getdData(),90);
        this.doublyLinkedList.displayForward();
    }

}