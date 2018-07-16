package Queues;

public class QueueVer2 {
    private int maxSize;
    private long[] queArray;
    private int front;
    private int rear;

    public QueueVer2(int s) throws IllegalArgumentException, NegativeArraySizeException // Constructor
    {
        maxSize = s+1; // Array per cell more
        queArray = new long[maxSize]; // the required size
        front = 0;
        rear = -1;
    }

    public void insert(long j) throws IllegalArgumentException // Inserting an element at the end of the queue
    {
        if(rear == maxSize-1)
            rear = -1;
        queArray[++rear] = j;
    }

    public long remove() // Extracting an element at the beginning of the queue
    {
        long temp = queArray[front++];
        if(front == maxSize)
            front = 0;
        return temp;
    }

    public long peek() // Reading an element at the beginning of a queue
    {
        return queArray[front];
    }

    public boolean isEmpty() // true if the queue is empty
    {
        return ( rear+1==front || (front+maxSize-1==rear) );
    }

    public boolean isFull() // true if the queue is full
    {
        return ( rear+2==front || (front+maxSize-2==rear) );
    }

    public int size() // (assumes queue not empty) Getter w/o nElems variable
    {
        if(rear >= front) // Continuous Sequence
            return rear-front+1;
        else // The disjoint sequence
            return (maxSize-front) + (rear+1);
    }

    public int getMaxSize() { // Getter of the max size of an array
        return maxSize;
    } // Getter

    public long[] getQueArray() { // getter of an array itself
        return queArray;
    } // Getter

    public int getFront() { // getter of the front mark in Que
        return front;
    } // Getter

    public int getRear() { // getter of the rear mark in Que
        return rear;
    } // Getter
}
