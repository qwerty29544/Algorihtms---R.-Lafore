package ArrayClasses;

public class LowArrayClass {
    private long[] array;

    public LowArrayClass(int size) throws IllegalArgumentException
    {
        try {
            array = new long[size];
        }
        catch (NegativeArraySizeException a)
        {
            System.out.print("Incorrect size, try to record an positive number");
        }
    }

    public void setElem(int index, long value) throws IllegalArgumentException
    {
        try{
        array[index] = value;
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.print("Array index out of bounds, please try to delete some recordings");
        }
        catch (ArrayStoreException e1){
            System.out.print("The entry you want to register has the wrong type");
        }
    }

    public long getElem(int index) throws IllegalArgumentException
    { return array[index]; }

    public long[] getArray() {
        return array;
    }
}
