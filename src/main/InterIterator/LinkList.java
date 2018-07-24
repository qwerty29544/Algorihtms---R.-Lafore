package InterIterator;

public class LinkList {
    private Link first; // Link to the first item in the list

    public LinkList()// Constructor
    { first = null; } // The list does not yet contain elements

    public Link getFirst() throws NullPointerException // Getting the first element
    { return first; }

    public void setFirst(Link f) throws IllegalArgumentException, NullPointerException // Assigning a new value first
    { first = f; }

    public boolean isEmpty() throws NullPointerException // true, if the list is empty
    { return first==null; }

    public ListIterator getIterator() throws NullPointerException // Getting an iterator
    {
        return new ListIterator(this); // Initializing list with this
    }

    public void displayList() throws NullPointerException
    {
        Link current = first; // From the beginning of the list
        while(current != null) // Move to the end of the list
        {
            current.displayLink(); // Displays the current item
            current = current.next; // Go to the next item
        }
        System.out.println("");
    }
}
