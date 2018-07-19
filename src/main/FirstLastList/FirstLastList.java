package FirstLastList;

public class FirstLastList {
    private Link first; // Link to the first element
    private Link last; // Link to the last element

    public FirstLastList() // Constructor
    {
        first = null; // The list does not yet contain elements
        last = null;
    }

    public boolean isEmpty() throws NullPointerException// true if the list is empty
    { return first==null; }

    public void insertFirst(long dd) throws IllegalArgumentException, NullPointerException// Inserting an element at the top of the list
    {
        Link newLink = new Link(dd); // Creating a new item
        if( isEmpty() ) // If the list is empty,
            last = newLink; // newLink <-- last
        newLink.next = first; // newLink --> old value first
        first = newLink; // first --> newLink
    }

    public void insertLast(long dd) throws IllegalArgumentException, NullPointerException// Inserting an item at the end of the list
    {
        Link newLink = new Link(dd); // Creating a new item
        if( isEmpty() ) // If the list is empty,
            first = newLink; // first --> newLink
        else
            last.next = newLink; // Old value last --> newLink
        last = newLink; // newLink <-- last
    }

    public long deleteFirst() throws NullPointerException// Deleting the first list item
    { // (it is assumed that the list is not empty)
        long temp = first.dData;
        if(first.next == null) // If only one element
            last = null; // null <-- last
        first = first.next; // first --> old value next
        return temp;
    }

    public void displayList() throws NullPointerException
    {
        System.out.print("List (first-->last): ");
        Link current = first; // From the beginning of the list
        while(current != null) // Move to the end of the list
        {
            current.displayLink(); // Output of data
            current = current.next; // Go to the next item
        }
        System.out.println("");
    }

    public Link getFirst() throws NullPointerException {
        return first;
    }

    public Link getLast() throws NullPointerException {
        return last;
    }
}
