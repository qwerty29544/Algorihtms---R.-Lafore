package LinkStack;

public class LinkStack {
    private LinkList theList; // List on what stack is based

    public LinkStack() // Constructor
    {
        theList = new LinkList();
    }

    public void push(long j) throws IllegalArgumentException // Inserting item to the top of the stack
    {
        theList.insertFirst(j);
    }

    public long pop() throws NullPointerException // Extracting an element from the top of the stack
    {
        return theList.deleteFirst();
    }

    public boolean isEmpty() throws NullPointerException // true, if stack is empty
    {
        return ( theList.isEmpty() );
    }

    public void displayStack() throws NullPointerException // Output stack data
    {
        System.out.print("Stack (top-->bottom): ");
        theList.displayList();
    }

    public LinkList getTheList() throws NullPointerException {
        return theList; // Getter
    }
}
