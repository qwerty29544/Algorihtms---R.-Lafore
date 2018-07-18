package Stacks;

public class StackArrayClass {
    private int maxSize; // The size of the array
    private long[] stackArray;
    private int top; // The top of the stack

    public StackArrayClass(int s)  throws IllegalArgumentException, NegativeArraySizeException // Constructor
    {
        maxSize = s; // Determining the size of the stack
        stackArray = new long[maxSize]; // Creating an array
        top = -1; // No items yet
    }

    public void push(long j)  throws IllegalArgumentException, ArrayIndexOutOfBoundsException, ArrayStoreException // Place an element on top of the stack
    {
        stackArray[++top] = j; // Increase top, insert an element
    }

    public long pop() // Extracting an element from the top of the stack
    {
        return stackArray[top--]; // Extracting an element, reducing top
    }

    public long peek() // Reading an element from the top of the stack
    {
        return stackArray[top];
    }

    public boolean isEmpty() // True, if the stack is empty
    {
        return (top == -1);
    }

    public boolean isFull() // True, if the stack is full
    {
        return (top == maxSize-1);
    }

    public int getMaxSize() { // Getter
        return maxSize;
    }

    public long[] getStackArray() { // Getter
        return stackArray;
    }

    public int getTop() { // Getter
        return top;
    }
}
