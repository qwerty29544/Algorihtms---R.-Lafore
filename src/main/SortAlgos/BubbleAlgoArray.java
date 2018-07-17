package SortAlgos;

public class BubbleAlgoArray {

    private long[] array; // Link to array array
    private int nElems; // Number of Data Elements

    public BubbleAlgoArray(int max) throws IllegalArgumentException, NegativeArraySizeException // Constructor
    {
        array = new long[max]; // Creating an array
        nElems = 0; // No items yet
    }

    public void insert(long value) throws IllegalArgumentException, ArrayIndexOutOfBoundsException, ArrayStoreException // Inserting an element into an array
    {
        array[nElems] = value; // The actual insertion
        nElems++; // Increase in size
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

    private void swap(int one, int two) throws IllegalArgumentException, ArrayIndexOutOfBoundsException // Swap method itself
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
