package NonTrivialSortAlgos.ShellSort;

public class ShellSortAlgo {
    private long[] theArray; // Reference to an array
    private int nElems; // Amount of elements

    public ShellSortAlgo(int max) throws IllegalArgumentException, NegativeArraySizeException // Constructor
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

    public void shellSort() throws NullPointerException
    {
        int inner, outer;
        long temp;
        int h = 1; // Calculate the initial value of h
        while(h <= nElems/3)
            h = h*3 + 1; // (1, 4, 13, 40, 121, ...)
        while(h>0) // Gradually decrease h to 1
        {
            // h-sort the file
            for(outer=h; outer<nElems; outer++)
            {
                temp = theArray[outer];
                inner = outer;
                // First sub-array (0, 4, 8)
                while(inner > h-1 && theArray[inner-h] >= temp)
                {
                    theArray[inner] = theArray[inner-h];
                    inner -= h;
                }
                theArray[inner] = temp;
            }
            h = (h-1) / 3; // Decrease h
        }
    }

    public long[] getTheArray() throws NullPointerException {
        return theArray;
    }

    public int getnElems() throws NullPointerException {
        return nElems;
    }
}
