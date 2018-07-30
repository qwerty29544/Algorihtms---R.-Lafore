package RecAlgos;

public class OrdArrayBinarySearch {
    private long[] array; // Reference to array array
    private int nElems; // number of data items
    //-----------------------------------------------------------
    public OrdArrayBinarySearch(int max) throws IllegalArgumentException, NegativeArraySizeException // Constructor
    {
        array = new long[max]; // Creating an array
        nElems = 0;
    }
    //-----------------------------------------------------------
    public int size() throws NullPointerException // getter
    { return nElems; }
    //-----------------------------------------------------------
    public int find(long searchKey) throws IllegalArgumentException
    {
        return recFind(searchKey, 0, nElems-1);
    }
    //-----------------------------------------------------------
    private int recFind(long searchKey, int lowerBound,
                        int upperBound) throws NullPointerException, ArrayIndexOutOfBoundsException
    {
        int curIn;
        curIn = (lowerBound + upperBound ) / 2;
        if(array[curIn]==searchKey)
            return curIn; // Item found
        else if(lowerBound > upperBound)
            return nElems; // Item doesn't found
        else // Divide the range
        {
            if(array[curIn] < searchKey) // In the upper half
                return recFind(searchKey, curIn+1, upperBound);
            else // In the lower half
                return recFind(searchKey, lowerBound, curIn-1);
        }
    }
    //-----------------------------------------------------------
    public void insert(long value) throws IllegalArgumentException, ArrayStoreException, ArrayIndexOutOfBoundsException // Save an element in an array
    {
        int j;
        for(j=0; j<nElems; j++) // Define the position
            if(array[j] > value) // (linear search)
                break;
        for(int k=nElems; k>j; k--) // Move items
            array[k] = array[k-1]; // with array large value of the key
        array[j] = value; // Insert
        nElems++; // Increase the size
    }
    //-----------------------------------------------------------
    public void display() throws NullPointerException // Output the contents of the array
    {
        for(int j=0; j<nElems; j++) // For each element
            System.out.print(array[j] + " "); // Output the current item
        System.out.println("");
    }

    public long[] getArray() throws NullPointerException { // Getter
        return array;
    }
}
