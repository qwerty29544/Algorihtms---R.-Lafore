package Algorithms.FourthPart.StackBracketeer;

public class BracketChecker {
    private String input; // input string

    public BracketChecker(String in){ // Constructor
        input = in;
    }

    public void check(){ // check itself
        int stackSize = input.length();
        StackX theStack = new StackX(stackSize);

        for(int j = 0; j < input.length(); j++){
            char ch = input.charAt(j);
            switch (ch) {
                case '{': //opening brackets
                case '[':
                case '(':
                    theStack.push(ch);
                    break;
                case '}': //closing brackets
                case ']':
                case ')':
                    if (!theStack.isEmpty()) { //if stack isn't empty
                        char chx = theStack.pop(); // the last element from stack
                        if ((ch == '}') && (chx != '}') || (ch == ']') && (chx != '[') || (ch == ')') && (chx != '('))
                            System.out.println("Error: " + ch + " at " + j);
                    } else // Premature shortage of elements
                        System.out.println("Error: " + ch + " at " + j);
                    break;
                default:
                    break;
            }
        } // At this point all the characters are processed
        if( !theStack.isEmpty() )
            System.out.println("Error: missing right delimiter");
    }
}
