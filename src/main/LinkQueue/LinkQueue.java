package LinkQueue;

public class LinkQueue {
    private FirstLastList theList;

    public LinkQueue() // Constructor
    { theList = new FirstLastList(); } // Create a 2-sided list

    public boolean isEmpty() throws NullPointerException // true, if the queue is empty
    { return theList.isEmpty(); }

    public void insert(long j) throws IllegalArgumentException // Inserting an element at the end of the queue
    { theList.insertLast(j); }

    public long remove() throws NullPointerException // Deleting an item at the beginning
    { return theList.deleteFirst(); }

    public void displayQueue() throws NullPointerException
    {
        System.out.print("Queue (front-->rear): ");
        theList.displayList();
    }

    public FirstLastList getTheList() throws NullPointerException { // Getter
        return theList;
    }
}
