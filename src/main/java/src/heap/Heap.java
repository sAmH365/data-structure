package heap;

public class Heap<E extends Comparable> implements PQInterface<E> {

    private E[] A;
    private int numItems;

    public Heap(int arraySize) {
        this.A = (E[]) new Comparable[arraySize];
        this.numItems = 0;
    }

    public Heap(E[] B, int numElements) {
        this.A = B;
        this.numItems = numElements;
    }

    @Override
    public void insert(E newItem) throws Exception {
        if (numItems < A.length) {
            A[numItems] = newItem;
            percolateUp(numItems);
            numItems++;
        }
    }

    private void percolateUp(int i) {
        // A[i]에서 시작해서 힙 성질을 만족하도록 수정
        int parent = i - 1 / 2;
        if (i >= 0 && A[i].compareTo(A[parent]) > 0) {
            E temp = A[parent];
            A[parent] = A[i];
            A[i] = temp;
            percolateUp(parent);
        }
    }

    @Override
    public E deleteMax() throws Exception {
        if (!isEmpty()) {
            E max = A[0];
            A[0] = A[numItems - 1];
            numItems--;
            percolateDown(0);
            return max;
        }
        return null;
    }

    private void percolateDown(int i) {
        // A[0..numItems-1]에서 A[i]를 루트로 스며내리기
        int child = 2 * i + 1;
        int rightChild = 2 * i + 2;

        if (child <= numItems - 1) {
            if (rightChild <= numItems - 1 && A[child].compareTo(A[rightChild]) < 0) {
                child = rightChild; // 더 큰 값의 인덱스
            }
            if (A[i].compareTo(A[child]) < 0) {
                E tmp = A[i];
                A[i] = A[child];
                A[child] = tmp;
                percolateDown(child);
            }
        }
    }

    public void buildHeap() {
        if (numItems >= 2) {
            for (int i = (numItems - 2)/2; i>=0; i--) {
                percolateDown(i);
            }
        }
    }

    @Override
    public E max() throws Exception {
        if (!isEmpty()) {
            return A[0];
        }
        return null;
    }

    @Override
    public boolean isEmpty() {
        return numItems == 0;
    }

    @Override
    public void clear() {
        A = (E[]) new Comparable[A.length];
        numItems = 0;
    }
}
