package Algorithms.SixPart.StackTriangle2;

public class StackX {
    private int maxSize; // Размер массива
    private int[] stackArray;
    private int top; // Вершина стека
    //--------------------------------------------------------------
    public StackX(int s) // Конструктор
    {
        maxSize = s;
        stackArray = new int[maxSize];
        top = -1;
    }
    //--------------------------------------------------------------
    public void push(int p) // Размещение элемента на вершине стека
    { stackArray[++top] = p; }
    //--------------------------------------------------------------
    public int pop() // Извлечение элемента с вершины стека
    { return stackArray[top--]; }
    //--------------------------------------------------------------
    public int peek() // Чтение элемента с вершины стека
    { return stackArray[top]; }
    //--------------------------------------------------------------
    public boolean isEmpty() // true, если стек пуст
    { return (top == -1); }
}
