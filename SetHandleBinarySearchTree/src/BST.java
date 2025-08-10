import com.sun.source.tree.Tree;

public class BST<E extends Comparable<E>> {
    private TreeNode<E> root;
    private int size = 0;

    public BST() {
    }

    public boolean insert(E e) {
        if (root == null) {
            root = createTreeNode(e);
        } else {
            TreeNode<E> parent = null;
            TreeNode<E> current = root;
            while (current != null) {
                int cmp = e.compareTo(current.element);
                if (cmp < 0) {
                    parent = current;
                    current = current.left;
                } else if (cmp > 0) {
                    parent = current;
                    current = current.right;
                } else {
                    return false;
                }
            }
            if (e.compareTo(parent.element) < 0) {
                parent.left = createTreeNode(e);
            } else {
                parent.right = createTreeNode(e);
            }
        }
        size++;
        return true;
    }

    public void preorder() {
        preorder(root);
    }

    private void preorder(TreeNode<E> treeNode) {
        if (treeNode == null) return;
        System.out.println("" + treeNode.element);
        preorder(treeNode.left);
        preorder(treeNode.right);
    }

    private TreeNode<E> createTreeNode(E e) {
        return new TreeNode<>(e);
    }

    public boolean hasValue(E e){
        TreeNode<E> current = root;
        while (current != null){
            int cmp = e.compareTo(current.element);
            if (cmp < 0){
                current = current.left;
            } else if (cmp > 0){
                current = current.right;
            } else {
                return true;
            }
        }
        return false;
    }
}
