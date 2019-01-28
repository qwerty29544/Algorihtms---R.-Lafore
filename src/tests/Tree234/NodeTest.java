package Tree234;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NodeTest {

    Node node, node2, node3, nodeTest, nodeException;
    DataItem item, dataItem, item2, item3, item4;

    @Before
    public void setUp() throws Exception {
        this.item = new DataItem(234);
        this.item2 = new DataItem(94);
        this.item3 = new DataItem(-23);
        this.item4 = new DataItem(-100);
        this.node = new Node();
        this.node.insertItem(this.item);
        this.node.insertItem(this.item2);
        this.nodeTest = new Node();
        this.node2 = new Node();
        this.node2.insertItem(item2);
        this.node.connectChild(0,this.node2);

    }

    @After
    public void tearDown() throws Exception {
        this.item = null;
        this.item2 = null;
        this.item3 = null;
        this.item4 = null;
        this.node = null;
        this.nodeTest = null;
    }

    @Test
    public void connectChild() throws Exception {
        assertNull(this.node.getChild(1));
        assertEquals(this.node.getChild(0),this.node2);
        this.node.connectChild(1,this.nodeTest);
        assertEquals(this.node.getChild(1),this.nodeTest);
    }

    @Test(expected = NullPointerException.class)
    public void connectChildExceptionProbably() throws Exception {
        this.node.connectChild(1,this.node3);
        assertNull(this.node.getChild(1));
        this.nodeException.connectChild(1,this.node);
    }

    @Test
    public void disconnectChild() throws Exception {
        assertNotNull(this.node.getChild(0));
        this.node.disconnectChild(0);
        assertNull(this.node.getChild(0));
        this.node.disconnectChild(0);
        assertNull(this.node.getChild(0));
        assertNull(this.node.getChild(1));
        this.node.disconnectChild(1);
        assertNull(this.node.getChild(1));
        assertNull(this.node.getChild(2));
        this.node.disconnectChild(2);
        assertNull(this.node.getChild(2));
    }

    @Test(expected = NullPointerException.class)
    public void disconnectChildException() {
        this.nodeException.disconnectChild(1);
    }

    @Test
    public void getChild() throws Exception {
        assertNotNull(this.node.getChild(0));
        this.node.disconnectChild(0);
        assertNull(this.node.getChild(0));
        this.node.connectChild(0,this.node2);
        assertNotNull(this.node.getChild(0));
        assertEquals(this.node.getChild(0),this.node2);
        this.node3 = new Node();
        this.node3.insertItem(this.item2);
        this.node.connectChild(1,this.node3);
        assertNotNull(this.node.getChild(1));
        assertEquals(this.node.getChild(1),this.node3);
    }

    @Test(expected = NullPointerException.class)
    public void getChildExceptionPRB() throws Exception {
        this.node3 = this.node.getChild(3);
        this.nodeException.getChild(2);
    }

    @Test
    public void getParent() throws Exception {
        this.node3 = new Node();
        this.node3.insertItem(this.item3);
        this.node.connectChild(1,this.node3);
        assertEquals(this.node3.getParent(),this.node);
        this.node.connectChild(2,this.nodeTest);
        assertEquals(this.nodeTest.getParent(),this.node);
    }

    @Test(expected = NullPointerException.class)
    public void getParentException() {
        this.node.disconnectChild(0);
        this.node.connectChild(0,this.nodeException);
        assertEquals(this.nodeException.getParent(),this.node);
    }

    @Test
    public void isLeaf() throws Exception {
        assertEquals(this.node.isLeaf(),false);
        this.node.disconnectChild(0);
        assertEquals(this.node.isLeaf(),true);
        this.node.connectChild(0,this.node2);
        this.node.connectChild(1,this.nodeException);
        assertEquals(this.node.isLeaf(),false);
    }

    @Test(expected = NullPointerException.class)
    public void isLeafException(){
        this.node3.isLeaf();
    }

    @Test
    public void getNumItems() throws Exception {
        assertEquals(this.node.getNumItems(),2);
        this.node.removeItem();
        assertEquals(this.node.getNumItems(),1);
        this.node.removeItem();
        assertEquals(this.node.getNumItems(),0);
        this.node.insertItem(this.item3);
        this.node.insertItem(this.item2);
        this.node.insertItem(this.item4);
        assertEquals(this.node.getNumItems(),3);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void getNumItemsException() {
        this.node.insertItem(this.item);
        this.node.insertItem(this.item3);
        assertEquals(this.node.getNumItems(),3);
    }

    @Test(expected = NullPointerException.class)
    public void getNumItemsException2() {
        int x = this.node3.getNumItems();
    }

    @Test
    public void getItem() throws Exception {
        assertEquals(this.node.getItem(0).getdData(),this.item2.getdData());
        assertEquals(this.node.getItem(1).getdData(),this.item.getdData());
        this.node.removeItem();
    }

    @Test(expected = NullPointerException.class)
    public void getItemException() {
        assertEquals(this.node.getItem(1).getdData(),this.item.getdData());
        this.node.removeItem();
        assertEquals(this.node.getItem(1).getdData(),0);
    }

    @Test
    public void isFull() throws Exception {
        assertEquals(this.node.isFull(),false);
        this.node.insertItem(this.item3);
        assertEquals(this.node.isFull(),true);
    }

    @Test(expected = NullPointerException.class)
    public void isFullException() {
        assertEquals(this.nodeException.isFull(),true);
    }

    @Test
    public void findItem() throws Exception {
        assertEquals(this.node.findItem(234),1);
        assertEquals(this.node.findItem(this.item2.getdData()),0);
        assertEquals(this.node.findItem(-120),-1);
        assertEquals(this.node.findItem(222),-1);
    }

    @Test(expected = NullPointerException.class)
    public void findItemException() {
        assertEquals(this.nodeException.findItem(123),-1);
    }

    @Test
    public void insertItem() throws Exception {
        assertEquals(this.node.isFull(),false);
        this.node.insertItem(this.item3);
        assertEquals(this.node.isFull(),true);
        assertEquals(this.node.findItem(this.item3.getdData()),0);
        assertEquals(this.node.getItem(0),this.item3);
    }

    @Test(expected = NullPointerException.class)
    public void insertItemException() {
        this.nodeException.insertItem(this.item3);
    }

    @Test
    public void removeItem() throws Exception {
        assertEquals(this.node.isFull(),false);
        this.node.insertItem(this.item3);
        assertEquals(this.node.isFull(),true);
        assertEquals(this.node.findItem(this.item2.getdData()),1);
        assertEquals(this.node.findItem(this.item.getdData()),2);
        this.node.removeItem();
        this.node.removeItem();
        assertEquals(this.node.isFull(),false);
        assertEquals(this.node.findItem(this.item.getdData()),-1);
        assertEquals(this.node.findItem(this.item2.getdData()),-1);
    }

    @Test(expected = NullPointerException.class)
    public void removeItemException() {
        this.nodeException.removeItem();
    }

    @Test
    public void displayNode() throws Exception {
        this.node.displayNode();
        this.node.insertItem(this.item3);
        this.node.displayNode();
        this.node.removeItem();
        this.node.removeItem();
        this.node.removeItem();
        this.node.displayNode();
    }

    @Test(expected = NullPointerException.class)
    public void displayNodeException() {
        this.nodeException.displayNode();
    }

    @Test
    public void getChildArray() throws Exception {
        Node[] nodeArray = this.node.getChildArray();
        assertEquals(nodeArray[0].isFull(),false);
        assertEquals(nodeArray[0].findItem(this.item2.getdData()),0);
        assertNull(this.node.getChildArray()[1]);
    }

    @Test(expected = NullPointerException.class)
    public void getChildArrayException() {
        assertNull(this.nodeException.getChildArray());
    }

    @Test
    public void getItemArray() throws Exception {
        DataItem[] items = this.node.getItemArray();
        assertEquals(items[1].getdData(),this.item.getdData());
        assertEquals(items[0].getdData(),this.item2.getdData());
        assertNull(items[2]);
    }

    @Test(expected = NullPointerException.class)
    public void getItemArrayException() {
        this.nodeException.getItemArray();
    }

}