package Algorithms.SevenPart.QuickSort3;

public class ArrayIns {
    private long[] theArray; // Ссылка на массив
    private int nElems; // Количество элементов
    //--------------------------------------------------------------
    public ArrayIns(int max) // Конструктор
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
    public void display() // Вывод содержимого массива
    {
        System.out.print("A=");
        for(int j=0; j<nElems; j++) // Для каждого элемента
            System.out.print(theArray[j] + " "); // Вывод
        System.out.println("");
    }
    //--------------------------------------------------------------
    public void quickSort()
    {
        recQuickSort(0, nElems-1);
        // insertionSort(0, nElems-1); // Другой вариант
    }
    //--------------------------------------------------------------
    public void recQuickSort(int left, int right)
    {
        int size = right-left+1;
        if(size < 10) // Сортировка методом вставки
            insertionSort(left, right); // при малом размере
        else // Быстрая сортировка
        { // при большом размере
            long median = medianOf3(left, right);
            int partition = partitionIt(left, right, median);
            recQuickSort(left, partition-1);
            recQuickSort(partition+1, right);
        }
    }
    //--------------------------------------------------------------
    public long medianOf3(int left, int right)
    {
        int center = (left+right)/2;
        // Упорядочение left и center
        if( theArray[left] > theArray[center] )
            swap(left, center);
        // Упорядочение left и right
        if( theArray[left] > theArray[right] )
            swap(left, right);
        // Упорядочение center и right
        if( theArray[center] > theArray[right] )
            swap(center, right);
        swap(center, right-1); // Размещение медианы на правом краю
        return theArray[right-1]; // Метод возвращает медиану
    }
    //--------------------------------------------------------------
    public void swap(int dex1, int dex2) // Перестановка двух элементов
    {
        long temp = theArray[dex1]; // A копируется в temp
        theArray[dex1] = theArray[dex2]; // B копируется в A
        theArray[dex2] = temp; // temp копируется в B
    }
    //--------------------------------------------------------------
    public int partitionIt(int left, int right, long pivot)
    {
        int leftPtr = left; // Справа от первого элемента
        int rightPtr = right - 1; // Слева от опорного элемента
        while(true)
        {
            while( theArray[++leftPtr] < pivot ) // Поиск большего элемента
                ; // (пустое тело цикла)
            while( theArray[--rightPtr] > pivot ) // Поиск меньшего элемента
                ; // (пустое тело цикла)
            if(leftPtr >= rightPtr) // Если указатели сошлись,
                break; // разбиение закончено
            else // В противном случае
                swap(leftPtr, rightPtr); // Поменять элементы местами
        }
        swap(leftPtr, right-1); // Восстановление опорного элемента
        return leftPtr; // Позиция разбиения
    }
    //--------------------------------------------------------------
    // Сортировка методом вставки
    public void insertionSort(int left, int right)
    {
        int in, out;
        // Сортировка слева от out
        for(out=left+1; out<=right; out++)
        {
            long temp = theArray[out]; // Скопировать помеченный элемент
            in = out; // Начать перемещения с out
            // Пока не найден меньший элемент
            while(in>left && theArray[in-1] >= temp)
            {
                theArray[in] = theArray[in-1]; // Сдвинуть элемент вправо
                --in; // Перейти на одну позицию влево
            }
            theArray[in] = temp; // Вставить помеченный элемент
        }
    }
}
