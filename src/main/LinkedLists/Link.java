package LinkedLists;

public class Link {
    protected int iData; // Data (key)
    protected double dData; // Data
    protected Link next; // The next item in the list

    public Link(int id, double dd) throws IllegalArgumentException // Constructor
    {
        iData = id; // Initializing data
        dData = dd; // 'next' automatically assigned null
    }

    public void displayLink() throws NullPointerException // Displaying the contents of an element
    {
        System.out.print("{" + iData + ", " + dData + "} ");
    }

    public int getiData() throws NullPointerException {
        return iData;
    }

    public double getdData() throws NullPointerException {
        return dData;
    }

    public Link getNext() throws NullPointerException {
        return next;
    }
}
