package Algorithms.SixPart.StackTriangle;

public class StackX {
    private int maxSize; // Размер массива StackX
    private Params[] stackArray;
    private int top; // Вершина стека
    //--------------------------------------------------------------
    public StackX(int s) // Конструктор
    {
        maxSize = s; // Определение размера массива
        stackArray = new Params[maxSize]; // Создание массива
        top = -1; // Массив пока не содержит элементов
    }
    //--------------------------------------------------------------
    public void push(Params p) // Размещение элемента на вершине стека
    {
        stackArray[++top] = p; // Увеличение top, вставка элемента
    }
    //--------------------------------------------------------------
    public Params pop() // Извлечение элемента с вершины стека
    {
        return stackArray[top--]; // Обращение к элементу, уменьшение top
    }
    //--------------------------------------------------------------
    public Params peek() // Чтение элемента на вершине стека
    {
        return stackArray[top];
    }
}
