package Algorithms.FifthPart.LinkQueue;

public class LinkQueueApp {
    public static void main(String[] args) {
        LinkQueue theQueue = new LinkQueue();
        theQueue.insert(20); // Вставка элементов
        theQueue.insert(40);
        theQueue.displayQueue(); // Вывод содержимого очереди
        theQueue.insert(60); // Вставка элементов
        theQueue.insert(80);
        theQueue.displayQueue(); // Вывод содержимого очереди
        theQueue.remove(); // Удаление элементов
        theQueue.remove();
        theQueue.displayQueue(); // Вывод содержимого очереди
    }
}
