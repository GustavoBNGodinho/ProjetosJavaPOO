package pilha;

import exceptions.StructureEmptyException;
import exceptions.StructureFullException;

public interface Stack<T> {
    void push(T element) throws StructureFullException;
    T pop() throws StructureEmptyException;
    T top()throws StructureEmptyException;
    int size();
    int capacity();
    boolean isEmpty();
    boolean isFull();
}
