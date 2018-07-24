package Algorithms.FifthPart.InterIterator;

public class Link {
    public long dData; // Данные
    public Link next; // Следующий элемент в списке
    // -------------------------------------------------------------
    public Link(long dd) // Конструктор
    { dData = dd; }
    // -------------------------------------------------------------
    public void displayLink() // Вывод содержимого элемента
    { System.out.print(dData + " "); }
}
