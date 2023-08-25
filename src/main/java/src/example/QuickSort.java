package example;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {10, 2, 4, 3, 98, 72, 11, 42, 24, 33};

        quickSort(arr, 0, arr.length-1);

        for (int n: arr) {
            System.out.println(n);
        }
    }

    static void quickSort(int[] arr, int start, int end) {
        if (start >= end) return;

        int pivot = arr[start];
        int left = start + 1;
        int right = end;

        while (left <= right) {
            while (left <= end && arr[left] <= pivot) left++;
            while (right > start && arr[right] >= pivot) right--;

            if (left > right) swap(arr, right, start);
            else swap(arr, left, right);
        }

        quickSort(arr, start, right - 1);
        quickSort(arr, right + 1, end);
    }

    static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

}
