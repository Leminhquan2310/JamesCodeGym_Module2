public class Queue {
    private Node front;
    private Node rear;

    public Queue() {
        front = rear = null;
    }

    public void enQueue(int num) {
        Node element = new Node(num);
        if (front == null) {
            front = rear = element;
        } else {
            rear.link = element;
            rear = element;
            rear.link = front;
        }
    }

    public Node deQueue() {
        if (front == null) return null;
        Node temp = front;

        if (front == rear) {
            front = rear = null;
        } else {
            front = front.link;
            rear.link = front;
        }
        return temp;
    }

    public void displayQueue () {
        Node currentNode = front;
        while (currentNode != rear) {
            System.out.println(currentNode.data);
            currentNode = currentNode.link;
        }
    }
}
