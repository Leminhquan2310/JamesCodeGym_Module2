public class MyLinkedList<E> {

    private Node head = null;

    private Node tail = null;

    private int numNodes = 0;


    public MyLinkedList() {
    }

    public void add(int index, E element) {
        Node newElement = new Node(element);
        Node currentElement = head;
        int indexE = 1;

        if (currentElement == null) {
            head = newElement;
            tail = newElement;
        }

        for (int i = 0; i < numNodes; i++) {
            if (indexE == index) {
                newElement.next = currentElement.next;
                currentElement.next = newElement;

                if (index == numNodes) {
                    tail = newElement;
                }
                break;
            }
            currentElement = currentElement.next;
            indexE++;
        }

        numNodes++;
    }

    public void addFirst(E e) {
        Node element = new Node(e);
        element.next = head;
        head = element;
        numNodes++;
    }

    public void addLast(E e) {
        Node element = new Node(e);
        if (numNodes == 0) {
            head = element;
        } else {
            tail.next = element;
        }
        tail = element;
        numNodes++;
    }

    public E remove(int index) {
        if (index < 0 || index >= numNodes) return null; // Out of range
        else if (index == 0) return removeFirst(); // Remove first
        else if (index == numNodes - 1) return removeLast(); // Remove last
        else {
            Node previous = head;

            for (int i = 1; i < index; i++) {
                previous = previous.next;
            }

            Node current = previous.next;
            previous.next = current.next;
            numNodes--;
            return (E) current.getData();
        }
    }

    public E removeFirst() {
        if (numNodes == 0) return null;
        else {
            Node temp = head;
            head = head.next;
            numNodes--;
            if (head == null) tail = null;
            return (E) temp.getData();
        }
    }

    public E removeLast() {
        if (numNodes == 0) return null;
        else if (numNodes == 1) {
            Node temp = tail;
            tail = head = null;
            numNodes = 0;
            return (E) temp.getData();
        } else {
            Node current = head;
            for (int i = 0; i < numNodes - 2; i++) {
                current = current.next;
            }

            Node temp = tail;
            tail = current;
            tail.next = null;
            numNodes--;
            return (E) temp.getData();
        }
    }

    public boolean remove(Object o) {
        Node currentNode = head;
        if (currentNode.equals(o)) removeFirst();
        for (int i = 0; i < numNodes; i++) {
            if (currentNode.next.equals(o)) {
                currentNode.next = currentNode.next.next;
                numNodes--;
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
    }

    public MyLinkedList<E> clone() {
        MyLinkedList<E> clone = new MyLinkedList<>();
        clone.head = clone.tail = null;
        clone.numNodes = 0;

        for (Node x = head; x != null; x = x.next) {
            clone.addLast((E) x.getData());
        }

        return clone;
    }

    public boolean contains (E e) {
        for (Node x = head; x != null; x = x.next) {
            if (x.getData().equals(e)) {
                return true;
            }
        }
         return false;
    }

    public int indexOf (E e) {
        Node currentNode = head;
        for (int i = 0; i < numNodes; i++) {
            if (currentNode.getData().equals(e)) {
                return i;
            }
            currentNode = currentNode.next;
        }
        return -1;
    }

    public E get(int i) {
        Node currentNode = head;
        int index = 0;
        do {
            if (index == i) {
                break;
            }
            currentNode = currentNode.next;
            index++;
        }
        while (currentNode.next != null);
        return (E) currentNode.getData();
    }

    public void printList() {
        for (Node node = head; node != null; node = node.next)
            System.out.println(node.getData());
    }

    public int size() {
        return numNodes;
    }

    public E getTail() {
        return (E) tail.getData();
    }


    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }
}
