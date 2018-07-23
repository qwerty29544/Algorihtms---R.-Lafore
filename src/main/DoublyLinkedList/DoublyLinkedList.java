package DoublyLinkedList;

public class DoublyLinkedList {
    private Link first;
    private Link last;

    public DoublyLinkedList() {
        first = null;
        last = null;
    }

    public boolean isEmpty() throws NullPointerException {
        return (first == null);
    }

    public void insertFirst(long dd) throws IllegalArgumentException {
        Link newLink = new Link(dd);
        if (isEmpty())
            last = newLink;
        else
            first.previous = newLink;
        newLink.next = first;
        first = newLink;
    }

    public void insertLast(long dd) throws IllegalArgumentException {
        Link newLink = new Link(dd);
        if (isEmpty())
            first = newLink;
        else
            last.next = newLink;
        newLink.previous = last;
        last = newLink;
    }

    public boolean insertAfter(long key, long dd) throws IllegalArgumentException, NullPointerException {
        Link current = first;
        while (current.getdData() != key){
            current = current.next;
            if (current == null)
                return false;
        }
        Link newLink = new Link(dd);
        if (current == last){
            newLink.next = null;
            last = newLink;
        }
        else {
            newLink.next = current.next;
            current.next.previous = newLink;
        }
        newLink.previous = current;
        current.next = newLink;
        return true;
    }

    public Link deleteFisrt() throws NullPointerException {
        Link temp = first;
        if (first.next == null)
            last = null;
        else
            first.next.previous = null;
        first = first.next;
        return temp;
    }

    public Link deleteLast() throws NullPointerException {
        Link temp = last;
        if (first.next == null)
            first = null;
        else
            last.previous.next = null;
        last = last.previous;
        return temp;
    }

    public Link deleteKey(long key) throws IllegalArgumentException ,NullPointerException {
        Link current = first;
        while(current.getdData() != key)
        {
            current = current.next;
            if(current == null)
                return null;
        }
        if(current==first)
            first = current.next;
        else
            current.previous.next = current.next;
        if(current==last)
            last = current.previous;
        else
            current.next.previous = current.previous;
        return current;
    }
    public void displayForward() throws NullPointerException
    {
        System.out.print("List (first-->last): ");
        Link current = first;
        while(current != null)
        {
            current.displayLink();
            current = current.next;
        }
        System.out.println("");
    }

    public void displayBackward() throws NullPointerException
    {
        System.out.print("List (last-->first): ");
        Link current = last;
        while(current != null)
        {
            current.displayLink();
            current = current.previous;
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
