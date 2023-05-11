package stack;

import list.LinkedList;
import list.Node;

public class LinkedStack<E> implements StackInterface<E> {
    private Node<E> topNode;
    private final E ERROR = null;

    public LinkedStack() {
        this.topNode = null;
    }

    @Override
    public void push(E newItem) throws Exception {
        this.topNode = new Node(newItem, topNode);
    }

    @Override
    public E pop() throws Exception {
        if (isEmpty()) return ERROR;
        else {
            Node<E> temp = this.topNode;
            this.topNode = this.topNode.next;
            return temp.item;
        }
    }

    @Override
    public E top() throws Exception {
        if (isEmpty()) return ERROR;
        else return this.topNode.item;
    }

    @Override
    public boolean isEmpty() {
        return this.topNode == null;
    }

    @Override
    public boolean isFull() { // 사용 안함
        return false;
    }

    @Override
    public void popAll() {
        this.topNode = null;
    }
}
