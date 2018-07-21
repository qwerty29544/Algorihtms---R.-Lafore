package Algorithms.FifthPart.ListInsertionSort;

public class SortedList {
    private Link first; // Ссылка на первый элемент списка
    // -------------------------------------------------------------
    public SortedList() // Конструктор (без аргументов)
    { first = null; } // Инициализация списка
    // -------------------------------------------------------------
    public SortedList(Link[] linkArr) // Конструктор (аргумент - массив)
    { //
        first = null; // Инициализация списка
        for(int j=0; j<linkArr.length; j++) // Копирование массива
            insert( linkArr[j] ); // в список
    }
    // -------------------------------------------------------------
    public void insert(Link k) // Вставка (в порядке сортировки)
    {
        Link previous = null; // От начала списка
        Link current = first;
        // До конца списка
        while(current != null && k.dData > current.dData)
        { // или если ключ > current,
            previous = current;
            current = current.next; // Перейти к следующему элементу
        }
        if(previous==null) // В начале списка
            first = k; // first --> k
        else // Не в начале
            previous.next = k; // старое значение prev --> k
        k.next = current; // k --> старое значение current
    }
    // -------------------------------------------------------------
    public Link remove() // Возвращает и удаляет первую ссылку
    { // (assumes non-empty list)
        Link temp = first; // Сохранение ссылки
        first = first.next; // Удаление первого элемента
        return temp; // Метод возвращает ссылку
    } // на удаленный элемент
    // -------------------------------------------------------------
}
