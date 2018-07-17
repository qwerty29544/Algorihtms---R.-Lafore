package ArrayClasses;

public class DataArrayClass {
    private DataClass[] classArray;
    private int nElems;

    public DataArrayClass(int max) throws IllegalArgumentException, NegativeArraySizeException
    {

        classArray = new DataClass[max];
        nElems = 0;
    }

    public DataClass find(String searchName) throws IllegalArgumentException
    {
        int j;
        for(j=0; j<nElems; j++)
            if( classArray[j].getLast().equals(searchName) )
                break;
        if(j == nElems)
            return null;
        else
            return classArray[j];
    } // end find()

    public void insert(String last, String first, int age) throws IllegalArgumentException, ArrayStoreException, ArrayIndexOutOfBoundsException
    {
            classArray[nElems] = new DataClass(last, first, age);
            nElems++;
    }

    public boolean delete(String searchName) throws IllegalArgumentException
    {
        int j;
        for(j=0; j<nElems; j++)
            if( classArray[j].getLast().equals(searchName) )
                break;
        if(j==nElems)
            return false;
        else
        {
            for(int k=j; k<nElems; k++)
                classArray[k] = classArray[k+1];
            nElems--;
            return true;
        }
    }

    public void displayA()
    {
        for(int j=0; j<nElems; j++)
            classArray[j].displayPerson();
    }

    public DataClass[] getClassArray() {
        return classArray;
    }

    public int getnElems() {
        return nElems;
    }
}
