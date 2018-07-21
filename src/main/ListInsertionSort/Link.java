package ListInsertionSort;

public class Link {
    public long dData; // Data
    public Link next; // Next item in the list

    public Link(long dd) throws IllegalArgumentException // Constructor
    { dData = dd; }

    public long getdData() throws NullPointerException { // Getter
        return dData;
    }

    public Link getNext() throws NullPointerException { // Getter
        return next;
    }
}
