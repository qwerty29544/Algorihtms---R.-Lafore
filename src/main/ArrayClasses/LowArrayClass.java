package ArrayClasses;

public class LowArrayClass {
    private long[] array;

    public LowArrayClass(int size) throws IllegalArgumentException, NegativeArraySizeException
    {
        array = new long[size];
    }

    public void setElem(int index, long value) throws IllegalArgumentException,ArrayIndexOutOfBoundsException,ArrayStoreException
    {
        array[index] = value;
    }

    public long getElem(int index) throws IllegalArgumentException
    { return array[index]; }

    public long[] getArray() throws NullPointerException {
        return array;
    }
}
