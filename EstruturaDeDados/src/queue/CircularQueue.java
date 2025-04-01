package queue;

public class CircularQueue implements Queue {
    private int size;
    private int[] elements;
    private int front;
    private int back;

    public CircularQueue(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException("Capacidade negativa");
        }
        size = 0;
        elements = new int[capacity];
        front = 0;
        back = 0;
    }

    @Override
    public void enqueue(int element) throws QueueFullException {
        if (isFull()) {
            throw new QueueFullException(size(), capacity());
        }
        elements[back] = element;
        back = (back + 1) % capacity();
        size++;
    }

    @Override
    public int dequeue() throws QueueEmptyException {
        if (isEmpty()) {
            throw new QueueEmptyException(size(), capacity());
        }
        int element = front();
        front = (front + 1) % capacity();
        return element;
    }

    @Override
    public int rear() throws QueueEmptyException {
        return 0;
    }

    @Override
    public int front() throws QueueEmptyException {
        if (isEmpty()) {
            throw new QueueEmptyException(size(), capacity());
        }
        return elements[front];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public int capacity() {
        return elements.length;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;

    }

    @Override
    public boolean isFull() {
        return size == capacity();
    }
}
