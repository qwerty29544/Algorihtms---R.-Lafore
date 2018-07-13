package Algorithms.FourthPart.StackReverser;

public class Reverser {
    private String input; // input string
    private String output; // output string
    //------------------------------------------------------------------------------------------------------
    public Reverser(String in) // Constructor
    {
        input = in; // argument statement
    }
    //------------------------------------------------------------------------------------------------------
    public String doRev() // reverse itself
    {
        int stackSize = input.length(); // Determining the size of an array of characters
        StackX theStack = new StackX(stackSize); // Constructor of the stack class with the size of an array

        for(int j = 0; j < stackSize; j++) // conditional loop
        {
            char ch = input.charAt(j); // Reading a character from an input stream
            theStack.push(ch); // Stacking
        }
        output = "";

        while (!theStack.isEmpty())
        {
            char ch = theStack.pop(); // Extracting a character from the stack
            output = output + ch; // Joining the output line
        }

        return output;
    }
}
