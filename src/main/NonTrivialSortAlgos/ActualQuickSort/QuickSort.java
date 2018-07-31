package NonTrivialSortAlgos.ActualQuickSort;

public class QuickSort {
    private long[] theArray; // Reference to an array
    private int nElems; // Amount of elements

    public QuickSort(int max) throws IllegalArgumentException, NegativeArraySizeException // Constructor
    {
        theArray = new long[max]; // Create an array
        nElems = 0; // No items yet
    }

    public void insert(long value) throws IllegalArgumentException, NullPointerException, ArrayIndexOutOfBoundsException // Insert an element into an array
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

    private void recQuickSort(int left, int right) throws IllegalArgumentException, NullPointerException
    {
        int size = right-left+1;
        if(size <= 3) // Manual sorting with a small size
            manualSort(left, right);
        else // Quick sort for large size
        {
            long median = medianOf3(left, right);
            int partition = partitionIt(left, right, median);
            recQuickSort(left, partition-1);
            recQuickSort(partition+1, right);
        }
    }

    private long medianOf3(int left, int right) throws NullPointerException, IllegalArgumentException
    {
        int center = (left+right)/2;
        // Arrange left and center
        if( theArray[left] > theArray[center] )
            swap(left, center);
        // Order left and right
        if( theArray[left] > theArray[right] )
            swap(left, right);
        if( theArray[center] > theArray[right] )
            swap(center, right);
        swap(center, right-1); // Place the median on the right edge
        return theArray[right-1]; // The method returns the median
    }

    private void swap(int dex1, int dex2) throws IllegalArgumentException, NullPointerException // Permutation of two elements
    {
        long temp = theArray[dex1]; // A is copied to temp
        theArray[dex1] = theArray[dex2]; // B is copied to A
        theArray[dex2] = temp; // temp is copied to B
    }

    private int partitionIt(int left, int right, long pivot) throws IllegalArgumentException, NullPointerException
    {
        int leftPtr = left; // To the right of the first element
        int rightPtr = right - 1; // To the left of the support element
        while(true)
        {
            while( theArray[++leftPtr] < pivot ) // Search for a larger element
                ; // (empty loop body)
            while( theArray[--rightPtr] > pivot ) // Find the smaller element
                ; // (empty loop body)
            if(leftPtr >= rightPtr) // If the pointers converge, the partition is complete
                break;
            else // Otherwise swap items
                swap(leftPtr, rightPtr);
        }
        swap(leftPtr, right-1); // Restore the reference element
        return leftPtr; // Split position
    }

    private void manualSort(int left, int right) throws IllegalArgumentException, NullPointerException
    {
        int size = right-left+1;
        if(size <= 1)
            return; // Sort is not required
        if(size == 2) // 2-sort left and right
        {
            if( theArray[left] > theArray[right] )
                swap(left, right);
            return;
        }
        else // The size is 3
        { // 3-sort left, center and right
            if( theArray[left] > theArray[right-1] )
                swap(left, right-1); // left, center
            if( theArray[left] > theArray[right] )
                swap(left, right); // left, right
            if( theArray[right-1] > theArray[right] )
                swap(right-1, right); // center, right
        }
    }

    public long[] getTheArray() throws NullPointerException { // Getter of an array
        return theArray;
    }

    public int size() throws NullPointerException { // Getter of the size
        return nElems;
    }
}
