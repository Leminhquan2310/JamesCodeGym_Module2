public class BST<E extends Comparable<E>> extends AbstractTree<E> {
    private TreeNode<E> root;
    private int size = 0;

    public BST() {
    }

    @Override
    public boolean insert(E e) {
        if (root == null) {
            root = createNewTree(e);
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
                parent.left = createNewTree(e);
            } else {
                parent.right = createNewTree(e);
            }
        }
        size++;
        return true;
    }

    public TreeNode<E> createNewTree(E e) {
        return new TreeNode<>(e);
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void inorder() {
        inorder(root);
    }

    public void inorder (TreeNode<E> treeNode) {
        if (treeNode == null ) return;
        inorder(treeNode.left);
        inorder(treeNode.right);
        System.out.println(treeNode.element);
    }
}
