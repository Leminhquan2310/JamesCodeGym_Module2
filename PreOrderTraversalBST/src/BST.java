public class BST<E extends Comparable<E>>{
    private TreeNode<E> root;
    private int size = 0;

    public boolean insert (E e) {
         if (root == null) {
            root = createNewNode(e);
        } else {
            TreeNode<E> parent = null;
            TreeNode<E> current = root;
            while (current != null) {
                if (e.compareTo(current.element) < 0) {
                    parent = current;
                    current = current.left;
                } else if (e.compareTo(current.element) > 0) {
                    parent = current;
                    current = current.right;
                } else {
                    return false;
                }
            }
            if (e.compareTo(parent.element) < 0) {
                parent.left = createNewNode(e);
            } else {
                parent.right = createNewNode(e);
            }
        }
        size++;
         return true;
    }

    public TreeNode<E> createNewNode(E e) {
        return new TreeNode<>(e);
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
}
