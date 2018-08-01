package Tree;

import java.util.Stack;

public class Tree {
    private Node root; // first node of tree

    public Tree() // Constructor
    { root = null; } // No nodes yet

    public Tree(Node node) {
        root = node;
    }

    public Node find(int key) throws NullPointerException, IllegalArgumentException // Find the node with the given key
    { // (assumes that the tree is not empty)
        Node current = root; // Start from the root node
        while(current.iData != key) // No match found yet
        {
            if(key < current.iData) // To move to the left?
                current = current.leftChild;
            else // Или направо?
                current = current.rightChild;
            if(current == null) // If the child does not exist,
                return null; // the search failed
        }
        return current; // Item found
    }

    public void insert(int id, double dd) throws NullPointerException, IllegalArgumentException
    {
        Node newNode = new Node(); // Create a new node
        newNode.iData = id; // Inserting Data
        newNode.dData = dd;
        if(root==null) // The root node does not exist
            root = newNode;
        else // The root node is busy
        {
            Node current = root; // Start from the root node
            Node parent;
            while(true) // (internal exit from the loop)
            {
                parent = current;
                if(id < current.iData) // To move to the left?
                {
                    current = current.leftChild;
                    if(current == null) // If the end of the chain is reached, paste left
                    {
                        parent.leftChild = newNode;
                        return;
                    }
                }
                else // Or to the right?
                {
                    current = current.rightChild;
                    if(current == null) // If the end of the chain is reached, paste right
                    {
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }
    }

    public void insert(Node node) throws NullPointerException, IllegalArgumentException
    {
        Node newNode = node;
        if(root==null) // The root node does not exist
            root = newNode;
        else // The root node is busy
        {
            Node current = root; // Start from the root node
            Node parent;
            while(true) // (internal exit from the loop)
            {
                parent = current;
                if(newNode.getiData() < current.iData) // To move to the left?
                {
                    current = current.leftChild;
                    if(current == null) // If the end of the chain is reached, paste left
                    {
                        parent.leftChild = newNode;
                        return;
                    }
                }
                else // Or to the right?
                {
                    current = current.rightChild;
                    if(current == null) // If the end of the chain is reached, paste right
                    {
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }
    }

    public boolean delete(int key) throws NullPointerException, IllegalArgumentException // Delete the node with the given key
    { // (assumes that the tree is not empty)
        Node current = root;
        Node parent = root;
        boolean isLeftChild = true;
        while (current.iData != key) // Find the node
        {
            parent = current;
            if (key < current.iData) // To move to the left?
            {
                isLeftChild = true;
                current = current.leftChild;
            } else // Or to the right?
            {
                isLeftChild = false;
                current = current.rightChild;
            }
            if (current == null) // End of the chain
                return false; // Node not found
        }
        // The node to remove is found
        // If the node does not have children, it simply deletes.
        if (current.leftChild == null && current.rightChild == null) {
            if (current == root) // If the node is the root node, the tree is cleared
                root = null;
            else if (isLeftChild)
                parent.leftChild = null; // The node is disconnected from the parent
            else
                parent.rightChild = null;
            return true;
        }
        // If there is no right child, the node is replaced with the left subtree
        else if (current.rightChild == null) {
            if (current == root)
                root = current.leftChild;
            else if (isLeftChild)
                parent.leftChild = current.leftChild;
            else
                parent.rightChild = current.leftChild;
            return true;
        }
        // If there is no left child, the node is replaced with the right subtree
        else if (current.leftChild == null) {
            if (current == root)
                root = current.rightChild;
            else if (isLeftChild)
                parent.leftChild = current.rightChild;
            else
                parent.rightChild = current.rightChild;
            return true;
        }
        else // Two descendants, the node is replaced by a successor
        {
            // Find the successor for the node being deleted (current)
            Node successor = getSuccessor(current);
            // The current parent contacts the middleman
            if (current == root)
                root = successor;
            else if (isLeftChild)
                parent.leftChild = successor;
            else
                parent.rightChild = successor;
            // The successor binds to the left child of current
            return true; // A sign of successful completion
        }
    }

    // The method returns a node with the next value after the delNode.
    // To do this, it first goes to the right child, and the
    // traces the chain of left children of this node.
    private Node getSuccessor(Node delNode) throws NullPointerException, IllegalArgumentException
    {
        Node successorParent = delNode;
        Node successor = delNode;
        Node current = delNode.rightChild; // Go to the right child
        while(current != null) // So far there are left children
        {
            successorParent = successor;
            successor = current;
            current = current.leftChild; // Move to the left child
        }
        // If the successor is not
        if(successor != delNode.rightChild) // the right child, создать связи между узлами
        {
            successorParent.leftChild = successor.rightChild;
            successor.rightChild = delNode.rightChild;
        }
        return successor;
    }

    public void traverse(int traverseType) throws IllegalArgumentException, NullPointerException
    {
        switch(traverseType)
        {
            case 1: System.out.print("\nPreorder traversal: ");
                preOrder(root);
                break;
            case 2: System.out.print("\nInorder traversal: ");
                inOrder(root);
                break;
            case 3: System.out.print("\nPostorder traversal: ");
                postOrder(root);
                break;
        }
        System.out.println();
    }

    private void preOrder(Node localRoot) throws NullPointerException, IllegalArgumentException
    {
        if(localRoot != null)
        {
            System.out.print(localRoot.iData + " ");
            preOrder(localRoot.leftChild);
            preOrder(localRoot.rightChild);
        }
    }

    private void inOrder(Node localRoot) throws NullPointerException, IllegalArgumentException
    {
        if(localRoot != null)
        {
            inOrder(localRoot.leftChild);
            System.out.print(localRoot.iData + " ");
            inOrder(localRoot.rightChild);
        }
    }

    private void postOrder(Node localRoot) throws NullPointerException, IllegalArgumentException
    {
        if(localRoot != null)
        {
            postOrder(localRoot.leftChild);
            postOrder(localRoot.rightChild);
            System.out.print(localRoot.iData + " ");
        }
    }

    public void displayTree() throws NullPointerException, StackOverflowError
    {
        Stack globalStack = new Stack();
        globalStack.push(root);
        int nBlanks = 32;
        boolean isRowEmpty = false;
        System.out.println(
                "......................................................");
        while(isRowEmpty==false)
        {
            Stack localStack = new Stack();
            isRowEmpty = true;
            for(int j=0; j<nBlanks; j++)
                System.out.print(' ');
            while(globalStack.isEmpty()==false)
            {
                Node temp = (Node)globalStack.pop();
                if(temp != null)
                {
                    System.out.print(temp.iData);
                    localStack.push(temp.leftChild);
                    localStack.push(temp.rightChild);
                    if(temp.leftChild != null ||
                            temp.rightChild != null)
                        isRowEmpty = false;
                }
                else
                {
                    System.out.print("--");
                    localStack.push(null);
                    localStack.push(null);
                }
                for(int j=0; j<nBlanks*2-2; j++)
                    System.out.print(' ');
            }
            System.out.println();
            nBlanks /= 2;
            while(localStack.isEmpty()==false)
                globalStack.push( localStack.pop() );
        }
        System.out.println(
                "......................................................");
    }

    public Node getRoot() { // Root Getter
        return root;
    }
}
