package list;

public class LinkedList<E> implements LinkedListInterface<E> {

    private Node<E> head;
    private int numItems;
    private final int NOT_FOUND = -12345;

    public LinkedList() {
        this.numItems = 0;
        this.head = new Node<>(null, null); // 더미 헤드
    }

    @Override
    public void add(int index, E item) throws Exception {
        if (index >= 0 && index <= numItems) {
            Node<E> prevNode = getNode(index - 1);
            Node<E> currentNode = prevNode.next;
            Node<E> newNode = new Node<>(item, currentNode);
            prevNode.next = newNode;
            numItems++;
        }
    }

    @Override
    public void append(E item) throws Exception {
        Node<E> prevNode = head;
        while (prevNode.next != null) {
            prevNode = prevNode.next;
        }
        Node<E> newNode = new Node<>(item, null);
        prevNode.next = newNode;
        numItems++;
    }

    @Override
    public E remove(int index) {
        if (index >= 0 && index <= numItems - 1) {
            Node<E> prevNode = getNode(index - 1);
            Node<E> currNode = prevNode.next;
            prevNode.next = currNode.next;
            numItems--;
            return currNode.item;
        } else {
            return null;
        }
    }

    @Override
    public E get(int index) throws Exception {
        if (index >= 0 && index <= numItems - 1) {
            return getNode(index).item;
        } else {
            throw new Exception("get fail in LinkedList");
        }
    }

    @Override
    public Node<E> getNode(int index) {
        if (index >= -1 && index <= numItems - 1) {
            Node<E> currNode = head;
            for(int i =0; i <= index; i++) {
                currNode = currNode.next;
            }
            return currNode;
        } else {
            return null;
        }
    }

    @Override
    public boolean removeItem(E item) {
        Node<E> currNode = head;
        Node<E> prevNode;
        for (int i = 0; i < numItems; i++) {
            prevNode = currNode;
            currNode = currNode.next;
            if (((Comparable<E>)(currNode.item)).compareTo(item) == 0) {
                prevNode.next = currNode.next;
                numItems--;
                return true;
            }
        }
        return false;
    }

    @Override
    public void set(int index, E item) throws Exception {
        if (index >= 0 && index <= numItems - 1) {
            getNode(index).item = item;
            numItems++;
        } else {
            throw new Exception("set fail in LinkedList");
        }
    }

    @Override
    public int indexOf(E item) {
        Node<E> currNode = head;
        int i;
        for(i = 0; i < numItems; i++) {
            currNode = currNode.next;
            if (((Comparable<E>)(currNode.item)).compareTo(item) == 0) {
                return i;
            }
        }
        return NOT_FOUND;
    }

    @Override
    public int len() {
        return numItems;
    }

    @Override
    public boolean isEmpty() {
        return numItems == 0;
    }

    @Override
    public void clear() {
        numItems = 0;
        head = new Node<>(null, null);
    }

    @Override
    public String toString() {
        String result = "";
        Node<E> currNode = head;
        int i = 0;

        while(i < numItems) {
            currNode = currNode.next;
            result += (currNode.item + ", ");
            i++;
        }

        return result;
    }
}
