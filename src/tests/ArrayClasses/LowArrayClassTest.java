package ArrayClasses;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.*;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNull;

public class LowArrayClassTest {

    LowArrayClass lowArray, lowArrayException;

    @Before
    public void setUp() throws Exception {
        this.lowArray = new LowArrayClass(7);
        this.lowArray.setElem(4,99);
        this.lowArray.setElem(0,-101);

    }

    @After
    public void tearDown() throws Exception {
        this.lowArrayException = null;
        this.lowArray = null;
    }

    @Test
    public void setElem() throws Exception {
        this.lowArray.setElem(6,55);
        assertEquals(this.lowArray.getArray()[6],55);

    }

    @Test
    public void getElem() throws Exception {
        assertEquals(this.lowArray.getElem(4),99);
        assertEquals(this.lowArray.getElem(0),-101);
    }

    @Test
    public void getArray() throws Exception {
        assertEquals(this.lowArray.getArray()[4], 99);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void setElemWithException()
    {
        this.lowArray.setElem(33,1023);
    }

    @Test(expected = NegativeArraySizeException.class)
    public void exceptionPointer()
    {
        this.lowArrayException = new LowArrayClass(-19);
    }

    @Ignore("Message for ignored test")
    @Test
    public void ignoredTest() {
        System.out.println("will not print it");
    }

    @Test(expected = NullPointerException.class)
    public void getArrayException() {
        this.lowArray = null;
        assertNull(this.lowArray.getArray());
    }
}