package Algos;

public class SelectionAlgo {
    private long[] a; // Link to array a
    private int nElems; // Number of Data Elements

    public SelectionAlgo(int max) throws IllegalArgumentException // Constructor
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
            System.out.print(a[j] + " "); // Actual display
        System.out.println("");
    }

    public void selectionSort()
    {
        int out, in, min;
        for(out=0; out<nElems-1; out++) // External cycle
        {
            min = out; // Минимум
            for(in=out+1; in<nElems; in++) // Internal cycle
                    if(a[in] < a[min] ) // If the value of min is greater,
                    min = in; // hence, a new minimum
            swap(out, min); // swap them
        }
    }

    private void swap(int one, int two) throws IllegalArgumentException
    {
        long temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }
}
