package SortedList;

public class Link {
    public long dData; // Data
    public Link next; // Reference to the next item in the list

    public Link(long dd) throws IllegalArgumentException // Constructor
    { dData = dd; }

    public void displayLink() throws NullPointerException // List the contents of the list
    { System.out.print(dData + " "); }

    public long getdData() throws NullPointerException { // Getter
        return dData;
    }

    public Link getNext() throws NullPointerException { // Getter
        return next;
    }
}
