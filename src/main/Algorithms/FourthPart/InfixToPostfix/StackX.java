package Algorithms.FourthPart.InfixToPostfix;

public class StackX {
    private int maxSize;
    private char[] stackArray;
    private int top;
    //--------------------------------------------------------------
    public StackX(int s) // Конструктор
    {
        maxSize = s;
        stackArray = new char[maxSize];
        top = -1;
    }
    //--------------------------------------------------------------
    public void push(char j) // Размещение элемента на вершине стека
    { stackArray[++top] = j; }
    //--------------------------------------------------------------
    public char pop() // Извлечение элемента с вершины стека
    { return stackArray[top--]; }
    //--------------------------------------------------------------
    public char peek() // Чтение элемента с вершины стека
    { return stackArray[top]; }
    //--------------------------------------------------------------
    public boolean isEmpty() // true, если стек пуст
    { return (top == -1); }
    //-------------------------------------------------------------
    public int size() // Текущий размер стека
    { return top+1; }
    //--------------------------------------------------------------
    public char peekN(int n) // Чтение элемента с индексом n
    { return stackArray[n]; }
    //--------------------------------------------------------------
    public void displayStack(String s)
    {
        System.out.print(s);
        System.out.print("Stack (bottom-->top): ");
        for(int j=0; j<size(); j++)
        {
            System.out.print( peekN(j) );
            System.out.print(' ');
        }
        System.out.println("");
    }
}
