package Algos;

public class DataArrayClass {
    private DataClass[] a;
    private int nElems;

    public DataArrayClass(int max) throws IllegalArgumentException
    {
        try
        {
            a = new DataClass[max];
            nElems = 0;
        }
        catch (NegativeArraySizeException a)
        {
            System.out.print("Incorrect size, try to record an positive number");
        }
    }

    public DataClass find(String searchName) throws IllegalArgumentException
    {
        int j;
        for(j=0; j<nElems; j++)
            if( a[j].getLast().equals(searchName) )
                break;
        if(j == nElems)
            return null;
        else
            return a[j];
    } // end find()

    public void insert(String last, String first, int age) throws IllegalArgumentException
    {
        try {
            a[nElems] = new DataClass(last, first, age);
            nElems++;
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.print("Array index out of bounds, please try to delete some recordings");
        }
        catch (ArrayStoreException e1){
            System.out.print("The entry you want to register has the wrong type");
        }
    }

    public boolean delete(String searchName) throws IllegalArgumentException
    {
        int j;
        for(j=0; j<nElems; j++)
            if( a[j].getLast().equals(searchName) )
                break;
        if(j==nElems)
            return false;
        else
        {
            for(int k=j; k<nElems; k++)
                a[k] = a[k+1];
            nElems--;
            return true;
        }
    }

    public void displayA()
    {
        for(int j=0; j<nElems; j++)
            a[j].displayPerson();
    }
}
