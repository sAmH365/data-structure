package list;

public class BidirectionalNode<E> {
    public BidirectionalNode<E> prev;
    public E item;
    public BidirectionalNode<E> next;

    public BidirectionalNode() {
        this.prev = null;
        this.item = null;
        this.next = null;
    }

    public BidirectionalNode(E newItem) {
        this.prev = null;
        this.item = newItem;
        this.next = null;
    }

    public BidirectionalNode(BidirectionalNode<E> prevNode, E newItem, BidirectionalNode<E> nextNode) {
        this.prev = prevNode;
        this.item = newItem;
        this.next = nextNode;
    }
}
