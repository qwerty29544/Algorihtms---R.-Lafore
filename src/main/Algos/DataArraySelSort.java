package Algos;

public class DataArraySelSort {
    private DataClass[] a; // Reference to array a
    private int nElems; // Number of data items

    public DataArraySelSort(int max) throws IllegalArgumentException // Constructor
    {
        try {
            a = new DataClass[max]; // Create an array
            nElems = 0; // No items yet
        }
        catch (NegativeArraySizeException a1)
        {
            System.out.print("Incorrect size, try to record an positive number");
        }
    }

    // Enable writing to an array
    public void insert(String last, String first, int age) throws IllegalArgumentException
    {
        try {
            a[nElems] = new DataClass(last, first, age);
            nElems++; // Increase the size
        }
        catch (ArrayIndexOutOfBoundsException e3)
        {
            System.out.print("Array index out of bounds, please try to delete some recordings");
        }
        catch (ArrayStoreException e4)
        {
            System.out.print("The entry you want to register has the wrong type");
        }
    }

    public void display() // Output the contents of the array
    {
        for(int j=0; j<nElems; j++) // For each element
            a[j].displayPerson(); // Output
        System.out.println("");
    }

    public void insertionSort()
    {
        int in, out;
        for(out=1; out<nElems; out++) // out - separating marker
        {
            DataClass temp = a[out]; // Copy the starred item
            in = out; // Start moving with out
            while(in>0 && a[in-1].getLast().compareTo(temp.getLast())>0) // Until the smaller element is found
            {
                a[in] = a[in-1]; // Move the element to the right
                --in; // Go one position to the left
            }
            a[in] = temp; // Insert the tagged item
        }
    }
}
