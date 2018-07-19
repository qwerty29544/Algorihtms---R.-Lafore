package LinkedLists;

public class LinkList {
    private Link first; // Link to the first element of the list

    public LinkList() // Constructor
    {
        first = null; // The list does not yet contain elements
    }

    public boolean isEmpty() throws NullPointerException// true if the list is empty
    {
        return (first==null);
    }

//
    public void insertFirst(int id, double dd) throws IllegalArgumentException
    { // Create a new item
        Link newLink = new Link(id, dd);
        newLink.next = first; // newLink --> old value first
        first = newLink; // first --> newLink
    }

    public Link deleteFirst() throws NullPointerException // Deleting the first item
    { // (it is assumed that the list is not empty)
        Link temp = first; // Save link
        first = first.next; // Deletion: first --> reference to the second element
        return temp; // The method returns a reference
    } // to the deleted item

    public void displayList() throws NullPointerException
    {
        System.out.print("List (first-->last): ");
        Link current = first; // From the beginning of the list
        while(current != null) // Move to the end of the list
        {
            current.displayLink(); // Data output
            current = current.next; // Go to the next item
        }
        System.out.println("");
    }

    public Link getFirst() throws NullPointerException {
        return first;
    }
}
