package Algorithms.FifthPart.SortedList;

public class Link {
    public long dData; // Данные
    public Link next; // Ссылка на следующий элемент списка
    // -------------------------------------------------------------
    public Link(long dd) // Конструктор
    { dData = dd; }
    // -------------------------------------------------------------
    public void displayLink() // Вывод содержимого элемента
    { System.out.print(dData + " "); }
}
