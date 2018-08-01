package Tree;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NodeTest {

    Node node, nude;

    @Before
    public void setUp() throws Exception {
        this.node = new Node();
        this.node.dData = 22;
        this.node.iData = 10;
    }

    @After
    public void tearDown() throws Exception {
        this.node = null;
    }

    @Test
    public void displayNode() throws Exception {
        this.node.displayNode();
    }

    @Test(expected = NullPointerException.class)
    public void displayNodeException() {
        this.nude.displayNode();
    }

    @Test
    public void getdData() throws Exception {
        assertEquals(this.node.getdData(),22, 0);
        this.nude = this.node;
        assertEquals(this.nude.getdData(), this.node.getdData(),0);
        double d = this.node.getdData();
        assertEquals(this.node.getdData(), d,0);
        assertEquals(d,22,0);
    }

    @Test(expected = NullPointerException.class)
    public void getdDataException() {
        this.nude.getdData();
    }

    @Test
    public void getiData() throws Exception {
        assertEquals(this.node.getiData(),10);
        this.nude = this.node;
        assertEquals(this.node.getiData(),this.nude.getiData());
        assertEquals(this.nude.getiData(),10);
        int x = this.node.getiData();
        assertEquals(this.node.getiData(),x);
        assertEquals(x,10);
    }

    @Test(expected = NullPointerException.class)
    public void geiDataException() {
        this.nude.getiData();
    }

    @Test
    public void getLeftChild() throws Exception {
        this.nude = this.node;
        assertEquals(this.node.getLeftChild(),this.nude.getLeftChild());
        assertNull(this.node.getLeftChild());
        assertNull(this.nude.getLeftChild());
    }

    @Test(expected = NullPointerException.class)
    public void getLeftChildException() {
        this.nude.getLeftChild();
    }

    @Test
    public void getRightChild() throws Exception {
        this.nude = this.node;
        assertEquals(this.node.getRightChild(),this.nude.getRightChild());
        assertNull(this.node.getRightChild());
        assertNull(this.nude.getRightChild());
    }

    @Test(expected = NullPointerException.class)
    public void getRightChildException() {
        this.nude.getRightChild();
    }

}