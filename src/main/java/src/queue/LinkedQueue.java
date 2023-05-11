package queue;

import list.Node;

public class LinkedQueue<E> implements QueInterface<E> {

    private Node<E> tail;

    private final E ERROR = null;

    public LinkedQueue() {
        this.tail = null;
    }

    @Override
    public void enqueue(E x) {
        Node<E> newNode = new Node(x);
        if (isEmpty()) {
            newNode.next = newNode;
            tail = newNode;
        } else {
            newNode.next = tail.next;
            tail.next = newNode;
            tail = newNode;
        }
    }

    @Override
    public E dequeue() {
        if (isEmpty()) {
            System.out.println("queue is empty");
            return ERROR;
        } else {
            Node<E> front = tail.next;
            if (front == tail) {
                tail = null; // 원소 1개만 있었을 경우
            } else {
                tail.next = front.next;
            }
            return front.item;
        }
    }

    @Override
    public E front() {
        if (isEmpty()) {
            System.out.println("queue is empty");
            return ERROR;
        } else {
            return tail.next.item;
        }
    }

    @Override
    public boolean isEmpty() {
        return tail == null;
    }

    @Override
    public void clear() {
        this.tail = null;
    }
}
