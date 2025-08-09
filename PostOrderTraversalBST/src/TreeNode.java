public class TreeNode<E> {
    protected E element;
    protected TreeNode<E> left = null;
    protected TreeNode<E> right = null;

    public TreeNode(E element) {
        this.element = element;
    }
}
