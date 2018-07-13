package Algorithms.FourthPart.StackBracketeer;

public class StackX {
    private int maxSize;//Size of an array
    private char[] stackArray;
    private int top;//marker of stack array

    public StackX(int s){ //Constructor
        maxSize = s;
        stackArray = new char[maxSize];
        top= -1;
    }

    public void push(char j){ //Method push insert an object inside of stack
        stackArray[++top] = j; //Begins with top+1 then j
    }

    public char pop(){
        return stackArray[top--]; // marker moves down
    }

    public char peek(){
        return stackArray[top]; // element from top of an array without delete or rewrite
    }

    public boolean isEmpty(){
        return (top == -1);
    }
}
