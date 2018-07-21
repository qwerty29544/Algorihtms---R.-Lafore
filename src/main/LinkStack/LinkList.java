package LinkStack;

public class LinkList {
    private Link first; // First item in a list

    public LinkList() // Constructor
    { first = null; } // List hasn't any element

    public boolean isEmpty() throws NullPointerException // true, if list is empty
    { return (first==null); }

    public void insertFirst(long dd) throws IllegalArgumentException // Inserting an item in the beginning of the list
    { // Creating new item
        Link newLink = new Link(dd);
        newLink.next = first; // newLink --> old value of first
        first = newLink; // first --> newLink
    }

    public long deleteFirst() throws NullPointerException // Removing first item from the list
    { // it assumed that list isn't empty
        Link temp = first; // Save link
        first = first.next; // Removing: first-->link on the first element
        return temp.dData; // Method returns data
    } // of deleted element

    public void displayList() throws NullPointerException
    {
        Link current = first; // From the beginning of the list
        while(current != null) // Moving to the end of the list
        {
            current.displayLink(); // Output of data
            current = current.next; // Moving to the next item
        }
        System.out.println("");
    }

    public Link getFirst() throws NullPointerException {
        return first;
    }
}
