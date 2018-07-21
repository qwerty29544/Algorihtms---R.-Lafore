package SortedList;

public class SortedList {
    private Link first; // Link to the first element of the list

    public SortedList() // Constructor
    { first = null; }

    public boolean isEmpty() throws NullPointerException // true, if the list is empty
    { return (first==null); }

    public void insert(long key) throws IllegalArgumentException // Insert in sort order
    {
        Link newLink = new Link(key); // Creating a new item
        Link previous = null; // From the beginning of the list
        Link current = first;
        // To the end of the list
        while(current != null && key > current.dData)
        { // or if key> current,
            previous = current;
            current = current.next; // Go to next item
        }
        if(previous==null) // At the beginning of the list
            first = newLink; // first --> newLink
        else // Не в начале
            previous.next = newLink; // old value of prev --> newLink
        newLink.next = current; // newLink --> old value of current
    }

    public Link remove() throws NullPointerException // Deleting the first item
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
            current.displayLink(); // Output of data
            current = current.next; // Go to the next item
        }
        System.out.println("");
    }

    public Link getFirst() throws NullPointerException { // Getter
        return first;
    }
}
