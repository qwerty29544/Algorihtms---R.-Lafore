package SortAlgos;

public class InsertAlgoArray {
    private long[] array; // Reference to array array
    private int nElems; // Number of data items

    public InsertAlgoArray(int max) throws IllegalArgumentException, NegativeArraySizeException // Constructor
    {
        array = new long[max]; // Creating an array
        nElems = 0; // No items yet
    }

    public void insert(long value) throws IllegalArgumentException, ArrayStoreException, ArrayIndexOutOfBoundsException // Insert an element into an array
    {
        array[nElems] = value; // The actual insertion
        nElems++; // Increase in size
    }

    public void display() // Output the contents of the array
    {
        for(int j=0; j<nElems; j++) // For each element
            System.out.print(array[j] + " "); // Output
        System.out.println("");
    }

    public void insertionSort() // Sort method
    {
        int in, out;
        for(out=1; out<nElems; out++) // out - separating marker
        {
            long temp = array[out]; // Copy starred item
            in = out; // Start moving with out
            while(in>0 && array[in-1] >= temp) // Until the smaller element is found
            {
                array[in] = array[in-1]; // Shift the item to the right
                --in; // Move one position to the left
            }
            array[in] = temp; // Insert starred item
        }
    }

    public long[] getArray() {
        return array;
    } // Getter

    public int getnElems() {
        return nElems;
    } // Getter
}
