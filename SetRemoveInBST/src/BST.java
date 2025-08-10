public class BST<E extends Comparable<E>> extends AbstractTree<E> {
    private TreeNode<E> root;
    private int size = 0;


    @Override
    public boolean insert(E e) {
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

    public boolean delete(E e) {
        TreeNode<E> parent = null;
        TreeNode<E> current = root;
        // Tìm node cần xóa
        while (current != null) {
            int cmp = e.compareTo(current.element);
            if (cmp < 0) {
                parent = current;
                current = current.left;
            } else if (cmp > 0) {
                parent = current;
                current = current.right;
            } else {
                break; // Tìm thấy
            }
        }
        if (current == null) return false;

        // Trường hợp một: Giá trị bên trái là null
        if (current.left == null) {
            TreeNode<E> child = current.right;
            if (parent == null) {
                root = child;
            } else if (parent.left == current) {
                parent.left = child;
            } else {
                parent.right = child;
            }
        } else { // Trường hợp hai: tồn tại gía trị bên trái
            TreeNode<E> parentRightMost = null;
            TreeNode<E> rightMost = current.left;
            while (true) {
                if (rightMost.right != null) {
                    parentRightMost = rightMost;
                    rightMost = rightMost.right;
                } else {
                    break;
                }
            }
            current.element = rightMost.element;
            if (parentRightMost == null) {
                current.left = rightMost.left;
            } else {
                parentRightMost.right = rightMost.left;
            }
        }
        size--;
        return true;
    }

    @Override
    public void inorder() {
        inorder(root);
    }

    private void inorder(TreeNode<E> treeNode) {
        if (treeNode == null) return;
        inorder(treeNode.left);
        System.out.println(treeNode.element);
        inorder(treeNode.right);
    }

    @Override
    public int getSize() {
        return size;
    }
}
