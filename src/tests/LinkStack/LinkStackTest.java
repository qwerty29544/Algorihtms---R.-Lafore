package LinkStack;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LinkStackTest {

    Link link, linker;
    LinkList linkList, linkedList;
    LinkStack linkStack, linkedStack;

    @Before
    public void setUp() throws Exception {
        this.linkStack = new LinkStack();
        this.linkStack.push(34);
        this.linkStack.push(123);
        this.linkStack.push(954);
        this.linkedStack = new LinkStack();
        this.linkedStack.push(2);

    }

    @After
    public void tearDown() throws Exception {
        this.linkedStack = null;
        this.linkStack = null;
    }

    @Test
    public void push() throws Exception {
        this.linkList = this.linkStack.getTheList();
        this.link = this.linkList.getFirst();
        assertEquals(this.link.getdData(),954);
        this.linkStack.push(22);
        this.linkedList = this.linkStack.getTheList();
        this.linker = this.linkedList.getFirst();
        assertEquals(this.linker.getdData(),22);
        assertNotSame(this.link.getdData(),this.linker.getdData());
    }

    @Test
    public void pop() throws Exception {
        this.linkList = this.linkStack.getTheList();
        this.link = this.linkList.getFirst();
        assertEquals(this.link.getdData(),954);
        assertEquals(this.linkStack.pop(),954);
        this.linkedList = this.linkStack.getTheList();
        this.linker = this.linkedList.getFirst();
        assertEquals(this.linker.getdData(),123);
        assertEquals(this.linkStack.pop(),123);
    }

    @Test
    public void isEmpty() throws Exception {
        assertEquals(this.linkStack.isEmpty(),false);
        assertEquals(this.linkedStack.isEmpty(),false);
        this.linkedStack.pop();
        assertEquals(this.linkedStack.isEmpty(),true);
    }

    @Test
    public void displayStack() throws Exception {
        this.linkStack.displayStack();
        this.linkStack.push(2222);
        this.linkStack.push(-19);
        System.out.println("After pushing 2222 and -19");
        this.linkStack.displayStack();
    }

    @Test
    public void getTheList() throws Exception {
        this.linkList = this.linkStack.getTheList();
        assertNotNull(this.linkList);
        this.link = this.linkList.getFirst();
        this.linkList.displayList();
    }

}