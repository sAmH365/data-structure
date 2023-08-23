package sort;

public class Main {
    public static void main(String[] args) {

        int arr0[] = {32, 13, 22, 51, 2, 3, 4, 33, 88, 211};
        Sorting s = new Sorting(arr0);
        SortingEx sortingEx = new SortingEx();

        int[] bubbleResult = sortingEx.bubbleSort(arr0);
        System.out.print("버블 정렬0 :: ");
        for (int i=0; i<arr0.length; i++) {
            System.out.printf("%d ", arr0[i]);
        }

        System.out.println();

        int arr01[] = {32, 13, 22, 51, 2, 3, 4, 33, 88, 211};
        Sorting s01 = new Sorting(arr01);
        SortingEx sortingEx01 = new SortingEx();

        int[] selectionSort = sortingEx01.selectionSort(arr01);
        System.out.print("선택 정렬01 :: ");
        for (int i=0; i<arr01.length; i++) {
            System.out.printf("%d ", arr01[i]);
        }

        System.out.println();

        int arr[] = {32, 13, 22, 51, 2, 3, 4, 33, 88, 211};
        Sorting s1 = new Sorting(arr);
        s1.selectionSort();

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
        System.out.println();


        int arr4[] = {32, 13, 22, 51, 2, 3, 4, 33, 88, 211};
        Sorting s4 = new Sorting(arr4);
        s4.mergeSort();

        System.out.print("병합정렬 :: ");
        for (int i=0; i<arr4.length; i++) {
            System.out.printf("%d ", arr4[i]);
        }
    }
}
