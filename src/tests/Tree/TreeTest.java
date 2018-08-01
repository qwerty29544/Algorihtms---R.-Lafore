package Tree;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

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


    }

    @Test
    public void insert() throws Exception {
    }

    @Test
    public void delete() throws Exception {
    }

    @Test
    public void traverse() throws Exception {
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

    @Test
    public void getRoot() throws Exception {
    }

}