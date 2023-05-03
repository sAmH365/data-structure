package list;

public class CircularDoublyLinkedList<E> implements BidirectionalLinkedListInterface<E> {

    private BidirectionalNode<E> head;
    private int numItems;
    private final int NOT_FOUND = -12345;

    public CircularDoublyLinkedList() {
        numItems = 0;
        this.head = new BidirectionalNode<>(null);
        this.head.next = this.head;
        this.head.prev = this.head;
    }


    @Override
    public void add(int index, E item) throws Exception {
        if (index >= 0 && index <= numItems) {
            BidirectionalNode<E> prevNode =  getNode(index - 1);
            BidirectionalNode<E> newNode = new BidirectionalNode<>(prevNode, item, prevNode.next);
            prevNode.next.prev = newNode;
            prevNode.next = newNode;
            numItems++;
        } else {
            throw new Exception("add fail in CircularDoublyLinkedList");
        }
    }

    @Override
    public void append(E item) throws Exception {
        BidirectionalNode<E> prevNode = head.prev;
        BidirectionalNode<E> newNode = new BidirectionalNode<>(prevNode, item, prevNode.next);

        prevNode.next = newNode;
        head.prev = newNode;
        numItems++;
    }

    @Override
    public E remove(int index) {
        if (index >= 0 && index <= numItems - 1) {
            BidirectionalNode<E> currNode = getNode(index);
            currNode.prev.next = currNode.next;
            currNode.next.prev = currNode.prev;
            numItems--;
            return currNode.item;
        }
        return null;
    }

    @Override
    public E get(int index) throws Exception {
        if (index >= 0 && index < numItems - 1) {
            return getNode(index).item;
        } else {
            throw new Exception("get fail in CircularDoublyLinkedList");
        }
    }

    @Override
    public BidirectionalNode<E> getNode(int index) {
        if (index >= -1 && index <= numItems - 1) {
            BidirectionalNode<E> currNode = this.head;

            if (index < numItems / 2) {
                for(int i=0; i <= index; i++) {
                    currNode = currNode.next;
                }
            } else {
                for(int i=numItems - 1; i >= index; i--) {
                    currNode = currNode.prev;
                }
            }

            return currNode;
        } else {
            return null;
        }
    }

    @Override
    public boolean removeItem(E item) {
        BidirectionalNode<E> currNode = this.head;
        int i = 0;
        while(i < numItems) {
            currNode = currNode.next;
            if (((Comparable<E>)(currNode.item)).compareTo(item) == 0) {
                currNode.prev.next = currNode.next;
                currNode.next.prev = currNode.prev;
                numItems--;
                return true;
            }
            i++;
        }
        return false;
    }

    @Override
    public void set(int index, E item) throws Exception {
        if (index >= 0 && index <= numItems -1) {
            getNode(index).item = item;
        } else {
            throw new Exception("set fail in CircularDoublyLinkedList");
        }
    }

    @Override
    public int indexOf(E item) {
        BidirectionalNode<E> currNode = this.head;
        for (int i = 0; i < numItems; i++) {
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
        this.head.prev = this.head;
        this.head.next = this.head;
    }

    @Override
    public String toString() {
        String result = "";
        BidirectionalNode<E> currNode = head;

        for (int i=0; i < numItems; i ++) {
            currNode = currNode.next;
            result += (currNode.item + ", ");
        }

        return result;
    }
}
