package CalcPower;

import java.io.*;

public class CalcFunction {
    private static int x, y, z;

    public static void main (String agrs[]) throws IOException {
        powerFunc();
    }

    public static void powerFunc() throws IOException {
        System.out.print("Please enter x: " );
        x = getInt();
        System.out.println(" ");
        System.out.print("Please enter y: ");
        y = getInt();
        z = power(x,y);
        System.out.print("Result of power: " + z);
        System.out.println("");
    }

    private static int power(int xl, int yl) {
        if (yl == 1)
            return xl;
        return power(xl,yl/2)*power(xl,yl-(yl/2));
    }

    public static String getString() throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }

    public static int getInt() throws IOException
    {
        String s = getString();
        return Integer.parseInt(s);
    }
}
