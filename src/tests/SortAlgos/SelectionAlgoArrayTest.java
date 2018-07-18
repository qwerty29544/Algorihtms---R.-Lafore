package SortAlgos;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SelectionAlgoArrayTest {

    SelectionAlgoArray selArray, selArrayException;

    @Before
    public void setUp() throws Exception {
        this.selArray = new SelectionAlgoArray(6);
        this.selArray.insert(18);
        this.selArray.insert(-14);
        this.selArray.insert(12);
    }

    @Test(expected = NegativeArraySizeException.class)
    public void constructorException() {
        this.selArrayException = new SelectionAlgoArray(-12);
    }

    @After
    public void tearDown() throws Exception {
        this.selArray = null;
    }

    @Test
    public void insert() throws Exception {
        assertEquals(this.selArray.getArray()[3],0);
        this.selArray.insert(19);
        assertEquals(this.selArray.getArray()[3],19);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void insertException() {
        for(int i = 29; i <= 38 ; i++){
            this.selArray.insert(i);
        }
    }

    @Test
    public void display() throws Exception {
        this.selArray.display();
        this.selArray.insert(21);
        System.out.println("After insertion");
        this.selArray.display();
        this.selArray.selectionSort();
        System.out.println("After Sort");
        this.selArray.display();
    }

    @Test
    public void selectionSort() throws Exception {
        assertEquals(this.selArray.getArray()[0],18);
        assertEquals(this.selArray.getArray()[1],-14);
        assertEquals(this.selArray.getArray()[2],12);
        this.selArray.selectionSort();
        assertEquals(this.selArray.getArray()[0],-14);
        assertEquals(this.selArray.getArray()[1],12);
        assertEquals(this.selArray.getArray()[2],18);

    }

    @Test
    public void getArray() throws Exception {
        assertEquals(this.selArray.getArray()[0],18);
        assertNotNull(this.selArray.getArray());
    }

    @Test
    public void getnElems() throws Exception {
        assertEquals(this.selArray.getnElems(),3);
        this.selArray.insert(2);
        assertEquals(this.selArray.getnElems(),4);
    }

}