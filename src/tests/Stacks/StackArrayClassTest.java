package Stacks;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StackArrayClassTest {

    StackArrayClass stackArrayClass, stack, stackArray, emptyStack, fullStack;

    @Before
    public void setUp() throws Exception {
        this.stack = new StackArrayClass(5);
        this.stack.push(3);
        this.stack.push(19);
        this.stack.push(-123);
        this.emptyStack = new StackArrayClass(19);
        this.fullStack = new StackArrayClass(2);
        this.fullStack.push(12);
    }

    @Test(expected = NegativeArraySizeException.class)
    public void constructorException(){
        this.stackArray = new StackArrayClass(-12);
    }

    @Test
    public void constructor() {
        this.stackArrayClass = new StackArrayClass(0);
    }

    @After
    public void tearDown() throws Exception {
        this.stack = null;
        this.emptyStack = null;
        this.fullStack = null;
    }

    @Test
    public void push() throws Exception {
        assertEquals(this.stack.peek(),-123);
        this.stack.push(29);
        assertEquals(this.stack.peek(),29);
        assertEquals(this.stack.isFull(),false);
        assertEquals(this.stack.isEmpty(),false);
    }

    @Test
    public void pop() throws Exception {
        assertEquals(this.stack.getTop(),2);
        assertEquals(this.stack.isEmpty(),false);
        assertEquals(this.stack.isFull(),false);
        assertEquals(this.stack.pop(),-123);
        assertEquals(this.stack.isFull(),false);
        assertEquals(this.stack.isEmpty(),false);
        assertEquals(this.stack.getTop(),1);
        assertEquals(this.stack.peek(),19);
    }

    @Test
    public void peek() throws Exception {
        assertEquals(this.stack.peek(),-123);
        assertEquals(this.stack.pop(),-123);
        assertEquals(this.stack.peek(),19);
        this.stack.pop();
        assertEquals(this.stack.peek(),3);
    }

    @Test
    public void isEmpty() throws Exception {
        assertEquals(this.emptyStack.isEmpty(),true);
        this.emptyStack.push(2);
        assertEquals(this.emptyStack.isEmpty(),false);
        this.emptyStack.pop();
        assertEquals(this.emptyStack.isEmpty(),true);
    }

    @Test
    public void isFull() throws Exception {
        assertEquals(this.fullStack.isFull(),false);
        this.fullStack.push(2);
        assertEquals(this.fullStack.isFull(),true);
    }

    @Test
    public void getMaxSize() throws Exception {
        assertEquals(this.emptyStack.getMaxSize(),19);
        assertEquals(this.fullStack.getMaxSize(),2);
        assertEquals(this.stack.getMaxSize(),5);
    }

    @Test
    public void getStackArray() throws Exception {
        assertNotNull(this.stack.getStackArray());
        assertEquals(this.emptyStack.getStackArray()[2],0);
        assertEquals(this.emptyStack.getStackArray()[0],0);
        assertEquals(this.stack.getStackArray()[2],-123);
    }

    @Test
    public void getTop() throws Exception {
        assertEquals(this.stack.getTop(),2);
        this.stack.pop();
        assertEquals(this.stack.getTop(),1);
        this.stack.push(5);
        this.stack.push(8);
        assertEquals(this.stack.getTop(),3);
    }

}