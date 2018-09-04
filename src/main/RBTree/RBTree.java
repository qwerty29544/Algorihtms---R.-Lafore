package RBTree;

public class RBTree {
    private RBNode root;

    public RBTree() {
        root = null;
    }

    private boolean isRoot(RBNode node) {
        return node == this.root;
    }


    //IS NOT OVER YET, WORKING, PLEASE WAIT
    public void insert(int id, long dd) throws NullPointerException, IllegalArgumentException
    {
        RBNode newNode = new RBNode(); // Create a new node
        newNode.setIdData(id);
        newNode.setdData(dd);
        if(root==null) { // The root node does not exist
            newNode.setRed(false);
            root = newNode;
        }
        else // The root node is busy
        {
            RBNode current = root; // Start from the root node
            RBNode parent = root;
            RBNode grand = root;
            RBNode great = root;
            while(true) // (internal exit from the loop)
            {
                great = grand;
                grand = parent;
                parent = current;
                if(id < current.getIdData()) // To move to the left?
                {
                    current = current.getLeftChild();
                    if(current == null) // If the end of the chain is reached, paste left
                    {
                        parent.setLeftChild(newNode);
                        return;
                    }
                }
                else // Or to the right?
                {
                    current = current.getRightChild();
                    if(current == null) // If the end of the chain is reached, paste right
                    {
                        parent.setRightChild(newNode);
                        return;
                    }
                }
            }
        }
    }

    private boolean firstLaw(RBNode node) {
        return (!node.isRed() && node.getLeftChild().isRed() && node.getRightChild().isRed());
    }

    private void flipSubTree(RBNode node) {
        node.setRed(true);
        if (node == this.root)
            node.setRed(false);
        node.getRightChild().setRed(false);
        node.getLeftChild().setRed(false);
    }

    public RBNode find(int key) throws NullPointerException, IllegalArgumentException // Find the node with the given key
    { // (assumes that the tree is not empty)
        RBNode current = root; // Start from the root node
        while(current.getIdData() != key) // No match found yet
        {
            if(key < current.getIdData()) // To move to the left?
                current = current.getLeftChild();
            else // Или направо?
                current = current.getRightChild();
            if(current == null) // If the child does not exist,
                return null; // the search failed
        }
        return current; // Item found
    }

    public void traverse(int traverseType) throws IllegalArgumentException, NullPointerException {
        switch (traverseType) {
            case 1:
                System.out.print("\nPreorder traversal: ");
                preOrder(root);
                break;
            case 2:
                System.out.print("\nInorder traversal: ");
                inOrder(root);
                break;
            case 3:
                System.out.print("\nPostorder traversal: ");
                postOrder(root);
                break;
        }
        System.out.println();
    }

    private void preOrder(RBNode localRoot) throws NullPointerException, IllegalArgumentException
    {
        if(localRoot != null)
        {
            localRoot.display();
            preOrder(localRoot.getLeftChild());
            preOrder(localRoot.getRightChild());
        }
    }

    private void inOrder(RBNode localRoot) throws NullPointerException, IllegalArgumentException
    {
        if(localRoot != null)
        {
            inOrder(localRoot.getLeftChild());
            localRoot.display();
            inOrder(localRoot.getRightChild());
        }
    }

    private void postOrder(RBNode localRoot) throws NullPointerException, IllegalArgumentException
    {
        if(localRoot != null)
        {
            postOrder(localRoot.getLeftChild());
            postOrder(localRoot.getRightChild());
            localRoot.display();
        }
    }

    public RBNode getRoot() {
        return root;
    }
}
