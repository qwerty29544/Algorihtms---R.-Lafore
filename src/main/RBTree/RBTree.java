package RBTree;

public class RBTree {
    private RBNode root;

    public RBTree() {
        root = null;
    }

    private boolean isRoot(RBNode node) {
        return node == this.root;
    }
}
