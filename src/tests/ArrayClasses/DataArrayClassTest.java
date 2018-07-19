package ArrayClasses;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DataArrayClassTest {

    DataClass dataClass;
    DataClass[] dataClassTest;
    DataArrayClass dataArrayClass, dataArrayClassException;

    @Before
    public void setUp() throws Exception {
        this.dataClass = new DataClass("Legend","Max",12);
        this.dataArrayClass = new DataArrayClass(5);
        this.dataArrayClass.insert("Legend","Max",12);
        this.dataArrayClass.insert("Latina","Lingva",56);
    }

    @After
    public void tearDown() throws Exception {
        this.dataArrayClass = null;
        this.dataClass = null;
    }

    @Test(expected = NegativeArraySizeException.class)
    public void constructorException() {
        this.dataArrayClassException = new DataArrayClass(-19);
    }

    @Test
    public void find() throws Exception {
        assertNotSame(this.dataArrayClass.find("Latina"),this.dataClass);
        assertNotNull(this.dataArrayClass.find("Legend"));
        assertNull(this.dataArrayClass.find("d"));
    }

    @Test
    public void insert() throws Exception {
        this.dataArrayClass.insert("Legend","Genry",965);
        assertEquals(this.dataArrayClass.getnElems(),3);
        this.dataArrayClass.insert("Chase","Cory",17);
        assertEquals(this.dataArrayClass.getnElems(),4);
        assertNotNull(this.dataArrayClass.find("Chase"));
        assertNotNull(this.dataArrayClass.find("Legend"));
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void insertException(){
        for (int i=14; i<=19; i++){
            this.dataArrayClass.insert("Legend","Max",i);
        }
    }

    @Test
    public void delete() throws Exception {
        assertNotNull(this.dataArrayClass.find("Latina"));
        this.dataArrayClass.delete("Latina");
        assertEquals(this.dataArrayClass.getnElems(),1);
        assertNull(this.dataArrayClass.find("Latina"));
    }

    @Test
    public void displayA() throws Exception {
        this.dataArrayClass.displayA();
        this.dataArrayClass.insert("Ford","Genry",87);
        this.dataArrayClass.displayA();
    }

    @Test(expected = NullPointerException.class)
    public void displayException(){
        this.dataArrayClass = null;
        this.dataArrayClass.displayA();
    }

    @Test
    public void getClassArray() throws Exception {
        this.dataClassTest = this.dataArrayClass.getClassArray();
        assertNotNull(this.dataClassTest[1]);
        assertNotNull(this.dataClassTest[0]);
        assertNull(this.dataClassTest[2]);
    }

    @Test
    public void getnElems() throws Exception {
        assertEquals(this.dataArrayClass.getnElems(),2);
    }

    @Test(expected = NullPointerException.class)
    public void getArrayException() {
        this.dataArrayClass = null;
        this.dataArrayClass.getClassArray();
    }

    @Test(expected = NullPointerException.class)
    public void getnElemsException() {
        this.dataArrayClass = null;
        this.dataArrayClass.getnElems();
    }



}