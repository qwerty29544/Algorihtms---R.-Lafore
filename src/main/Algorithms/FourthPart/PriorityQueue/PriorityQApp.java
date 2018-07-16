package Algorithms.FourthPart.PriorityQueue;

import java.io.IOException;

public class PriorityQApp {
    public static void main(String[] args) throws IOException
    {
        PriorityQ thePQ = new PriorityQ(5);
        thePQ.insert(30);
        thePQ.insert(50);
        thePQ.insert(10);
        thePQ.insert(40);
        thePQ.insert(20);
        while( !thePQ.isEmpty() )
        {
            long item = thePQ.remove();
            System.out.print(item + " "); // 10, 20, 30, 40, 50
        }
        System.out.println("");
    }
}
