package RBTree;

public class RBNode {
    private int idData;
    private long dData;
    private RBNode leftChild;
    private RBNode rightChild;
    private boolean isRed;
    private boolean deleted;

    public RBNode() {
        this.isRed = true;
        this.deleted = false;
    }

    public RBNode(int id, long dd) throws IllegalArgumentException {
        this.idData = id;
        this.dData = dd;
        this.isRed = true;
        this.leftChild = null;
        this.rightChild = null;
        this.deleted = false;
    }

    public void display() throws NullPointerException {
        if (!this.deleted) {
            if (this.isRed)
                System.out.println("R"+this.idData + " ");
            if (!this.isRed)
                System.out.println("B"+this.idData + " ");
        }
    }

    public boolean getDeleted() throws NullPointerException {
        return deleted;
    }

    public int getIdData() throws NullPointerException {
        return idData;
    }

    public long getdData() throws NullPointerException {
        return dData;
    }

    public RBNode getLeftChild() throws NullPointerException {
        return leftChild;
    }

    public RBNode getRightChild() throws NullPointerException {
        return rightChild;
    }

    public boolean isRed() throws NullPointerException {
        return isRed;
    }

    public void setIdData(int idData) throws IllegalArgumentException, NullPointerException {
        this.idData = idData;
    }

    public void setdData(long dData) throws IllegalArgumentException, NullPointerException {
        this.dData = dData;
    }

    public void setLeftChild(RBNode leftChild) throws IllegalArgumentException, NullPointerException {
        this.leftChild = leftChild;
    }

    public void setRightChild(RBNode rightChild) throws IllegalArgumentException, NullPointerException {
        this.rightChild = rightChild;
    }

    public void setRed(boolean red) throws IllegalArgumentException, NullPointerException {
        this.isRed = red;
    }

    public void setDeleted(boolean del) throws IllegalArgumentException, NullPointerException {
        this.deleted = del;
    }
}
