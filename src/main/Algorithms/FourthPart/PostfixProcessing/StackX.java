package Algorithms.FourthPart.PostfixProcessing;

public class StackX {
    private int maxSize;
    private int[] stackArray;
    private int top;
    //--------------------------------------------------------------
    public StackX(int size) // Конструктор
    {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }
    //--------------------------------------------------------------
    public void push(int j) // Размещение элемента на вершине стека
    { stackArray[++top] = j; }
    //--------------------------------------------------------------
    public int pop() // Извлечение элемента с вершины стека
    { return stackArray[top--]; }
    //--------------------------------------------------------------
    public int peek() // Чтение элемента на вершине стека
    { return stackArray[top]; }
    //--------------------------------------------------------------
    public boolean isEmpty() // true, если стек пуст
    { return (top == -1); }
    //--------------------------------------------------------------
    public boolean isFull() // true, если стек заполнен
    { return (top == maxSize-1); }
    //--------------------------------------------------------------
    public int size() // Текущий размер стека
    { return top+1; }
    //--------------------------------------------------------------
    public int peekN(int n) // Чтение элемента с индексом n
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
