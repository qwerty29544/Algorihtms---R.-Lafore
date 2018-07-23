package DoublyLinkedList;

public class Link {
    protected long dData; // Data
    protected Link next; // Next item in the list
    protected Link previous; // Previous item in the list

    public Link(long d) // Constructor
    { dData = d; }

    public void displayLink() // Displaying the contents of an element
    { System.out.print(dData + " "); }

    public long getdData() { // Getter
        return dData;
    }

    public Link getNext() { // Getter
        return next;
    }

    public Link getPrevious() { // Getter
        return previous;
    }
}
