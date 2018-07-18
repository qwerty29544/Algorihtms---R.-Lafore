package LinkedLists;

public class LinkList {
    private Link first; // Link to the first element of the list

    public LinkList() // Constructor
    {
        first = null; // The list does not yet contain elements
    }

    public boolean isEmpty() // true if the list is empty
    {
        return (first==null);
    }

//
    public void insertFirst(int id, double dd)
    { // Создание нового элемента
        Link newLink = new Link(id, dd);
        newLink.next = first; // newLink --> старое значение first
        first = newLink; // first --> newLink
    }

    public Link deleteFirst() // Удаление первого элемента
    { // (предполагается, что список не пуст)
        Link temp = first; // Сохранение ссылки
        first = first.next; // Удаление: first-->ссылка на второй элемент
        return temp; // Метод возвращает ссылку
    } // на удаленный элемент

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
