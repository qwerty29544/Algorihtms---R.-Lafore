package Algorithms.FifthPart.InterIterator;

public class ListIterator {
    private Link current; // Текущий элемент списка
    private Link previous; // Предыдущий элемент списка
    private LinkList ourList; // Связанный список
    //--------------------------------------------------------------
    public ListIterator(LinkList list) // Конструктор
    {
        ourList = list;
        reset();
    }
    //--------------------------------------------------------------
    public void reset() // Возврат к 'first'
    {
        current = ourList.getFirst();
        previous = null;
    }
    //--------------------------------------------------------------
    public boolean atEnd() // true, если текущим является
    { return (current.next==null); } // последний элемент
    //--------------------------------------------------------------
    public void nextLink() // Переход к следующему элементу
    {
        previous = current;
        current = current.next;
    }
    //--------------------------------------------------------------
    public Link getCurrent() // Получение текущего элемента
    { return current; }
    //--------------------------------------------------------------
    public void insertAfter(long dd) // Вставка после
    { // текущего элемента
        Link newLink = new Link(dd);
        if( ourList.isEmpty() ) // Пустой список
        {
            ourList.setFirst(newLink);
            current = newLink;
        }
        else // Список не пуст
        {
            newLink.next = current.next;
            current.next = newLink;
            nextLink(); // Переход к новому элементу
        }
    }
    //--------------------------------------------------------------
    public void insertBefore(long dd) // Вставка перед
    { // текущим элементом
        Link newLink = new Link(dd);
        if(previous == null) // В начале списка
        { // (или пустой список)
            newLink.next = ourList.getFirst();
            ourList.setFirst(newLink);
            reset();
        }
        else // Не в начале списка
        {
            newLink.next = previous.next;
            previous.next = newLink;
            current = newLink;
        }
    }
    //--------------------------------------------------------------
    public long deleteCurrent() // Удаление текущего элемента
    {
        long value = current.dData;
        if(previous == null) // Если в начале списка
        {
            ourList.setFirst(current.next);
            reset();
        }
        else // Не в начале списка
        {
            previous.next = current.next;
            if( atEnd() )
                reset();
            else
                current = current.next;
        }
        return value;
    }
}
