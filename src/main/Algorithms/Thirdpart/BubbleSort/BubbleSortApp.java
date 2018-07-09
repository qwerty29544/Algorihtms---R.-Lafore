package Algorithms.Thirdpart.BubbleSort;

public class BubbleSortApp {
    public static void main(String[] args)
    {
        int maxSize = 100; // Размер массива
        ArrayBub arr; // Ссылка на массив
        arr = new ArrayBub(maxSize); // Создание массива
        arr.insert(77); // Вставка 10 элементов
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(00);
        arr.insert(66);
        arr.insert(33);
        arr.display(); // Вывод элементов
        arr.bubbleSort(); // Пузырьковая сортировка элементов
        arr.display(); // Повторный вывод
    }
}
