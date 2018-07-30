package RecAlgos.MergeSort;

public class MergeSortArray {
    private long[] theArray; // Reference to theArray array
    private int nElems; // Number of data items

    public MergeSortArray(int max) throws IllegalArgumentException, NegativeArraySizeException // Constructor
    {
        theArray = new long[max]; // Create an array
        nElems = 0;
    }

    public void insert(long value) throws ArrayIndexOutOfBoundsException,IllegalArgumentException, NullPointerException // Entry of an element into an array
    {
        theArray[nElems] = value; // Insert an element
        nElems++; // Increase the size
    }

    public void display() throws NullPointerException // Output the contents of the array
    {
        for(int j=0; j<nElems; j++) // For each element
            System.out.print(theArray[j] + " "); // Output
        System.out.println("");
    }

    public void mergeSort() throws NullPointerException // Called from main ()
    { // Workspace
        long[] workSpace = new long[nElems];
        recMergeSort(workSpace, 0, nElems-1);
    }

    private void recMergeSort(long[] workSpace, int lowerBound,
                              int upperBound)
    {
        if(lowerBound == upperBound) // If only one element,
            return; // sorting is not required.
        else
        { // Find the middle
            int mid = (lowerBound+upperBound) / 2;
            // Sorting the bottom half
            recMergeSort(workSpace, lowerBound, mid);
            // Sorting the top half
            recMergeSort(workSpace, mid+1, upperBound);
            // Merge
            merge(workSpace, lowerBound, mid+1, upperBound);
        }
    }

    private void merge(long[] workSpace, int lowPtr,
                       int highPtr, int upperBound)
    {
        int j = 0; // Index in the workspace
        int lowerBound = lowPtr;
        int mid = highPtr-1;
        int n = upperBound-lowerBound+1; // Amount of elements
        while(lowPtr <= mid && highPtr <= upperBound)
            if( theArray[lowPtr] < theArray[highPtr] )
                workSpace[j++] = theArray[lowPtr++];
            else
                workSpace[j++] = theArray[highPtr++];
        while(lowPtr <= mid)
            workSpace[j++] = theArray[lowPtr++];
        while(highPtr <= upperBound)
            workSpace[j++] = theArray[highPtr++];
        for(j=0; j<n; j++)
            theArray[lowerBound+j] = workSpace[j];
    }

    public long[] getTheArray() throws NullPointerException {
        return theArray;
    }

    public int getnElems() throws NullPointerException {
        return nElems;
    }
}
