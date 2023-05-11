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
}
