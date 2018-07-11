package Algorithms.Thirdpart.InsertSort;

public class ArrayIns {
        private long[] a; // Ссылка на массив a
        private int nElems; // Количество элементов данных
        //--------------------------------------------------------------
        public ArrayIns(int max) // Конструктор
        {
            a = new long[max]; // Создание массива
            nElems = 0; // Пока нет ни одного элемента
        }
        //--------------------------------------------------------------
        public void insert(long value) // Вставка элемента в массив
        {
            a[nElems] = value; // Собственно вставка
            nElems++; // Увеличение размера
        }
        //--------------------------------------------------------------
        public void display() // Вывод содержимого массива
        {
            for(int j=0; j<nElems; j++) // Для каждого элемента
                System.out.print(a[j] + " "); // Вывод
            System.out.println("");
        }
        //--------------------------------------------------------------
        public void insertionSort()
        {
            int in, out;
            for(out=1; out<nElems; out++) // out - разделительный маркер
            {
                long temp = a[out]; // Скопировать помеченный элемент
                in = out; // Начать перемещения с out
                while(in>0 && a[in-1] >= temp) // Пока не найден меньший элемент
                {
                    a[in] = a[in-1]; // Сдвинуть элемент вправо
                    --in; // Перейти на одну позицию влево
                }
                a[in] = temp; // Вставить помеченный элемент
            }
        }
}
