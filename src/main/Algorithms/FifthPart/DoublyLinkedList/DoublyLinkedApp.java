package Algorithms.FifthPart.DoublyLinkedList;

public class DoublyLinkedApp {
    public static void main(String[] args)
    { // Создание нового списка
        DoublyLinkedList theList = new DoublyLinkedList();
        theList.insertFirst(22); // Вставка в начале
        theList.insertFirst(44);
        theList.insertFirst(66);
        theList.insertLast(11); // Вставка в конце
        theList.insertLast(33);
        theList.insertLast(55);
        theList.displayForward(); // Вывод в прямом направлении
        theList.displayBackward(); // Вывод в обратном направлении
        theList.deleteFirst(); // Удаление первого элемента
        theList.deleteLast(); // Удаление последнего элемента
        theList.deleteKey(11); // Удаление элемента с ключом 11
        theList.displayForward(); // Вывод в прямом направлении
        theList.insertAfter(22, 77); // Вставка 77 после 22
        theList.insertAfter(33, 88); // Вставка 88 после 33
        theList.displayForward(); // Вывод в прямом направлении
    }
}
