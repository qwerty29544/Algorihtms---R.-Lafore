package Tree234;

public class Node {
    private static final int ORDER = 4;
    private int numItems;
    private Node parent;
    private Node childArray[] = new Node[ORDER];
    private DataItem itemArray[] = new DataItem[ORDER-1];

    // Binding a node to a child
    public void connectChild(int childNum, Node child) throws IllegalArgumentException, NullPointerException, NegativeArraySizeException, ArrayIndexOutOfBoundsException
    {
        childArray[childNum] = child;
        if(child != null)
            child.parent = this;
    }

    // The method detaches the child from the node and returns it
    public Node disconnectChild(int childNum) throws ArrayIndexOutOfBoundsException, NullPointerException, IllegalArgumentException, NegativeArraySizeException
    {
        Node tempNode = childArray[childNum];
        childArray[childNum] = null;
        return tempNode;
    }

    public Node getChild(int childNum) throws IllegalArgumentException, NullPointerException, NegativeArraySizeException, ArrayIndexOutOfBoundsException  //Getter
    { return childArray[childNum]; }

    public Node getParent() throws NullPointerException //Getter
    { return parent; }

    public boolean isLeaf() throws NullPointerException //is node leaf
    { return (childArray[0]==null) ? true : false; }

    public int getNumItems() throws NullPointerException //Getter
    { return numItems; }

    public DataItem getItem(int index) throws IllegalArgumentException, NullPointerException, NegativeArraySizeException, ArrayIndexOutOfBoundsException // Getter
    { return itemArray[index]; }

    public boolean isFull() throws NullPointerException
    { return (numItems==ORDER-1) ? true : false; }

    public int findItem(long key) throws NullPointerException, IllegalArgumentException // Define the element index
    { // (within the node)
        for(int j=0; j<ORDER-1; j++) // If the item is found
        { // Otherwise
            if(itemArray[j] == null) // Return -1
                break;
            else if(itemArray[j].dData == key)
                return j;
        }
        return -1;
    }

    public int insertItem(DataItem newItem) throws NullPointerException, IllegalArgumentException, ArrayIndexOutOfBoundsException
    {
        // Assume that the node is not empty
        numItems++; // Add a new item
        long newKey = newItem.dData; // The key of the new element
        for(int j=ORDER-2; j>=0; j--) // Starting from the right,
        { // check the elements
            if(itemArray[j] == null) // If the cell is empty,
                continue; // go one cell to the left
            else // If not,
            { // get her key
                long itsKey = itemArray[j].dData;
                if(newKey < itsKey) // If the new key is larger
                    itemArray[j+1] = itemArray[j]; // Move right
                else
                {
                    itemArray[j+1] = newItem; // Insert a new element
                    return j+1; // The method returns an index
                } // of the new element
            }
        } // All elements are shifted,
        itemArray[0] = newItem; // insert a new element
        return 0;
    }

    public DataItem removeItem() throws NullPointerException // Delete the largest element
    {
        // Assume that the node is not empty
        DataItem temp = itemArray[numItems-1]; // Save the item
        itemArray[numItems-1] = null; // Disconnection
        numItems--; // One element less
        return temp; // The method returns DELETED ELEMENT
    }

    public void displayNode() throws NullPointerException // Format "/24/56/74/"
    {
        for(int j=0; j<numItems; j++)
            itemArray[j].displayItem(); // "/56"
        System.out.println("/"); // Ending symbol "/"
    }

    public Node[] getChildArray() throws NullPointerException { // Getter
        return childArray;
    }

    public DataItem[] getItemArray() throws NullPointerException { // Getter
        return itemArray;
    }
}
