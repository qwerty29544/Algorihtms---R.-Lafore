package DoublyLinkedList;

public class linkDoublyDeque {
    private DoublyLinkedList dequeLinkedList;

    public linkDoublyDeque() {
        dequeLinkedList = new DoublyLinkedList();
    }

    public void insertRight(long dd) throws IllegalArgumentException {
        this.dequeLinkedList.insertLast(dd);
    }

    public void insertLeft(long dd) throws IllegalArgumentException {
        this.dequeLinkedList.insertFirst(dd);
    }

    public long removeRight() throws NullPointerException {
        if (this.dequeLinkedList.isEmpty())
            return 0;
        return this.dequeLinkedList.deleteLast().getdData();
    }

    public long removeLeft() throws NullPointerException {
        if (this.dequeLinkedList.isEmpty())
            return 0;
        return this.dequeLinkedList.deleteFisrt().getdData();
    }

    public void displayDeque() throws NullPointerException {
        this.dequeLinkedList.displayForward();
    }

    public void displayDequeReverse() throws NullPointerException {
        this.dequeLinkedList.displayBackward();
    }

    public boolean isEmpty() throws NullPointerException {
        return this.dequeLinkedList.isEmpty();
    }

    public long peekFront() throws NullPointerException {
        return this.dequeLinkedList.getLast().getdData();
    }

    public long peekRear() throws NullPointerException {
        return this.dequeLinkedList.getFirst().getdData();
    }

    public Link getFront() throws NullPointerException {
        return this.dequeLinkedList.getLast();
    }

    public Link getRear() throws NullPointerException {
        return this.dequeLinkedList.getFirst();
    }

    public DoublyLinkedList getDequeLinkedList() throws NullPointerException {
        return dequeLinkedList;
    }
}
