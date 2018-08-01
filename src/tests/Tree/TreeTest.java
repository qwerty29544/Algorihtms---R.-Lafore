package Tree;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.opentest4j.TestAbortedException;

import static org.junit.Assert.*;

public class TreeTest {

    Node node, nude;
    Tree treeSome, tree, treeGrab, treeException, getTreeException2;

    @Before
    public void setUp() throws Exception {
        this.node = new Node();
        this.node.iData = 22;
        this.node.dData = 10;

        this.tree = new Tree();
        this.tree.insert(102,10);
        this.tree.insert(44,9);
        this.tree.insert(100,10);
        this.tree.insert(23,54);
        this.tree.insert(10,-11);
        this.tree.insert(102,-10);
        this.tree.insert(223,75);
        this.tree.insert(210,90);
        this.tree.insert(150,293);
        this.tree.insert(98,0);
        this.tree.insert(224,101);
        this.tree.insert(this.node);

        this.treeSome = new Tree(this.node);

        this.treeGrab = new Tree();

        this.treeException = new Tree(this.nude);
    }


    @After
    public void tearDown() throws Exception {
        this.tree = null;
        this.treeGrab = null;
        this.treeSome = null;
        this.node = null;
    }

    @Test
    public void find() throws Exception {
        assertEquals(this.tree.find(44).getdData(),9,0);
        assertEquals(this.tree.find(102).getdData(),10,0);
        assertNull(this.tree.find(152));

        assertEquals(this.tree.find(22).getdData(),10,0);
        assertEquals(this.tree.find(22),this.node);

        assertNull(this.tree.find(186));
        this.tree.insert(186,77);
        assertEquals(this.tree.find(186).getdData(),77,0);

        assertEquals(this.treeSome.find(22),this.node);
        assertEquals(this.treeSome.find(22).getdData(),10,0);
        assertNull(this.treeSome.find(90));
        this.treeSome.insert(23,90);
        assertNull(this.treeSome.find(90));
        assertEquals(this.treeSome.find(23).getdData(),90,0);
        this.treeSome.insert(90,23);
        assertEquals(this.treeSome.find(90).getdData(),23,0);
    }

    @Test(expected = NullPointerException.class)
    public void findException4() {
        assertNull(this.treeGrab.find((int)(java.lang.Math.random()*99)));
    }

    @Test(expected = NullPointerException.class)
    public void findException5() {
        assertNotNull(this.treeGrab.find(22));
    }

    @Test(expected = NullPointerException.class)
    public void findException6() {
        assertNull(this.treeException.find(22));
        assertNull(this.treeException.find(103));
    }

    @Test(expected = NullPointerException.class)
    public void findException3() {
        assertEquals(this.tree.find(152).getdData(),0,0);
    }

    @Test(expected = AssertionError.class)
    public void findException() {
        assertEquals(this.tree.find(102).getdData(),-10,0);
    }

    @Test(expected = NullPointerException.class)
    public void findException2() {
        this.getTreeException2.find(22);
    }

    @Test
    public void insert() throws Exception {
        assertNull(this.tree.find(185));
        this.tree.insert(185,-103);
        assertEquals(this.tree.find(185).getdData(),-103,0);
        assertNull(this.tree.find(109));
        this.tree.insert(109,109);
        assertEquals(this.tree.find(109).getdData(),109,0);
        this.tree.insert(109,108);
        assertNotSame(this.tree.find(109).getdData(),108);

        assertEquals(this.treeSome.find(22),this.node);
        assertEquals(this.treeSome.find(22).getdData(),10,0);
        assertNull(this.treeSome.find(90));
        this.treeSome.insert(23,90);
        assertNull(this.treeSome.find(90));
        assertEquals(this.treeSome.find(23).getdData(),90,0);
        this.treeSome.insert(90,23);
        assertEquals(this.treeSome.find(90).getdData(),23,0);

        this.treeException.insert(22,22);
    }

    @Test (expected = NullPointerException.class)
    public void insertException() throws Exception {
        this.getTreeException2.insert(22,90);
    }

    @Test
    public void insert2ExcludedTest() throws Exception {
        this.treeException.insert(this.nude);
    }

    @Test
    public void delete() throws Exception {
        this.tree.displayTree();
        assertEquals(this.tree.find(23).getdData(), 54,0);
        assertEquals(this.tree.delete(23),true);
        assertNull(this.tree.find(23));
        this.tree.displayTree();

        assertEquals(this.tree.find(102).getdData(), 10, 0);
        assertEquals(this.tree.delete(102),true);
        assertEquals(this.tree.find(102).getdData(),-10,0);
        this.tree.displayTree();

        assertEquals(this.tree.find(44).getdData(),9,0);
        assertEquals(this.tree.delete(44),true);
        assertEquals(this.tree.delete(44),false);
        this.tree.displayTree();

        assertEquals(this.tree.find(102).getdData(), -10, 0);
        assertEquals(this.tree.delete(102),true);
        assertNull(this.tree.find(102));
        this.tree.displayTree();

        assertEquals(this.tree.find(223).getdData(),75,0);
        assertEquals(this.tree.delete(223),true);
        assertEquals(this.tree.delete(223),false);
        this.tree.displayTree();


        assertNull(this.tree.find(188));
        assertEquals(this.tree.delete(188),false);

    }

    @Test(expected = NullPointerException.class)
    public void deleteException() {
        assertEquals(this.treeGrab.delete(22),false);
    }

    @Test
    public void traverse() throws Exception {
        this.tree.traverse(1);
        this.tree.traverse(2);
        this.tree.traverse(3);
        this.treeSome.traverse(1);
        this.treeSome.traverse(2);
        this.treeSome.traverse(3);
        this.treeGrab.traverse(1);
        this.treeGrab.traverse(2);
        this.treeGrab.traverse(3);
    }

    @Test(expected = NullPointerException.class)
    public void traverseException() {
        this.getTreeException2.traverse(2);
    }

    @Test
    public void displayTree() throws Exception {
        this.tree.displayTree();
        this.tree.insert(5,5);
        this.tree.insert(7,9);
        this.tree.insert(6,109);
        this.tree.insert(24,89);
        this.tree.insert(25,66);
        this.tree.insert(196,19);
        this.tree.displayTree();
        this.tree.insert(8,90);
        this.tree.insert(9,91);
        this.tree.insert(8,93);
        this.tree.displayTree();
    }

    @Test(expected = NullPointerException.class)
    public void displayTreeException() {
        this.getTreeException2.displayTree();
    }

}