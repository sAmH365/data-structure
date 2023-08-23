package sort;

public class SortingEx {

    // 버블 정렬
    public int[] bubbleSort(int[] arr) {
        int tmp;

        for (int i=1; i<arr.length;i++) {
            for (int j=0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    tmp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }

        return arr;
    }

    // 선택정렬
    public int[] selectionSort(int[] arr) {
        int min = Integer.MAX_VALUE;
        int tmp;
        int index = 0;

        for (int i=0; i < arr.length; i++) {

            for (int j=i; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    index = j;
                }
            }

            tmp = arr[i];
            arr[i] = min;
            arr[index] = tmp;

            min = Integer.MAX_VALUE;
        }


        return arr;
    }
}
