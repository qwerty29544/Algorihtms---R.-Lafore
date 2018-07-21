package Algorithms.FifthPart.SortedList;

public class SortedListApp {
    public static void main(String[] args)
    { // Создание нового списка
        SortedList theSortedList = new SortedList();
        theSortedList.insert(20); // Вставка двух элементов
        theSortedList.insert(40);
        theSortedList.displayList(); // Вывод содержимого списка
        theSortedList.insert(10); // Вставка трех элементов
        theSortedList.insert(30);
        theSortedList.insert(50);
        theSortedList.displayList(); // Вывод содержимого списка
        theSortedList.remove(); // Удаление элемента
        theSortedList.displayList(); // Вывод содержимого списка
    }
}
