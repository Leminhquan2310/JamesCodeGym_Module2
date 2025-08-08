public class MyQueue {
    private int capacity;
    private int[] queueArr;
    private int head = 0;
    private int tail = -1;
    private int currentSize = 0;

    public MyQueue(int queueSize) {
        this.capacity = queueSize;
        queueArr = new int[this.capacity];
    }

    public boolean isQueueFull() {
        return this.currentSize == this.capacity;
    }

    public boolean isQueueEmpty() {
        return this.currentSize == 0;
    }

    public void enqueue(int item) {
        if (isQueueFull()) {
            System.out.println("Overflow! Unable to add element: " + item);
        } else {
            this.tail = (tail + 1) % capacity;
            queueArr[this.tail] = item;
            currentSize++;
            System.out.println("Element " + item + " is pushed to Queue !");
        }
    }

    public void dequeue() {
        if (isQueueEmpty()) {
            System.out.println("Underflow ! Unable to remove element from Queue");
        } else {
            head++;
            System.out.println("Pop operation done ! removed: " + queueArr[head - 1]);
            if (head == capacity - 1) {
                head = 0;
            }
            currentSize--;
        }
    }


}
