package queue;

public interface QueInterface<E> {

    void enqueue(E x);
    E dequeue();
    E front();
    boolean isEmpty();
    void clear();
}
