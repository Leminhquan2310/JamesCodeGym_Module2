//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enQueue(14);
        queue.enQueue(22);
        queue.enQueue(-6);

        queue.deQueue();
        queue.deQueue();

        queue.enQueue(9);
        queue.enQueue(20);
    }
}