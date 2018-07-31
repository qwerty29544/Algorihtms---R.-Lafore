package Algorithms.SixPart.StackTriangle2;

import java.io.*;

public class StackTriangle2App {
    static int theNumber;
    static int theAnswer;
    static StackX theStack;
    public static void main(String[] args) throws IOException
    {
        System.out.print("Enter a number: ");
        theNumber = getInt();
        stackTriangle();
        System.out.println("Triangle="+theAnswer);
    }
    //-------------------------------------------------------------
    public static void stackTriangle()
    {
        theStack = new StackX(10000); // Создание стека
        theAnswer = 0; // Инициализация ответа
        while(theNumber > 0) // Пока счетчик не уменьшится до 1
        {
            theStack.push(theNumber); // Занесение элемента в стек
            --theNumber; // Уменьшение счетчика
        }
        while( !theStack.isEmpty() ) // Пока в стеке остаются элементы
        {
            int newN = theStack.pop(); // Извлечение значения
            theAnswer += newN; // Суммирование с ответом
        }
    }
    //-------------------------------------------------------------
    public static String getString() throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }
    //-------------------------------------------------------------
    public static int getInt() throws IOException
    {
        String s = getString();
        return Integer.parseInt(s);
    }
}
