package ArrayClasses;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class HighArrayClassTest {

    HighArrayClass highArray, highArrayException, highArrayClassException;

    @Before
    public void setUp() throws Exception {
        this.highArray = new HighArrayClass(7);
        this.highArrayException = new HighArrayClass(2);
        this.highArray.insert(20);
        this.highArray.insert(1024);
        this.highArray.insert(-666);
    }

    @Test(expected = NegativeArraySizeException.class)
    public void exceptionPointer()
    {
        this.highArrayClassException = new HighArrayClass(-100);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void insertException()
    {
        this.highArrayException.insert(20);
        this.highArrayException.insert(-1000);
        this.highArrayException.insert(7);
    }

    @After
    public void tearDown() throws Exception {
        this.highArrayException = null;
        this.highArray = null;
        this.highArrayClassException = null;
    }

    @Test
    public void find() throws Exception {
        assertEquals(this.highArray.find(-666),true);
    }

    @Test
    public void findNothing() throws Exception {
        assertEquals(this.highArray.find(1),false);
    }

    @Test
    public void insert() throws Exception {
        this.highArray.insert(765);
        assertEquals(this.highArray.find(765),true);
    }

    @Test
    public void delete() throws Exception {
        this.highArray.delete(20);
        assertEquals(this.highArray.find(20),false);
        this.highArray.delete(20);
    }

    @Test
    public void display() throws Exception {
        this.highArray.display();
    }

    @Test
    public void getArray() throws Exception {
        assertEquals(this.highArray.getArray()[1],1024);
    }

    @Test
    public void getnElems() throws Exception {
        assertEquals(this.highArray.getnElems(),3);
    }

    @Ignore("Message for ignored test")
    @Test
    public void ignoredTest() {
        System.out.println("will not print it");
    }

}