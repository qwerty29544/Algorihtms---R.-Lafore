package RBTree;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RBNodeTest {

    RBNode node, nude, noded;

    @Before
    public void setUp() throws Exception {
        this.node = new RBNode(12,25);
        this.nude = new RBNode();
    }

    @After
    public void tearDown() throws Exception {
        this.nude = null;
        this.node = null;
    }

    @Test
    public void getIdData() throws Exception {
        assertEquals(this.node.getIdData(),12);
        assertEquals(this.nude.getIdData(),0);
        RBNode rbNode = this.node;
        int x = this.node.getIdData();
        assertEquals(rbNode.getIdData(),x);
        assertEquals(rbNode.getIdData(),12);
        assertEquals(x,12);
    }

    @Test
    public void display() throws Exception {
        this.node.display();
        this.node.setDeleted(true);
        this.node.display();
        this.node.setDeleted(false);
        this.node.display();
        this.node.setRed(false);
        this.node.display();
    }

    @Test(expected = NullPointerException.class)
    public void displayException() {
        this.noded.display();
    }

    @Test(expected = AssertionError.class)
    public void getIdDataException() {
        assertNull(this.node.getIdData());
    }

    @Test(expected = NullPointerException.class)
    public void getIdDataException2() {
        this.noded.getIdData();
    }


    @Test
    public void getdData() throws Exception {
        assertEquals(this.node.getdData(),25,0);
        assertEquals(this.nude.getdData(),0,0);
        RBNode rbNode = this.node;
        long x = this.node.getdData();
        assertEquals(rbNode.getdData(),x,0);
        assertEquals(rbNode.getdData(),25,0);
        assertEquals(x,25,0);
    }

    @Test(expected = NullPointerException.class)
    public void getdDataException() {
        this.noded.getdData();
    }

    @Test
    public void getLeftChild() throws Exception {
        RBNode rbNode = new RBNode(11,90);
        this.node.setLeftChild(rbNode);
        assertEquals(this.node.getLeftChild(),rbNode);
        assertEquals(this.node.getLeftChild().getIdData(),rbNode.getIdData());
        assertNull(this.nude.getLeftChild());
    }

    @Test(expected = NullPointerException.class)
    public void getLeftChildException() {
        this.noded.getLeftChild();
    }

    @Test
    public void getRightChild() throws Exception {
        RBNode rbNode = new RBNode(99,11);
        this.node.setRightChild(rbNode);
        assertEquals(this.node.getRightChild(),rbNode);
        assertEquals(this.node.getRightChild().getIdData(),rbNode.getIdData());
        assertNull(this.nude.getRightChild());
    }

    @Test(expected = NullPointerException.class)
    public void getRightChildException() {
        this.noded.getRightChild();
    }

    @Test
    public void isRed() throws Exception {
        assertEquals(this.node.isRed(),true);
        assertEquals(this.nude.isRed(),true);
        this.node.setRed(false);
        assertEquals(this.node.isRed(),false);
    }

    @Test(expected = NullPointerException.class)
    public void isRedExcpeption() {
        assertNull(this.noded.isRed());
    }

    @Test
    public void setIdData() throws Exception {
        assertEquals(this.node.getIdData(),12);
        this.node.setIdData(22);
        assertEquals(this.node.getIdData(),22);
        this.node.setIdData(-100);
        assertEquals(this.node.getIdData(),-100);
        assertEquals(this.nude.getIdData(),0);
        this.nude.setIdData(90);
        assertEquals(this.nude.getIdData(),90);
    }

    @Test(expected = NullPointerException.class)
    public void setIdDataException() {
        this.noded.setIdData(123);
        assertEquals(this.noded.getIdData(),123);
    }

    @Test
    public void setdData() throws Exception {
        assertEquals(this.node.getdData(),25,0);
        assertEquals(this.nude.getdData(),0,0);
        this.node.setdData(254);
        assertEquals(this.node.getdData(),254,0);
        this.nude.setdData(-908);
        assertEquals(this.nude.getdData(),-908);
    }

    @Test(expected = NullPointerException.class)
    public void setdDataException() {
        this.noded.setdData(90871);
    }

    @Test
    public void setLeftChild() throws Exception {
        RBNode rbNode = new RBNode(912,9832);
        assertNull(this.node.getLeftChild());
        this.node.setLeftChild(rbNode);
        assertEquals(this.node.getLeftChild(),rbNode);
        assertNotNull(this.node.getLeftChild());
    }

    @Test(expected = NullPointerException.class)
    public void setLeftChildException() {
        RBNode rbNode = new RBNode(912,9832);
        this.noded.setLeftChild(rbNode);
    }

    @Test
    public void setRightChild() throws Exception {
        RBNode rbNode = new RBNode(912,9832);
        assertNull(this.node.getRightChild());
        this.node.setRightChild(rbNode);
        assertEquals(this.node.getRightChild(),rbNode);
        assertNotNull(this.node.getRightChild());
    }

    @Test(expected = NullPointerException.class)
    public void setRightChildException() {
        RBNode rbNode = new RBNode(912,9832);
        this.noded.setRightChild(rbNode);
    }

    @Test
    public void setRed() throws Exception {
        assertEquals(this.node.isRed(),true);
        this.node.setRed(false);
        assertEquals(this.node.isRed(),false);
        this.node.setRed(true);
        assertEquals(this.node.isRed(),true);
    }

    @Test(expected = NullPointerException.class)
    public void setRedException() {
        this.noded.setRed(true);
    }

    @Test
    public void getDeleted() throws Exception {
        assertEquals(this.node.getDeleted(),false);
        assertEquals(this.nude.getDeleted(),false);
        this.node.setDeleted(true);
        assertEquals(this.node.getDeleted(),true);
    }

    @Test(expected = NullPointerException.class)
    public void getDeletedException() {
        this.noded.getDeleted();
    }

    @Test
    public void setDeleted() throws Exception {
        assertEquals(this.node.getDeleted(),false);
        assertEquals(this.nude.getDeleted(),false);
        this.node.setDeleted(true);
        assertEquals(this.node.getDeleted(),true);
    }

    @Test(expected = NullPointerException.class)
    public void setDeletedException() {
        this.noded.setDeleted(true);
    }

}