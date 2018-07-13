package stack;

public class StackArrayClass {
    private int maxSize; // The size of the array
    private long[] stackArray;
    private int top; // The top of the stack

    public StackArrayClass(int s)  throws IllegalArgumentException // Constructor
    {
        try {
            maxSize = s; // Determining the size of the stack
            stackArray = new long[maxSize]; // Creating an array
            top = -1; // No items yet
        }
        catch (NegativeArraySizeException a3){
            System.out.print("Incorrect size, try to record an positive number");
        }
    }

    public void push(long j)  throws IllegalArgumentException // Place an element on top of the stack
    {
        try {
            stackArray[++top] = j; // Increase top, insert an element
        }
        catch (ArrayIndexOutOfBoundsException e5){
            System.out.print("Stack is full, please try to delete some recordings");
        }
        catch (ArrayStoreException e8){
            System.out.print("The entry you want to register has the wrong type");
        }
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
}
