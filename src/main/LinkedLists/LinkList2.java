package LinkedLists;

public class LinkList2 {
    private Link first; // Link to the first element of the list

    public LinkList2() // Constructor
    {
        first = null; // The list does not yet contain elements
    }

    public void insertFirst(int id, double dd)
    { // Creating a new item
        Link newLink = new Link(id, dd);
        newLink.next = first; // newLink --> old value first
        first = newLink; // first --> newLink
    }

    public Link find(int key) throws NullPointerException// Search for an item with a given key
    { // (it is assumed that the list is not empty)
        Link current = first; // Starting with 'first'
        while(current.iData != key) // No match found yet
        {
            if(current.next == null) // If the end of the list is reached
                return null; // and no match found
            else // If there are still items left
                current = current.next; // Go to next item
        }
        return current; // Match Found
    }

    public Link delete(int key) throws NullPointerException // Deleting an element with a given key
    { // (it is assumed that the list is not empty)
        Link current = first; // Searching for element
        Link previous = first;
        while(current.iData != key)
        {
            if(current.next == null)
                return null; // Items wasn't found
            else
            {
                previous = current; // Go to the next item
                current = current.next;
            }
        } // Match found
        if(current == first) // If the first item,
            first = first.next; // change first
        else // otherwise
            previous.next = current.next; // bypass it in the list
        return current;
    }

    public void displayList() throws NullPointerException // Output what the list contains
    {
        System.out.print("List (first-->last): ");
        Link current = first; // From the beginning of the list
        while(current != null) // Moving to the end of the list
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
