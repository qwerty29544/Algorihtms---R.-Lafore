package Algorithms.SixPart.BinarySearch;

public class ordArray {
    private long[] a; // Ссылка на массив a
    private int nElems; // number of data items
    //-----------------------------------------------------------
    public ordArray(int max) // Конструктор
    {
        a = new long[max]; // Создание массива
        nElems = 0;
    }
    //-----------------------------------------------------------
    public int size()
    { return nElems; }
    //-----------------------------------------------------------
    public int find(long searchKey)
    {
        return recFind(searchKey, 0, nElems-1);
    }
    //-----------------------------------------------------------
    private int recFind(long searchKey, int lowerBound,
                        int upperBound)
    {
        int curIn;
        curIn = (lowerBound + upperBound ) / 2;
        if(a[curIn]==searchKey)
            return curIn; // Элемент найден
        else if(lowerBound > upperBound)
            return nElems; // Элемент не найден
        else // Деление диапазона
        {
            if(a[curIn] < searchKey) // В верхней половине
                return recFind(searchKey, curIn+1, upperBound);
            else // В нижней половине
                return recFind(searchKey, lowerBound, curIn-1);
        }
    }
    //-----------------------------------------------------------
    public void insert(long value) // Сохранение элемента в массиве
    {
        int j;
        for(j=0; j<nElems; j++) // Определение позиции
            if(a[j] > value) // (линейный поиск)
                break;
        for(int k=nElems; k>j; k--) // Перемещение элементов
            a[k] = a[k-1]; // с большим значением ключа
        a[j] = value; // Вставка
        nElems++; // Увеличение размера
    }
    //-----------------------------------------------------------
    public void display() // Вывод содержимого массива
    {
        for(int j=0; j<nElems; j++) // Для каждого элемента
            System.out.print(a[j] + " "); // Вывод текущего элемента
        System.out.println("");
    }
}
