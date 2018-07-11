package Algos;

public class InsertAlgo {
    private long[] a; // Reference to array a
    private int nElems; // Number of data items

    public InsertAlgo(int max) throws IllegalArgumentException // Constructor
    {
        try {
            a = new long[max]; // Creating an array
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
            a[nElems] = value; // The actual insertion
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
            System.out.print(a[j] + " "); // Output
        System.out.println("");
    }

    public void insertionSort()
    {
        int in, out;
        for(out=1; out<nElems; out++) // out - separating marker
        {
            long temp = a[out]; // Copy starred item
            in = out; // Start moving with out
            while(in>0 && a[in-1] >= temp) // Until the smaller element is found
            {
                a[in] = a[in-1]; // Shift the item to the right
                --in; // Move one position to the left
            }
            a[in] = temp; // Insert starred item
        }
    }
}
