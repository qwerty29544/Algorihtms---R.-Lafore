package LinkQueue;

public class FirstLastList {
    private Link first; // Reference to the first Link
    private Link last; // Reference to the last Link

    public FirstLastList() // Constructor
    {
        first = null; // List is empty
        last = null;
    }

    public boolean isEmpty() throws NullPointerException // true, if List is empty
    { return first==null; }

    public void insertLast(long dd) throws IllegalArgumentException // Inserting Link to the end of the list
    {
        Link newLink = new Link(dd); // Creating a new Link
        if( isEmpty() ) // If the list if empty,
            first = newLink; // first --> newLink
        else
            last.next = newLink; // Old value of last --> newLink
        last = newLink; // newLink <-- last
    }

    public long deleteFirst() throws NullPointerException // Deleting first item
    { // it assumed, that the list isn't empty
        long temp = first.dData;
        if(first.next == null) // Save this link
            last = null; // null <-- last
        first = first.next; // first --> old value of next
        return temp;
    }

    public void displayList() throws NullPointerException
    {
        Link current = first; // From the beginning of the list
        while(current != null) // Moving to the end of the list
        {
            current.displayLink(); // Data output
            current = current.next; // Moving to the next item
        }
        System.out.println("");
    }

    public Link getFirst() throws NullPointerException { // Getter
        return first;
    }

    public Link getLast() throws NullPointerException { // Getter
        return last;
    }
}
