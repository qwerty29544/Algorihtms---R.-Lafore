package Queues;

public class QueueArrayClass {
    private int maxSize;
    private long[] queArray;
    private int front;
    private int rear;
    private int nItems;

    public QueueArrayClass(int s) throws IllegalArgumentException, NegativeArraySizeException  // Constructor
    {
        maxSize = s;
        queArray = new long[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public void insert(long j) throws IllegalArgumentException// Insert an item at the end of the queue
    {
        if(rear == maxSize-1) // Cyclic transfer
            rear = -1;
        queArray[++rear] = j; // Increase rear and insert
        nItems++; // Increase the number of elements
    }

    public long remove() throws NullPointerException // Extracting an element at the beginning of the queue
    {
        long temp = queArray[front++]; // Sample and enlarge front
        if(front == maxSize) // Cyclic transfer
            front = 0;
        nItems--; // Decrease the number of elements
        return temp;
    }

    public long peekFront() throws NullPointerException // Reading an element at the beginning of a queue
    {
        return queArray[front];
    }

    public boolean isEmpty() throws NullPointerException // true if the queue is empty
    {
        return (nItems==0);
    }

    public boolean isFull() throws NullPointerException // true if the queue is full
    {
        return (nItems==maxSize);
    }

    public int size() throws NullPointerException // Number of items in the queue
    {
        return nItems;
    }

    public int getMaxSize() throws NullPointerException { // Max size of a queue array getter
        return maxSize;
    } // Getter

    public long[] getQueArray() throws NullPointerException { // Queue array getter
        return queArray;
    } // Getter

    public int getFront() throws NullPointerException { // Front mark getter
        return front;
    } // Getter

    public int getRear() throws NullPointerException { // Rear mark getter
        return rear;
    }
}
