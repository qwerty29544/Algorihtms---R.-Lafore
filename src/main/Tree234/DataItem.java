package Tree234;

public class DataItem {
    public long dData; // One data object

    public DataItem(long dd) throws IllegalArgumentException, NullPointerException // Constructor
    { dData = dd; }

    public void displayItem() throws NullPointerException // Output of the element in the format "/27"
    { System.out.print("/"+dData); }

    public long getdData() throws NullPointerException { // Getter
        return dData;
    }
}
