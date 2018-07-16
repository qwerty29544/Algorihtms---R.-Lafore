package SortAlgos;

public class InsertAlgoArray {
    private long[] array; // Reference to array array
    private int nElems; // Number of data items

    public InsertAlgoArray(int max) throws IllegalArgumentException // Constructor
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

    public void insert(long value) throws IllegalArgumentException // Insert an element into an array
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
