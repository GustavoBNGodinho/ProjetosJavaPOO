public class ArrayStack implements Stack {
    int[] elements;
    int top;
    public ArrayStack(int capacity){
        if (capacity < 0) {
            throw new IllegalArgumentException("Capcidade deve ser positiva");
        }
        elements= new int[capacity];
        top = 0;
    }

    @Override
    public void push(int element) throws StackFullException {
            if (top == elements.length ) {
                throw new StackFullException(size(), capacity());
            }
            elements[top++] = element;
    }

    @Override
    public int pop() throws StackEmptyException{
        if (top == 0) {
            throw new StackEmptyException(size(),capacity());
        }
        return elements[--top];
    }

    @Override
    public void clear() {
        top = 0;
    }

    @Override
    public int size() {
        return top;
    }

    @Override
    public int top() throws StackEmptyException{
        if (top == 0) {
            throw new StackEmptyException(size(), capacity());
        }
        return elements[top - 1];
    }

    @Override
    public int capacity() {
        return elements.length;
    }

    @Override
    public boolean isEmpty() {
        if (top == 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean isFull() {
        if (top == elements.length) {
            return true;
        } else {
            return false;
        }
    }
}
