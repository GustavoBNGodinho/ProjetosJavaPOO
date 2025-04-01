package exceptions;

public class StructureEmptyException extends Exception {
    public StructureEmptyException(int size,int capacity) {
        super(String.format("Stack is empty. Size: %d. Capacity: %d", size, capacity));
    }
}
