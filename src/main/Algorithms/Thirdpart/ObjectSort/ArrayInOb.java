package Algorithms.Thirdpart.ObjectSort;

public class ArrayInOb {
    private Person[] a; // Ссылка на массив a
    private int nElems; // Количество элементов данных
    //--------------------------------------------------------------
    public ArrayInOb(int max) // Конструктор
    {
        a = new Person[max]; // Создание массива
        nElems = 0; // Пока нет ни одного элемента
    }
    //--------------------------------------------------------------
    // Включение записи в массив
    public void insert(String last, String first, int age)
    {
        a[nElems] = new Person(last, first, age);
        nElems++; // Увеличение размера
    }
    //--------------------------------------------------------------
    public void display() // Вывод содержимого массива
    {
        for(int j=0; j<nElems; j++) // Для каждого элемента
            a[j].displayPerson(); // Вывод
        System.out.println("");
    }
    //--------------------------------------------------------------
    public void insertionSort()
    {
        int in, out;
        for(out=1; out<nElems; out++) // out - разделительный маркер
        {
            Person temp = a[out]; // Скопировать помеченный элемент
            in = out; // Начать перемещения с out
            while(in>0 && // Пока не найден меньший элемент
                    a[in-1].getLast().compareTo(temp.getLast())>0)
            {
                a[in] = a[in-1]; // Сдвинуть элемент вправо
                --in; // Перейти на одну позицию влево
            }
            a[in] = temp; // Вставить помеченный элемент
        }
    }
}
