package Algorithms.SevenPart.QuickSort1;

public class QuickSort1App {
    public static void main(String[] args)
    {
        int maxSize = 16; // Размер массива
        ArrayIns arr;
        arr = new ArrayIns(maxSize); // Создание массива
        for(int j=0; j<maxSize; j++) // Заполнение массива
        { // случайными числами.
            long n = (int)(java.lang.Math.random()*99);
            arr.insert(n);
        }
        arr.display(); // Вывод элементов
        arr.quickSort(); // Быстрая сортировка
        arr.display(); // Повторный вывод элементов
    }
}
