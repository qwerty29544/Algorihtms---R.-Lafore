package DoublyLinkedList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DoublyLinkedListTest {

    boolean trigger, marker;
    Link link, linker;
    DoublyLinkedList linkedList, doublyLinkedList, list;

    @Before
    public void setUp() throws Exception {
        this.doublyLinkedList = new DoublyLinkedList();
        this.linkedList = new DoublyLinkedList();
        this.linkedList.insertFirst(2324);
        this.linkedList.insertLast(-12);
        this.list = new DoublyLinkedList();
        this.list.insertLast(20);
        this.list.insertLast(345);
        this.list.insertFirst(-10);
    }

    @After
    public void tearDown() throws Exception {
        this.list = null;
        this.linkedList = null;
        this.doublyLinkedList = null;
    }

    @Test
    public void isEmpty() throws Exception {
        assertEquals(this.doublyLinkedList.isEmpty(),true);
        assertEquals(this.linkedList.isEmpty(),false);
        this.linkedList.deleteFisrt();
        this.linkedList.deleteFisrt();
        assertEquals(this.linkedList.isEmpty(),true);
        assertEquals(this.list.isEmpty(),false);
    }

    @Test
    public void insertFirst() throws Exception {
        this.doublyLinkedList.insertFirst(234);
        assertEquals(this.doublyLinkedList.getFirst().getdData(),234);
        this.doublyLinkedList.insertFirst(-234);
        assertEquals(this.doublyLinkedList.getFirst().getdData(),-234);
        this.doublyLinkedList.insertFirst(0);
        assertEquals(this.doublyLinkedList.getFirst().getdData(),0);
    }

    @Test
    public void insertLast() throws Exception {
        this.doublyLinkedList.insertLast(934);
        assertEquals(this.doublyLinkedList.getLast().getdData(),934);
        this.doublyLinkedList.insertLast(-934);
        assertEquals(this.doublyLinkedList.getLast().getdData(),-934);
        this.doublyLinkedList.insertLast(0);
        assertEquals(this.doublyLinkedList.getLast().getdData(),0);
        this.doublyLinkedList.insertLast(1000000000);
        assertEquals(this.doublyLinkedList.getLast().getdData(),1000000000);
    }

    @Test
    public void insertAfter() throws Exception {
        this.linkedList.insertAfter(-12,12);
        assertEquals(this.linkedList.getLast().getdData(),12);
        this.marker = this.linkedList.insertAfter(90,91);
        assertEquals(this.marker,false);
        this.marker = this.linkedList.insertAfter(12,13);
        assertEquals(this.marker,true);
        assertEquals(this.linkedList.getLast().getdData(),13);
        this.marker = this.linkedList.insertAfter(12,193);
        assertEquals(this.marker,true);
        assertEquals(this.linkedList.getLast().getdData(),13);
    }

    @Test(expected = NullPointerException.class)
    public void insertAfterException() {
        this.doublyLinkedList.insertAfter(12,345);
    }

    @Test
    public void deleteFisrt() throws Exception {
        assertEquals(this.linkedList.getFirst().getdData(),2324);
        this.link = this.linkedList.deleteFisrt();
        assertEquals(this.linkedList.getFirst().getdData(),-12);
        assertEquals(this.link.getdData(),2324);
        assertEquals(this.list.getFirst().getdData(),-10);
        this.linker = this.list.deleteFisrt();
        assertEquals(this.list.getFirst().getdData(),20);
        assertEquals(this.linker.getdData(),-10);
    }

    @Test(expected = NullPointerException.class)
    public void deleteFirstException() {
        this.link = this.doublyLinkedList.deleteFisrt();
    }

    @Test
    public void deleteLast() throws Exception {
        assertEquals(this.list.getLast().getdData(),345);
        this.link = this.list.deleteLast();
        assertEquals(this.list.getLast().getdData(),20);
        assertEquals(this.link.getdData(),345);
        this.linker = this.list.deleteLast();
        assertEquals(this.list.getLast().getdData(),-10);
        assertEquals(this.linker.getdData(),20);
    }

    @Test(expected = NullPointerException.class)
    public void deleteLastException() {
        this.linker = this.doublyLinkedList.deleteLast();
    }

    @Test
    public void deleteKey() throws Exception {
        assertEquals(this.linkedList.getLast().getdData(),-12);
        this.link = this.linkedList.deleteKey(-12);
        assertEquals(this.linkedList.getLast().getdData(),2324);
        this.linker = this.linkedList.deleteKey(2324);
        assertEquals(this.link.getdData(),-12);
        assertEquals(this.linker.getdData(),2324);
    }

    @Test(expected = NullPointerException.class)
    public void deleteKeyException2() throws Exception {
        assertEquals(this.linkedList.getLast().getdData(),-12);
        this.link = this.linkedList.deleteKey(-12);
        assertEquals(this.linkedList.getLast().getdData(),2324);
        this.linker = this.linkedList.deleteKey(2324);
        assertEquals(this.linkedList.getLast().getdData(),0);
    }

    @Test(expected = NullPointerException.class)
    public void deleteKeyException() {
        this.linker = this.doublyLinkedList.deleteKey(23);
    }

    @Test
    public void displayForward() throws Exception {
        this.linkedList.displayForward();
        this.linkedList.insertLast(22);
        this.linkedList.insertFirst(23);
        this.linkedList.displayForward();
    }

    @Test
    public void l() {
        this.doublyLinkedList.displayForward();
    }

    @Test
    public void displayBackward() throws Exception {
        this.linkedList.displayBackward();
        this.linkedList.insertLast(2345);
        this.linkedList.insertAfter(20, 23);
        this.linkedList.displayBackward();
    }

    @Test
    public void ll() {
        this.doublyLinkedList.displayBackward();
    }

    @Test
    public void getFirst() throws Exception {
        this.linker = this.linkedList.getFirst();
        assertEquals(this.linker.getdData(),2324);
        assertEquals(this.linkedList.getFirst().getdData(),2324);
        this.link = this.list.getFirst();
        assertEquals(this.list.getFirst().getdData(),-10);
        assertEquals(this.link.getdData(),-10);
    }

    @Test(expected = NullPointerException.class)
    public void getFirstException() {
        this.link = this.doublyLinkedList.getFirst();
        assertEquals(this.link.getdData(),0);
    }

    @Test
    public void getLast() throws Exception {
        this.linker = this.linkedList.getLast();
        assertEquals(this.linker.getdData(),-12);
        assertEquals(this.linkedList.getLast().getdData(),-12);
        this.link = this.list.getLast();
        assertEquals(this.list.getLast().getdData(),345);
        assertEquals(this.link.getdData(),345);
    }

}