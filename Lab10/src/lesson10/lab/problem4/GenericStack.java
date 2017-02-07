package lesson10.lab.problem4;

public class GenericStack<E> {

    private static final int DEFAULT_CAPACITY = 10;

    private E[] elements;

    private int size;

    public GenericStack() {
        this(DEFAULT_CAPACITY);
    }

    public GenericStack(int capacity) {
        elements = (E[]) new Object[capacity];
        size = -1;
    }

    public void push(E e) {
        size++;
        if (size >= elements.length) {
            doubleTheCapacity();
        }
        elements[size] = e;
    }

    public E pop() {
        if (!hasItems()) 
            return null;
        
        E top = elements[size];
        size--;
        return top;
    }

    public int size() {
        return size+1;
    }

    public E peek() {
        if (!hasItems()) 
            return null;
        
        E top = elements[size];
        return top;
    }

    public boolean isEmpty() {
        return size == -1;
    }

    private void doubleTheCapacity() {
        int doubledCapacity = 2 * elements.length;
        E[] tmp = (E[]) new Object[doubledCapacity];
        System.arraycopy(elements, 0, tmp, 0, size);
        elements = tmp;
    }

    private boolean hasItems() {
        return size >= 0;
    }
}
