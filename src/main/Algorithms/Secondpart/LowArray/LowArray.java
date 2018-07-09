package Algorithms.Secondpart.LowArray;

public class LowArray {
    private long[] a; // Ссылка на массив a

    public LowArray(int size) // Конструктор
    { a = new long[size]; } // Создание массива

    public void setElem(int index, long value) // Запись элемента
    { a[index] = value; }

    public long getElem(int index) // Чтение элемента
    { return a[index]; }
}
