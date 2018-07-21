package ListInsertionSort;

public class SortedList {
    private Link first; // Link to the first element of the list

    public SortedList() // Constructor (no arguments)
    { first = null; } // Initializing the list

    public SortedList(Link[] linkArr) throws IllegalArgumentException // Constructor (argument is an array)
    { //
        first = null; // Initializing the list
        for(int j=0; j<linkArr.length; j++) // Copying an array
            insert( linkArr[j] ); // to the list
    }

    public void insert(Link k) throws IllegalArgumentException // Insert (in sort order)
    {
        Link previous = null; // From the beginning of the list
        Link current = first; // To the end of the list
        while(current != null && k.dData > current.dData)
        { // or if the key > current,
            previous = current;
            current = current.next; // Go to next item
        }
        if(previous==null) // At the beginning of the list
            first = k; // first --> k
        else // Не в начале
            previous.next = k; // old value of prev --> k
        k.next = current; // k --> old value of current
    }

    public Link remove() throws  NullPointerException // Returns and removes the first link
    { // (assumes non-empty list)
        Link temp = first; // Save link
        first = first.next; // Deleting the first item
        return temp; // The method returns a reference
    } // to the deleted item

    public Link getFirst() throws NullPointerException { // Getter
        return first;
    }
}
