import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;

public class MyList<E> {

    private int size = 0;

    private static int DEFAULT_CAPACITY = 10;

    private Object[] elements;

    private static final Object[] EMPTY_CAPACITY = {};

    public MyList() {
        this.elements = new Object[DEFAULT_CAPACITY];
    }

    private MyList(int initialCapacity) {
        if (initialCapacity > 0) {
        this.elements = new Object[initialCapacity];
        } else if (initialCapacity == 0) {
            this.elements = EMPTY_CAPACITY;
        } else {
            throw new IllegalArgumentException("Illegal Capacity: " + initialCapacity);
        }
    }

    public void add(int index, E element) {
        for (int i = 0; i < size; i++) {
            if (index == i) {
                this.elements[index] = element;
            }
            this.elements[size - i] = this.elements[size - 1 - i];
        }
        size++;
    }

    public E remove(int index) {
        E e = (E) this.elements[index];
        for (int i = index; i < size - 1; i++) {
            this.elements[i] = this.elements[i + 1];
        }
        this.elements[size - 1] = null;
        size--;
        return e;
    }

    public int size() {return size;}

    public E clone() {
        throw new RuntimeException();
    }

    public boolean contains (E e ) {
        return indexOf(e) >= 0;
    }

    public int indexOf (Object o ) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (this.elements[i].equals(o)) {
                index = i;
                break;
            }
        }
        return index;
    }

    public boolean add (E e) {
        this.elements[size] = e;
        size++;
        return true;
    }

    public void ensureCapacity(int minCapacity) {

    }

    public E get (int i ) {
        return (E) this.elements[i];
    }

    public void clear () {
        for (int i = 0; i < size(); i++) {
            this.elements[i] = null;
        }
    }
}
