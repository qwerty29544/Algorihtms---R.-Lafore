package Algorithms.FourthPart.InfixToPostfix;

import java.io.*;

public class InfixApp {
    public static void main(String[] args) throws IOException
    {
        String input, output;
        while(true)
        {
            System.out.print("Enter infix: ");
            System.out.flush();
            input = getString(); // Чтение строки с клавиатуры
            if( input.equals("") ) // Выход, если нажата клавиша [Enter]
                break;
            // Создание объекта-преобразователя
            InToPost theTrans = new InToPost(input);
            output = theTrans.doTrans(); // Преобразование
            System.out.println("Postfix is " + output + '\n');
        }
    }
    //--------------------------------------------------------------
    public static String getString() throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }
}
