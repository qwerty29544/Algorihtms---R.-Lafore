package ArrayClasses;

public class OrderedArrayClass {
    private long[] array; // Array main data recording type
    private int nElems; // Array size

    public OrderedArrayClass(int max) throws IllegalArgumentException, NegativeArraySizeException
    {
        array = new long[max];
        nElems = 0;
    }

    public int size()
    { return nElems; }

    public int find(long searchKey) throws IllegalArgumentException
    {
        int lowerBound = 0;
        int upperBound = nElems-1;
        int curIn;
        while(true)
        {
            curIn = (lowerBound + upperBound ) / 2;
            if(array[curIn]==searchKey)
                return curIn;
            else if(lowerBound > upperBound)
                return nElems;
            else
            {
                if(array[curIn] < searchKey)
                    lowerBound = curIn + 1;
                else
                    upperBound = curIn - 1;
            }
        }
    }

    public void insert(long value) throws IllegalArgumentException, ArrayIndexOutOfBoundsException, ArrayStoreException
    {
        int j;
        for (j = 0; j < nElems; j++)
            if (array[j] > value)
                break;
        for (int k = nElems; k > j; k--)
            array[k] = array[k - 1];
        array[j] = value;
        nElems++;
    }

    public boolean delete(long value) throws IllegalArgumentException
    {
        int j = find(value);
        if(j==nElems)
            return false;
        else
        {
            for(int k=j; k<nElems; k++)
                array[k] = array[k+1];
            nElems--;
            return true;
        }
    }

    public void display()
    {
        for(int j=0; j<nElems; j++)
            System.out.print(array[j] + " ");
        System.out.println("");
    }

    public long[] getArray() {
        return array;
    }

    public int getnElems() {
        return nElems;
    }
}
