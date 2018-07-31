package NonTrivialSortAlgos.Partition;

public class Partition {
    private long[] theArray; // Reference to an array
    private int nElems; // Amount of elements

    public Partition(int max) throws IllegalArgumentException, NegativeArraySizeException // Constructor
    {
        theArray = new long[max]; // Create an array
        nElems = 0; // No items yet
    }

    public void insert(long value) throws IllegalArgumentException, ArrayIndexOutOfBoundsException // Insert an element into an array
    {
        theArray[nElems] = value; // Actually insert
        nElems++; // Increase the size
    }

    public int size() throws NullPointerException // Get the number of elements
    { return nElems; }

    public void display() throws NullPointerException // Output the contents of the array
    {
        System.out.print("A=");
        for(int j=0; j<nElems; j++) // For each element
            System.out.print(theArray[j] + " "); // Output
        System.out.println("");
    }

    public int partitionIt(int left, int right, long pivot) throws IllegalArgumentException, NullPointerException
    {
        int leftPtr = left - 1; // To the right of the first element
        int rightPtr = right + 1; // To the left of the support element
        while(true)
        {
            while(leftPtr < right && theArray[++leftPtr] < pivot) // Search for a larger element
                ; // (empty loop body)

            while(rightPtr > left && theArray[--rightPtr] > pivot) // Find the smaller element
                ; // (empty loop body)
            if(leftPtr >= rightPtr) // If the pointers converge, the partition is complete
                break;
            else // Otherwise
                swap(leftPtr, rightPtr); // swap items in places
        }
        return leftPtr; // Split position
    }

    public void swap(int dex1, int dex2) throws IllegalArgumentException, NullPointerException // Permutation of two elements
    {
        long temp;
        temp = theArray[dex1]; // A is copied to temp
        theArray[dex1] = theArray[dex2]; // B is copied to A
        theArray[dex2] = temp; // temp is copied to B
    }

    public long[] getTheArray() throws NullPointerException {
        return theArray;
    }
}
