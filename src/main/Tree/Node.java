package Tree;

public class Node {
    protected int iData; // Data used as a key
    protected double dData; // Other data
    protected Node leftChild; // Left child of the node
    protected Node rightChild; // Right child of the node

    public void displayNode() throws NullPointerException // Output node
    {
        System.out.print('{');
        System.out.print(iData);
        System.out.print(", ");
        System.out.print(dData);
        System.out.print("} ");
    }

    public int getiData() throws NullPointerException {
        return iData;
    }

    public double getdData() throws NullPointerException {
        return dData;
    }

    public Node getLeftChild() throws NullPointerException {
        return leftChild;
    }

    public Node getRightChild() throws NullPointerException {
        return rightChild;
    }
}
