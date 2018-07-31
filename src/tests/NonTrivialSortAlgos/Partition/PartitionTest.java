package NonTrivialSortAlgos.Partition;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PartitionTest {

    Partition partition, partitionArray, partitionException;

    @Before
    public void setUp() throws Exception {
        this.partition = new Partition(20);
        this.partitionArray = new Partition(10);
        this.partitionArray.insert(222);
        this.partitionArray.insert(-11);
        this.partitionArray.insert(0);
        this.partitionArray.insert(20);
        this.partitionArray.insert(105);
        this.partitionArray.insert(-102);
        this.partitionArray.insert(2);
        this.partition.insert(2);
    }

    @Test(expected = NegativeArraySizeException.class)
    public void setUpException() {
        this.partitionException = new Partition(-10);
    }

    @After
    public void tearDown() throws Exception {
        this.partition = null;
        this.partitionArray = null;
    }

    @Test
    public void insert() throws Exception {
        assertEquals(this.partitionArray.getTheArray()[0],222);
        assertEquals(this.partitionArray.getTheArray()[6],2);
        assertEquals(this.partitionArray.getTheArray()[7],0);
        this.partitionArray.insert(223);
        assertEquals(this.partitionArray.getTheArray()[7],223);
        this.partitionArray.insert(-103);
        assertEquals(this.partitionArray.getTheArray()[8],-103);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void insertException() {
        for (long i = 0; i<155; i++){
            this.partition.insert(i);
        }
    }

    @Test(expected = NullPointerException.class)
    public void insertExceptionNull() {
        this.partitionException.insert(22);
    }

    @Test
    public void size() throws Exception {
        assertEquals(this.partitionArray.size(),7);
        assertEquals(this.partition.size(),1);
        this.partition.insert(22);
        this.partition.insert(222);
        assertEquals(this.partition.size(),3);
        assertEquals(this.partitionArray.size(),7);
        this.partitionArray.insert(26);
        assertEquals(this.partitionArray.size(),8);
    }

    @Test(expected = NullPointerException.class)
    public void sizeException() {
        this.partitionException.size();
    }

    @Test
    public void display() throws Exception {
        this.partitionArray.display();
        this.partitionArray.insert(225);
        this.partitionArray.insert(-20);
        this.partitionArray.display();
        int x = this.partitionArray.partitionIt(0,this.partitionArray.size(),4);
        this.partitionArray.display();
        System.out.println(x);
    }

    @Test(expected = NullPointerException.class)
    public void displayException() {
        this.partitionException.display();
    }

    @Test
    public void partitionIt() throws Exception {
        int x = this.partitionArray.partitionIt(0,this.partitionArray.size(),4);
        assertEquals(x,5);
        System.out.println(x);
        int y = this.partitionArray.partitionIt(0,this.partitionArray.size(),103);
        assertEquals(y,6);
        System.out.println(y);
        int z = this.partitionArray.partitionIt(3,this.partitionArray.size()-1,0);
        assertEquals(z,4);
        System.out.println(z);
        int single = this.partition.partitionIt(0,this.partition.size(),12);
        assertEquals(single,1);
        int single4 = this.partition.partitionIt(0,this.partition.size(),0);
        assertEquals(single4,1);
        int yz = this.partitionArray.partitionIt(0,this.partitionArray.size(),22222);
        assertEquals(yz,7);
        int yzt = this.partitionArray.partitionIt(0,this.partitionArray.size(),-22222);
        assertEquals(yzt,0);
    }

    @Test(expected = NullPointerException.class)
    public void partitionItException() {
        this.partitionException.partitionIt(0, this.partitionException.size(),9999);
    }

    @Test
    public void swap() throws Exception {
        assertEquals(this.partitionArray.getTheArray()[0],222);
        assertEquals(this.partitionArray.getTheArray()[4],105);
        this.partitionArray.swap(0,4);
        assertEquals(this.partitionArray.getTheArray()[0],105);
        assertEquals(this.partitionArray.getTheArray()[4],222);
        assertEquals(this.partitionArray.getTheArray()[1],-11);
        assertEquals(this.partitionArray.getTheArray()[5],-102);
        this.partitionArray.swap(1,5);
        assertEquals(this.partitionArray.getTheArray()[1],-102);
        assertEquals(this.partitionArray.getTheArray()[5],-11);
        this.partitionArray.swap(0,0);
        this.partition.swap(0,0);
    }

    @Test(expected = NullPointerException.class)
    public void swapException() {
        this.partitionException.swap(2,6);
    }

    @Test
    public void getTheArray() throws Exception {
        assertEquals(this.partitionArray.getTheArray()[1],-11);
        assertEquals(this.partitionArray.getTheArray()[5],-102);
    }

    @Test(expected = NullPointerException.class)
    public void gettheArrayException() {
        this.partitionException.getTheArray();
    }

}