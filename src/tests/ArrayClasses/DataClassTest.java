package ArrayClasses;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class DataClassTest {

    DataClass dataClass, dataClassException;

    @BeforeEach
    void setUp() {
        this.dataClass = new DataClass("Yurchenkov","Ivan", 19);
        this.dataClassException = new DataClass("Solaire","Uranus", -119);
    }

    @AfterEach
    void tearDown() {
        this.dataClass = null;
        this.dataClassException = null;
    }


    @Test
    void displayPerson() {
        this.dataClassException.displayPerson();
        this.dataClass.displayPerson();
    }

    @Test
    void getLast() {
        assertEquals(this.dataClass.getLast(),"Yurchenkov");
        assertNotEquals(this.dataClassException.getLast(),"Sol");
    }

    @Test
    void getFirstName() {
        assertEquals(this.dataClass.getFirstName(),"Ivan");
        assertNotEquals(this.dataClassException.getFirstName(),"UR");
    }

    @Test
    void getAge() {
        assertEquals(this.dataClass.getAge(),19);
        assertNotEquals(this.dataClassException.getAge(),-119);
        assertEquals(this.dataClassException.getAge(),119);
    }

}