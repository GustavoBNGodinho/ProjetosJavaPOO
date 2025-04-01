public class StackEmptyException extends Exception{

    public StackEmptyException(int size,int capacity) {
        super(String.format("String is empty: Size: %d. Capacity: %d",
                size, capacity));
    }
}
