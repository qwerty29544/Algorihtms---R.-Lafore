package Algorithms.FourthPart.StackArray;

public class StackX {
    private int maxSize; // Размер массива
    private long[] stackArray;
    private int top; // Вершина стека
    //--------------------------------------------------------------
    public StackX(int s) // Конструктор
    {
        maxSize = s; // Определение размера стека
        stackArray = new long[maxSize]; // Создание массива
        top = -1; // Пока нет ни одного элемента
    }
    //--------------------------------------------------------------
    public void push(long j) // Размещение элемента на вершине стека
    {
        stackArray[++top] = j; // Увеличение top, вставка элемента
    }
    //--------------------------------------------------------------
    public long pop() // Извлечение элемента с вершины стека
    {
        return stackArray[top--]; // Извлечение элемента, уменьшение top
    }
    //--------------------------------------------------------------
    public long peek() // Чтение элемента с вершины стека
    {
        return stackArray[top];
    }
    //--------------------------------------------------------------
    public boolean isEmpty() // True, если стек пуст
    {
        return (top == -1);
    }
    //--------------------------------------------------------------
    public boolean isFull() // True, если стек полон
    {
        return (top == maxSize-1);
    }
}
