package Algos;

public class BubbleAlgo {
    private long[] a; // Link to array a
    private int nElems; // Number of Data Elements

    public BubbleAlgo(int max) throws IllegalArgumentException // Constructor
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

    public void insert(long value) throws IllegalArgumentException // Inserting an element into an array
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

    public void display() // Outputting the contents of an array
    {
        for(int j=0; j<nElems; j++) // For each item
            System.out.print(a[j] + " "); // actual display
        System.out.println("");
    }

    public void bubbleSort()
    {
        int out, in;
        for(out=nElems-1; out>1; out--) // External cycle (reverse)
            for(in=0; in<out; in++) // Internal cycle (direct)
                if( a[in] > a[in+1] )
                    swap(in, in+1); // Swap
    }

    private void swap(int one, int two) throws IllegalArgumentException
    {
        long temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }
}
