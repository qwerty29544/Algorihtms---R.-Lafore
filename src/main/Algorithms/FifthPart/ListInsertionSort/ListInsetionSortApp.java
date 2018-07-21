package Algorithms.FifthPart.ListInsertionSort;

public class ListInsetionSortApp {
    public static void main(String[] args)
    {
        int size = 10;
        // Создание массива
        Link[] linkArray = new Link[size];
        for(int j=0; j<size; j++) // Заполнение массива
        { // Случайные числа
            int n = (int)(java.lang.Math.random()*99);
            Link newLink = new Link(n); // Создание элемента
            linkArray[j] = newLink; // Сохранение в массиве
        }
        // Вывод содержимого массива
        System.out.print("Unsorted array: ");
        for(int j=0; j<size; j++)
            System.out.print( linkArray[j].dData + " " );
        System.out.println("");
        // Создание нового списка,
        // инициализированного содержимым массива
        SortedList theSortedList = new SortedList(linkArray);
        for(int j=0; j<size; j++) // links from list to array
            linkArray[j] = theSortedList.remove();
        // Вывод содержимого массива
        System.out.print("Sorted Array: ");
        for(int j=0; j<size; j++)
            System.out.print(linkArray[j].dData + " ");
        System.out.println("");
    }
}
