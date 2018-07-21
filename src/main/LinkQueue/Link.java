package LinkQueue;

public class Link {
    protected long dData; // Data
    protected Link next; // The next item in a list

    public Link(long dd) throws  IllegalArgumentException // Constructor
    { dData = dd; }

    public void displayLink() throws  NullPointerException // Output data of this link
    { System.out.print(dData + " "); }

    public long getdData() throws  NullPointerException { //Getter
        return dData;
    }

    public Link getNext() throws  NullPointerException { // Getter
        return next;
    }
}
