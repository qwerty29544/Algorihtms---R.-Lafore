package Algorithms.FifthPart.LinkQueue;

public class LinkQueue {
    private FirstLastList theList;
    //--------------------------------------------------------------
    public LinkQueue() // Конструктор
    { theList = new FirstLastList(); } // Создание 2-стороннего списка
    //--------------------------------------------------------------
    public boolean isEmpty() // true, если очередь пуста
    { return theList.isEmpty(); }
    //--------------------------------------------------------------
    public void insert(long j) // Вставка элемента в конец очереди
    { theList.insertLast(j); }
    //--------------------------------------------------------------
    public long remove() // Удаление элемента в начале очереди
    { return theList.deleteFirst(); }
    //--------------------------------------------------------------
    public void displayQueue()
    {
        System.out.print("Queue (front-->rear): ");
        theList.displayList();
    }
}
