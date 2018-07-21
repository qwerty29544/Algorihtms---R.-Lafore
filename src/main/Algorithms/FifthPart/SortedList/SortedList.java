package Algorithms.FifthPart.SortedList;

public class SortedList {
    private Link first; // Ссылка на первый элемент списка
    // -------------------------------------------------------------
    public SortedList() // Конструктор
    { first = null; }
    // -------------------------------------------------------------
    public boolean isEmpty() // true, если список пуст
    { return (first==null); }
    // -------------------------------------------------------------
    public void insert(long key) // Вставка в порядке сортировки
    {
        Link newLink = new Link(key); // Создание нового элемента
        Link previous = null; // От начала списка
        Link current = first;
        // До конца списка
        while(current != null && key > current.dData)
        { // или если key > current,
            previous = current;
            current = current.next; // Перейти к следующему элементу
        }
        if(previous==null) // В начале списка
            first = newLink; // first --> newLink
        else // Не в начале
            previous.next = newLink; // старое значение prev --> newLink
        newLink.next = current; // newLink --> старое значение current
    }
    // -------------------------------------------------------------
    public Link remove() // Удаление первого элемента
    { // (предполагается, что список не пуст)
        Link temp = first; // Сохранение ссылки
        first = first.next; // Удаление: first-->ссылка на второй элемент
        return temp; // Метод возвращает ссылку
    } // на удаленный элемент
    // -------------------------------------------------------------
    public void displayList()
    {
        System.out.print("List (first-->last): ");
        Link current = first; // От начала списка
        while(current != null) // Перемещение до конца списка
        {
            current.displayLink(); // Вывод данных
            current = current.next; // Переход к следующему элементу
        }
        System.out.println("");
    }
}
