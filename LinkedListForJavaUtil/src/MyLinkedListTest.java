import java.util.LinkedList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MyLinkedListTest {
    public static void main(String[] args) {

       MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        myLinkedList.add(0, 10);
        myLinkedList.add(1, 20);
        myLinkedList.add(2, 30);
        myLinkedList.addFirst(0);
        myLinkedList.addLast(40);

        myLinkedList.printList();
        System.out.println("Tail element: " + myLinkedList.get(myLinkedList.getTail()));


        MyLinkedList<Integer> listClone = myLinkedList.clone();
    }
    

}