package SortAlgos;

public class BubbleAlgoArray {

    private long[] array; // Link to array array
    private int nElems; // Number of Data Elements

    public BubbleAlgoArray(int max) throws IllegalArgumentException // Constructor
    {
        try {
            array = new long[max]; // Creating an array
            nElems = 0; // No items yet
        }
        catch (NegativeArraySizeException a)
        {
            System.out.print("Incorrect size, try to record an positive number");
        }
    }

    public void insert(long value) throws IllegalArgumentException // Inserting an element into an array
    {
        try {
            array[nElems] = value; // The actual insertion
            nElems++; // Increase in size
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.print("Array index out of bounds, please try to delete some recordings");
        }
        catch (ArrayStoreException e1){
            System.out.print("The entry you want to register has the wrong type");
        }
    }

    public void display() // Outputting the contents of an array
    {
        for(int j=0; j<nElems; j++) // For each item
            System.out.print(array[j] + " "); // actual display
        System.out.println("");
    }

    public void bubbleSort() // Bubble sort method with array of elements
    {
        int out, in;
        for(out=nElems-1; out>1; out--) // External cycle (reverse)
            for(in=0; in<out; in++) // Internal cycle (direct)
                if( array[in] > array[in+1] )
                    swap(in, in+1); // Swap
    }

    private void swap(int one, int two) throws IllegalArgumentException // Swap method itself
    {
        long temp = array[one];
        array[one] = array[two];
        array[two] = temp;
    }

    public long[] getArray() {
        return array;
    } // Getter of Array

    public int getnElems() {
        return nElems;
    } // Getter of size
}
