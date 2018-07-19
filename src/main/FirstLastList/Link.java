package FirstLastList;

public class Link {
    public long dData; // Данные
    public Link next; // Следующий элемент в списке

    public Link(long d) throws IllegalArgumentException // Конструктор
    { dData = d; }

    public void displayLink() throws NullPointerException // Вывод содержимого элемента
    { System.out.print(dData + " "); }

    public long getdData() throws NullPointerException {
        return dData;
    }

    public Link getNext() throws NullPointerException {
        return next;
    }
}
