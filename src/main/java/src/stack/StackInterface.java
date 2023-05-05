package stack;

public interface StackInterface<E> {

    void push (E newItem) throws Exception;
    E pop() throws Exception;
    E top() throws Exception;
    boolean isEmpty();
    boolean isFull();
    void popAll();
}
