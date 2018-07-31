package NonTrivialSortAlgos.QuckSort1;

public class qSortAlgo1 {
    private long[] theArray; // Reference to an array
    private int nElems; // Amount of elements

    public qSortAlgo1(int max) throws IllegalArgumentException,NegativeArraySizeException // Constructor
    {
        theArray = new long[max]; // Create an array
        nElems = 0; // No items yet
    }

    public void insert(long value) throws IllegalArgumentException,ArrayIndexOutOfBoundsException,NullPointerException // Insert an element into an array
    {
        theArray[nElems] = value; // Actually insert
        nElems++; // Increase the size
    }

    public void display() throws NullPointerException // Output the contents of the array
    {
        System.out.print("A=");
        for(int j=0; j<nElems; j++) // For each element
            System.out.print(theArray[j] + " "); // Conclusion
        System.out.println("");
    }

    public void quickSort() throws NullPointerException
    {
        recQuickSort(0, nElems-1);
    }

    private void recQuickSort(int left, int right) throws NullPointerException, IllegalArgumentException
    {
        if(right-left <= 0) // If the size is <= 112, the array is sorted
            return;
        else // For size 2 and more
        {
            long pivot = theArray[right]; // The rightmost element
            // Range breakdown
            int partition = partitionIt(left, right, pivot);
            recQuickSort(left, partition-1); // Sorting the left part
            recQuickSort(partition+1, right); // sort the right part
        }
    }

    private int partitionIt(int left, int right, long pivot) throws NullPointerException, IllegalArgumentException
    {
        int leftPtr = left-1; // Left border (after ++)
        int rightPtr = right; // Right border-1 (after --)
        while(true)
        { // Search for a larger element
            while( theArray[++leftPtr] < pivot )
                ; // (nop)
            // Find the smaller element
            while(rightPtr > 0 && theArray[--rightPtr] > pivot)
                ; // (nop)
            if(leftPtr >= rightPtr) // If the pointers converge, the partition is complete.
                break;
            else // Otherwise
                swap(leftPtr, rightPtr); // swap elements in places.
        }
        swap(leftPtr, right); // Rearrangement of the support element
        return leftPtr; // Return the position of the reference element
    }

    private void swap(int dex1, int dex2) throws NullPointerException, IllegalArgumentException // Permutation of two elements
    {
        long temp;
        temp = theArray[dex1]; // A is copied to temp
        theArray[dex1] = theArray[dex2]; // B is copied to A
        theArray[dex2] = temp; // temp is copied to B
    }

    public long[] getTheArray() throws NullPointerException {
        return theArray;
    }

    public int getnElems() throws NullPointerException {
        return nElems;
    }
}
