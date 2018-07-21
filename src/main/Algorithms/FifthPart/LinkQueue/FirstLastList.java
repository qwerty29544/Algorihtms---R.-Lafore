package Algorithms.FifthPart.LinkQueue;

public class FirstLastList {
    private Link first; // Ссылка на первый элемент
    private Link last; // Ссылка на последний элемент
    // -------------------------------------------------------------
    public FirstLastList() // Конструктор
    {
        first = null; // Список пока не содержит элементов
        last = null;
    }
    // -------------------------------------------------------------
    public boolean isEmpty() // true, если список пуст
    { return first==null; }
    // -------------------------------------------------------------
    public void insertLast(long dd) // Вставка элемента в конец списка
    {
        Link newLink = new Link(dd); // Создание нового элемента
        if( isEmpty() ) // Если список пуст,
            first = newLink; // first --> newLink
        else
            last.next = newLink; // Старое значение last --> newLink
        last = newLink; // newLink <-- last
    }
    // -------------------------------------------------------------
    public long deleteFirst() // Удаление первого элемента
    { // (предполагается, что список не пуст)
        long temp = first.dData;
        if(first.next == null) // Сохранение ссылки
            last = null; // null <-- last
        first = first.next; // first --> старое значение next
        return temp;
    }
    // -------------------------------------------------------------
    public void displayList()
    {
        Link current = first; // От начала списка
        while(current != null) // Перемещение до конца списка
        {
            current.displayLink(); // Вывод данных
            current = current.next; // Переход к следующему элементу
        }
        System.out.println("");
    }
}
