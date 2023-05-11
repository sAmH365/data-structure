package sort;

public class Main {
    public static void main(String[] args) {

        int arr[] = {32, 13, 22, 51, 2, 3, 4, 33, 88, 211};
        Sorting s = new Sorting(arr);

        s.selectionSort();

        System.out.print("선택정렬 :: ");
        for (int i=0; i<arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }
        System.out.println();

        int arr2[] = {32, 13, 22, 51, 2, 3, 4, 33, 88, 211};
        Sorting s2 = new Sorting(arr2);
        s2.bubbleSort();

        System.out.print("버블정렬 :: ");
        for (int i=0; i<arr2.length; i++) {
            System.out.printf("%d ", arr2[i]);
        }
        System.out.println();

        int arr3[] = {32, 13, 22, 51, 2, 3, 4, 33, 88, 211};
        Sorting s3 = new Sorting(arr3);
        s3.insertionSort();

        System.out.print("삽입정렬 :: ");
        for (int i=0; i<arr3.length; i++) {
            System.out.printf("%d ", arr3[i]);
        }
    }
}
