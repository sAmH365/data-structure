package stack;

public class ArrayStack<E> implements StackInterface<E> {

    private E stack[];
    private int topIndex;
    private static final int DEFAULT_CAPACITY = 64;
    private final E ERROR = null;

    public ArrayStack() {
        this.stack = (E[]) new Object[DEFAULT_CAPACITY];
        this.topIndex = -1;
    }

    public ArrayStack(int n) {
        this.stack = (E[]) new Object[n];
        this.topIndex = -1;
    }

    @Override
    public void push(E newItem) throws Exception {
        if (isFull()) {
            throw new Exception("push fail in ArrayStack");
        } else {
            this.stack[++topIndex] = newItem;
        }
    }

    @Override
    public E pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("pop fail in ArrayStack");
        } else {
            return this.stack[topIndex--];
        }
    }

    @Override
    public E top() throws Exception {
        if (isEmpty()) {
            throw new Exception("pop fail in ArrayStack");
        } else {
            return this.stack[topIndex];
        }
    }

    @Override
    public boolean isEmpty() {
        return (topIndex < 0);
    }

    @Override
    public boolean isFull() {
        return (topIndex == this.stack.length - 1);
    }

    @Override
    public void popAll() {
        this.topIndex = -1;
        this.stack = (E[]) new Object[stack.length];
    }

    @Override
    public String toString() {
        String result = "";

            for (int i=0; i<= topIndex; i++) {
                result += stack[i] +" ";
            }

        return result;
    }

    public int getTopIndex() {
        return this.topIndex;
    }
}
