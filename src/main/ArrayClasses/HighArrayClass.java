package ArrayClasses;

public class HighArrayClass {
    private long[] array;
    private int nElems;

    public HighArrayClass(int max) throws IllegalArgumentException, NegativeArraySizeException
    {
        array = new long[max];
        nElems = 0;
    }

    public boolean find(long searchKey) throws IllegalArgumentException
    {
        int j;
        for(j=0; j<nElems; j++)
            if(array[j] == searchKey)
                break;
        if(j == nElems)
            return false;
        else
            return true;
    }

    public void insert(long value) throws IllegalArgumentException, ArrayIndexOutOfBoundsException, ArrayStoreException
    {
        array[nElems] = value;
        nElems++;
    }

    public boolean delete(long value) throws IllegalArgumentException
    {
        int j;
        for(j=0; j<nElems; j++)
            if( value == array[j] )
                break;
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
