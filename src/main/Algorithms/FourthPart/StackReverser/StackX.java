package Algorithms.FourthPart.StackReverser;

public class StackX {
    private int maxSize;
    private char[] stackArray;
    private int top;
    //----------------------------------------------
    public StackX(int max) // Constructor
    {
        maxSize = max;
        stackArray = new char[maxSize];
        top = -1;
    }
    //----------------------------------------------
    public void push(char j) // Push element to the top
    {
        stackArray[++top] = j;
    }
    //----------------------------------------------
    public char pop()
    {
        return stackArray[top--];
    }
    //----------------------------------------------
    public char peek()
    {
        return stackArray[top];
    }
    //----------------------------------------------
    public boolean isEmpty() //True if stack is empty
    {
        return (top == -1);
    }
}
