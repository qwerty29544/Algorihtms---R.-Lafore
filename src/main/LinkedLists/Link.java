package LinkedLists;

public class Link {
    public int iData; // Data (key)
    public double dData; // Data
    public Link next; // The next item in the list

    public Link(int id, double dd) // Constructor
    {
        iData = id; // Initializing data
        dData = dd; // 'next' automatically assigned null
    }

    public void displayLink() // Displaying the contents of an element
    {
        System.out.print("{" + iData + ", " + dData + "} ");
    }
}
