package pilha;

import exceptions.StructureEmptyException;
import exceptions.StructureFullException;

public class StackImpl<T> implements Stack<T> {
    private T[] elements;
    private int top;

    public StackImpl(int capacity) {
        elements = (T[]) new Object[capacity];
    }
    @Override
    public void push(T element) throws StructureFullException{
        if (isFull()) {
            throw new StructureFullException(size(), capacity());
        }
        elements[top++] = element;
    }

    @Override
    public T pop() throws StructureEmptyException {
        if (isEmpty()) {
            throw new StructureEmptyException(size(),capacity());
        }
        return elements[--top];
    }

    @Override
    public T top() throws StructureEmptyException {
        if (isEmpty()) {
            throw new StructureEmptyException(size(), capacity());
        }
        return elements[top - 1];
    }
    @Override
    public int size() {
        return top;
    }
    @Override
    public int capacity() {
        return elements.length;
    }
    @Override
    public boolean isEmpty() {
        return top == 0;
    }
    @Override
    public boolean isFull() {
        return top == capacity();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("[");
        for(T t : elements){
            sb.append(t);
            sb.append(", ");
        }
        sb.append("] <- top");
        return sb.toString();
    }
}
