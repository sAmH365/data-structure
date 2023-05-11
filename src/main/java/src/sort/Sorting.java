package sort;

public class Sorting {
    int A[] ;

    public Sorting(int B[]) {
        A = B;
    }

    // 선택 정렬
    public void selectionSort() {
        int k;
        int tmp;

        for (int last = A.length - 1; last >= 1; last--) {
            k = theLargest(last); // A[0...last]중 가장 큰 수 A[k] 찾기
            tmp = A[k];
            A[k] = A[last];
            A[last] = tmp;
        }
    }

    private int theLargest(int last) {
        // A[0...last]에서 가장 큰 수의 인덱스를 리턴
        int largest = 0;
        for (int i=0; i<=last;i++) {
            if (A[i] > A[largest]) {
                largest = i;
            }
        }

        return largest;
    }

    // 버블 정렬
    public void bubbleSort() {
        int tmp = 0;

        for (int last = A.length - 1; last >= 2; last--) {
            for (int i = 0; i <= last - 1; i++) {
                if (A[i] > A[i + 1]) {
                    tmp = A[i];
                    A[i] = A[i + 1];
                    A[i+1] = tmp;
                }
            }
        }
    }

    // 삽입정렬
    public void insertionSort() {
        for (int i=0; i < A.length - 1; i++) {
            int loc = i - 1;
            int newItem = A[i];

            while (loc >=0 && newItem < A[loc]) {
                A[loc + 1] = A[loc];
                loc--;
            }

            A[loc+1] = newItem;
        }
    }

    // 병합 정렬
    public void mergeSort() {
        int [] B = new int[A.length];
        mSort(0, A.length-1, B);
    }

    private void mSort(int p, int r, int[] b) {
        if (p < r) {
            int q = (p + r) / 2;
            mSort(p, q, b);
            mSort(q+1, r, b);
            merge(p, q, r, b);
        }
    }

    private void merge(int p, int q, int r, int[] b) {
        int i = p;
        int j = q + 1;
        int t = 0;

        while( i <= q && j <= r) {
            if (A[i] <= A[j]) {
                b[t++] = A[i++];
            } else {
                b[t++] = A[j++];
            }
        }
        while(i <= q) // 왼쪽 부분 배열이 남은 경우
            b[t++] = A[i++];
        while (j <= r) // 오른쪽 부분 배열이 남은 경우
            b[t++] = A[j++];
        i = p; t = 0;
        while(i <= r) // 결과를 A[p...r]에 저장
            A[i++] = b[t++];
    }
}
