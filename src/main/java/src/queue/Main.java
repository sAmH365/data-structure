package queue;

import heap.Heap;

public class Main {
    public static void main(String[] args) throws Exception {
        ArrayQueue<String> arrayQueue = new ArrayQueue<>(10);
        arrayQueue.enqueue("test 1");
        arrayQueue.enqueue("test 2");
        arrayQueue.enqueue("test 3");
        arrayQueue.enqueue("test 4");
        arrayQueue.enqueue("test 5");
        arrayQueue.enqueue("test 6");
        arrayQueue.enqueue("test 7");
        arrayQueue.enqueue("test 8");
        arrayQueue.enqueue("test 9");
        arrayQueue.enqueue("test 10");
        arrayQueue.enqueue("test 11");
        arrayQueue.dequeue();

        System.out.println("==========arrayQueue========");
        while (!arrayQueue.isEmpty()) {
            System.out.println(arrayQueue.dequeue());
        }

        Heap<Integer> heap = new Heap<>(5);

        heap.insert(1);
        heap.insert(90);
        heap.insert(10);
        heap.insert(30);
        heap.insert(100);

        heap.buildHeap();
        heap.deleteMax();

        System.out.println("==========heap========");
        while (!heap.isEmpty()) {
            System.out.println(heap.deleteMax());
        }
    }
}
