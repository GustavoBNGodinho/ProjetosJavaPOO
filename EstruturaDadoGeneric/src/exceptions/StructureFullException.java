package exceptions;

public class StructureFullException extends Exception {
    public StructureFullException(int size, int capacity) {
        super(String.format("Stack is full. Size: %d. Capacity: %d", size, capacity));
    }
}
