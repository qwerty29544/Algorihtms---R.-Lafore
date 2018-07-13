package Algorithms.FourthPart.StackReverser;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverserAPP {
    public static void main(String[] args) throws IOException
    {
        String input, output;
        while(true)
        {
            System.out.print("Enter a string: ");
            System.out.flush();
            input = getString(); // Reading a string from the keyboard
            if( input.equals("") ) // Completion, if [Enter]
                break;
            // Creating an object Reverser
            Reverser theReverser = new Reverser(input);
            output = theReverser.doRev(); // Using doRev
            System.out.println("Reversed: " + output);
        }
    }
    //--------------------------------------------------------------
    public static String getString() throws IOException //get string from keyboard class
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }
}
