package PriorityQueues;

public class PriorityQueueArrayClass {
    // Array elements are sorted by key value,
    // from maximum (0) to minimum (maxSize-1)
    private int maxSize;
    private long[] queArray;
    private int nItems;

    public PriorityQueueArrayClass(int s) throws IllegalArgumentException, NegativeArraySizeException // Constructor
    {
        maxSize = s;
        queArray = new long[maxSize];
        nItems = 0;
    }

    public void insert(long item) throws IllegalArgumentException // Inserting element
    {
        int j;
        if(nItems==0) // If the queue is empty,
            queArray[nItems++] = item; // insert in cell 0
        else // If the queue contains items
        {
            for(j=nItems-1; j>=0; j--) // Bust in the opposite direction
            {
                if( item > queArray[j] ) // If the new item is larger,
                    queArray[j+1] = queArray[j]; // move up
                else // If less,
                    break; // shift stops
            }
            queArray[j+1] = item; // Insert an item
            nItems++;
        }
    }

    public long remove() // Extract minimum element
    { return queArray[--nItems]; }

    public long peekMin() // Read the minimum element
    { return queArray[nItems-1]; }

    public boolean isEmpty() // true if the queue is empty
    { return (nItems==0); }

    public boolean isFull() // true if the queue is full
    { return (nItems == maxSize); }

    public int getMaxSize() { //Getter
        return maxSize;
    }

    public long[] getQueArray() { // Getter
        return queArray;
    }

    public int getnItems() { // Getter
        return nItems;
    }
}
