package InterIterator;

public class Link {
    public long dData; // Data
    public Link next; // The next item in the list

    public Link(long dd) throws IllegalArgumentException // Constructor
    { dData = dd; }

    public void displayLink() throws NullPointerException // Displaying the contents of an element
    { System.out.print(dData + " "); }

    public long getdData() throws NullPointerException { // Getter
        return dData;
    }

    public Link getNext() throws NullPointerException { // Getter
        return next;
    }
}
