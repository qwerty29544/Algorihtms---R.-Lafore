package Algorithms.SevenPart.Partition;

public class ArrayPar {
    private long[] theArray; // Ссылка на массив
    private int nElems; // Количество элементов
    //--------------------------------------------------------------
    public ArrayPar(int max) // Конструктор
    {
        theArray = new long[max]; // Создание массива
        nElems = 0; // Пока нет ни одного элемента
    }
    //--------------------------------------------------------------
    public void insert(long value) // Вставка элемента в массив
    {
        theArray[nElems] = value; // Собственно вставка
        nElems++; // Увеличение размера
    }
    //--------------------------------------------------------------
    public int size() // Получение количества элементов
    { return nElems; }
    //--------------------------------------------------------------
    public void display() // Вывод содержимого массива
    {
        System.out.print("A=");
        for(int j=0; j<nElems; j++) // Для каждого элемента
            System.out.print(theArray[j] + " "); // Вывод
        System.out.println("");
    }
    //--------------------------------------------------------------
    public int partitionIt(int left, int right, long pivot)
    {
    int leftPtr = left - 1; // Справа от первого элемента
    int rightPtr = right + 1; // Слева от опорного элемента
    while(true)
    {
        while(leftPtr < right && // Поиск большего элемента
                theArray[++leftPtr] < pivot)
            ; // (пустое тело цикла)

        while(rightPtr > left && // Поиск меньшего элемента
                theArray[--rightPtr] > pivot)
            ; // (пустое тело цикла)
        if(leftPtr >= rightPtr) // Если указатели сошлись,
            break; // разбиение закончено
        else // В противном случае
            swap(leftPtr, rightPtr); // поменять элементы местами
    }
    return leftPtr; // Позиция разбиения
    }
    //--------------------------------------------------------------
    public void swap(int dex1, int dex2) // Перестановка двух элементов
    {
        long temp;
        temp = theArray[dex1]; // A копируется в temp
        theArray[dex1] = theArray[dex2]; // B копируется в A
        theArray[dex2] = temp; // temp копируется в B
    }
}
