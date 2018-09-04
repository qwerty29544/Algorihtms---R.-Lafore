package Tree234;

public class Tree234 {
    private Node root = new Node(); // Create the root node

    public int find(long key) throws NullPointerException, IllegalArgumentException
    {
        Node curNode = root;
        int childNumber;
        while(true)
        {
            if(( childNumber=curNode.findItem(key) ) != -1)
                return childNumber; // Node found
            else if( curNode.isLeaf() )
                return -1; // Node not found
            else // Search deeper
                curNode = getNextChild(curNode, key);
        }
    }

    // Insert the data item
    public void insert(long dValue) throws IllegalArgumentException, NullPointerException, ArrayIndexOutOfBoundsException
    {
        Node curNode = root;
        DataItem tempItem = new DataItem(dValue);
        while(true)
        {
            if( curNode.isFull() ) // If the node is full,
            {
                split(curNode); // it breaks.
                curNode = curNode.getParent(); // Return a level higher
                // Search
                curNode = getNextChild(curNode, dValue);
            }
            else if( curNode.isLeaf() ) // If the node is leafy,
                break; // go to the insertion
                // Node not full and not leafy; go down below level
            else
                curNode = getNextChild(curNode, dValue);
        }
        curNode.insertItem(tempItem); // Insert a new DataItem object
    }

    public void split(Node thisNode) throws NullPointerException, IllegalArgumentException // Separate the node
    {
        // Assume that the node is full
        DataItem itemB, itemC;
        Node parent, child2, child3;
        int itemIndex;
        itemC = thisNode.removeItem(); // Removing items from current node
        itemB = thisNode.removeItem();
        child2 = thisNode.disconnectChild(2); // Disconnect the children from the current node
        child3 = thisNode.disconnectChild(3);
        Node newRight = new Node(); // Create a new node
        if(thisNode==root) // If the node is the root, creating a new root
        {
            root = new Node();
            parent = root; // The root becomes the parent
            root.connectChild(0, thisNode); // Binding to the parent
        }
        else // The current node is not a root
            parent = thisNode.getParent(); // Get the parent
        // We deal with the parent
        itemIndex = parent.insertItem(itemB); // B inserted into the parent
        int n = parent.getNumItems(); // Total elements?
        for(int j=n-1; j>itemIndex; j--) // Move parent's links
        {
            Node temp = parent.disconnectChild(j); // On one descendant to the right
            parent.connectChild(j+1, temp);
        }
        // Bind a newRight to the parent
        parent.connectChild(itemIndex+1, newRight);
        // Understand with the newRight node
        newRight.insertItem(itemC); // Элемент C в newRight
        newRight.connectChild(0, child2); // Binding 0 and 1 with newRight
        newRight.connectChild(1, child3);
    }

    // Get the corresponding child when searching for a value
    public Node getNextChild(Node theNode, long theValue) throws IllegalArgumentException, NullPointerException
    {
        int j;
        // Assume that the node is not empty, is not full, and is not a leaf
        int numItems = theNode.getNumItems();
        for(j=0; j<numItems; j++) // for each element in the Node
        { // Our value is less?
            if( theValue < theNode.getItem(j).dData )
                return theNode.getChild(j); // Return the left child
        } // Our value is greater,
        return theNode.getChild(j); // Return the right child
    }

    public void displayTree() // Display the whole tree in format /
    {
        recDisplayTree(root, 0, 0);
    }

    private void recDisplayTree(Node thisNode, int level,
                                int childNumber) throws NullPointerException, IllegalArgumentException
    {
        System.out.print("level="+level+" child="+childNumber+" ");
        thisNode.displayNode(); // Output the contents of a node
        // A recursive call for each child of the current node
        int numItems = thisNode.getNumItems();
        for(int j=0; j<numItems+1; j++)
        {
            Node nextNode = thisNode.getChild(j);
            if(nextNode != null)
                recDisplayTree(nextNode, level+1, j);
            else
                return;
        }
    }

    public Node getRoot() throws NullPointerException { // Getter
        return root;
    }
}
