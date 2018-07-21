package Algorithms.FifthPart.LinkStack;

public class LinkStack {
    private LinkList theList; // Список, на основе которого реализован стек
    //--------------------------------------------------------------
    public LinkStack() // Конструктор
    {
        theList = new LinkList();
    }
    //--------------------------------------------------------------
    public void push(long j) // Размещение элемента на вершине стека
    {
        theList.insertFirst(j);
    }
    //--------------------------------------------------------------
    public long pop() // Извлечение элемента с вершины стека
    {
        return theList.deleteFirst();
    }
    //--------------------------------------------------------------
    public boolean isEmpty() // true, если стек пуст
    {
        return ( theList.isEmpty() );
    }
    //--------------------------------------------------------------
    public void displayStack() // Отображение содержимого стека
    {
        System.out.print("Stack (top-->bottom): ");
        theList.displayList();
    }
}
