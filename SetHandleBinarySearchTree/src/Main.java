//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BST<Integer> tree = new BST<>();
        tree.insert(27);
        tree.insert(14);
        tree.insert(35);
        tree.insert(10);
        tree.insert(19);
        tree.insert(31);
        tree.insert(42);
        //traverse tree
        System.out.println("Inorder (sorted): ");
        tree.preorder();

       if (tree.hasValue(31)){
           System.out.println("Có giá trị 31 trong tree");
       }

    }
}