package queue;

public class ArrayQueue<E> implements QueInterface<E> {

    private E queue[];
    private int numItems;
    private int front;
    private int tail;

    private final int DEFAULT_CAPACITY = 64;
    private final E ERROR = null;

    public ArrayQueue() {
        this.queue = (E[]) new Object[DEFAULT_CAPACITY];
        this.numItems = 0;
        this.front = 0;
        this.tail = DEFAULT_CAPACITY - 1;
    }

    public ArrayQueue(int n) {
        this.queue = (E[]) new Object[n];
        this.numItems = 0;
        this.front = 0;
        this.tail = n - 1;
    }


    @Override
    public void enqueue(E x) {
        if (isFull()) {
            System.out.println("queue is full");
        } else {
            tail = (tail + 1) % queue.length;
            queue[tail] = x;
            numItems++;
        }
    }

    private boolean isFull() {
        return numItems == queue.length;
    }

    @Override
    public E dequeue() {
        if (isEmpty()) {
            System.out.println("queue is empty");
            return ERROR;
        } else {
            E temp = queue[front];
            front = (front + 1) % queue.length;
            numItems--;
            return temp;
        }
    }

    @Override
    // 큐의 맨 앞 원소 알려주기
    public E front() {
        if (isEmpty()) {
            System.out.println("queue is empty");
            return ERROR;
        } else {
            return queue[front];
        }
    }

    @Override
    public boolean isEmpty() {
        return numItems == 0;
    }

    @Override
    public void clear() {
        this.queue = (E[]) new Object[queue.length];
        this.numItems = 0;
        this.tail = queue.length - 1;
        this.front = 0;
    }
}
