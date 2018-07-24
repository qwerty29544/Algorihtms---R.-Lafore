package InterIterator;

public class ListIterator {
    private Link current; // Current list item
    private Link previous; // Previous list item
    private LinkList ourList; // LinkList

    public ListIterator(LinkList list) throws IllegalArgumentException // Constructor
    {
        ourList = list;
        reset();
    }

    public void reset() throws NullPointerException// Back to'first'
    {
        current = ourList.getFirst();
        previous = null;
    }

    public boolean atEnd() throws NullPointerException// true, if the current link was the last
    { return (current.next==null); }

    public void nextLink() throws NullPointerException // Move to the next Link
    {
        previous = current;
        current = current.next;
    }

    public Link getCurrent() throws NullPointerException // Getter of the current Link
    { return current; }

    public void insertAfter(long dd) throws IllegalArgumentException // Insertion after current Link
    {
        Link newLink = new Link(dd);
        if( ourList.isEmpty() ) // Empty List
        {
            ourList.setFirst(newLink);
            current = newLink;
        }
        else // If the list isn't empty
        {
            newLink.next = current.next;
            current.next = newLink;
            nextLink(); // Moving to the next link
        }
    }

    public void insertBefore(long dd) throws IllegalArgumentException // Insertion before current link
    {
        Link newLink = new Link(dd);
        if(previous == null) // If in the beginning of the list
        { // or the list is empty
            newLink.next = ourList.getFirst();
            ourList.setFirst(newLink);
            reset();
        }
        else // Isn't at the beginning of the list
        {
            newLink.next = previous.next;
            previous.next = newLink;
            current = newLink;
        }
    }

    public long deleteCurrent() throws NullPointerException // Deleting current link
    {
        long value = current.dData;
        if(previous == null) // if in the beginning of the list
        {
            ourList.setFirst(current.next);
            reset();
        }
        else // if not
        {
            previous.next = current.next;
            if( atEnd() )
                reset();
            else
                current = current.next;
        }
        return value;
    }

    public Link getPrevious() throws NullPointerException {
        return previous;
    }

    public LinkList getOurList() throws NullPointerException {
        return ourList;
    }
}
