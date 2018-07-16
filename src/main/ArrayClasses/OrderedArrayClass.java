package ArrayClasses;

public class OrderedArrayClass {
    private long[] array; // Array main data recording type
    private int nElems; // Array size

    public OrderedArrayClass(int max) throws IllegalArgumentException
    {
        try
        {
            array = new long[max];
            nElems = 0;
        }
        catch (NegativeArraySizeException a)
        {
            System.out.print("Incorrect size, try to record an positive number");
        }
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

    public void insert(long value) throws IllegalArgumentException
    {
        try {
            int j;
            for (j = 0; j < nElems; j++)
                if (array[j] > value)
                    break;
            for (int k = nElems; k > j; k--)
                array[k] = array[k - 1];
            array[j] = value;
            nElems++;
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.print("Array index out of bounds, please try to delete some recordings");
        }
        catch (ArrayStoreException e1){
            System.out.print("The entry you want to register has the wrong type");
        }
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
