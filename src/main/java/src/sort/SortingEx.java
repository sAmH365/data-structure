package sort;

import java.util.*;

public class SortingEx {

    // 버블 정렬
    public int[] bubbleSort(int[] arr) {
        int tmp;

        for (int i=1; i<arr.length; i++) {
            for (int j=0; j< arr.length - i; j++) {
                if (arr[j] > arr[j+1]) {
                    tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j+1] = tmp;
                }
            }
        }

        return arr;
    }

    // 선택정렬
    public int[] selectionSort(int[] arr) {
        int minIndex = 0;
        int tmp;

        for (int i=0;i<arr.length;i++) {
            int min = Integer.MAX_VALUE;

            for (int j=i;j<arr.length;j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minIndex = j;
                }
            }

            tmp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = tmp;
        }
        return arr;
    }

    // DFS
    private static Map<Integer, List<Integer>> graph = new HashMap<>();
    private static Set<Integer> visited = new HashSet<>();

    static public void dfs(int node) {
        if (visited.contains(node)) {
            return;
        }

        visited.add(node);
        System.out.println(node);

        for (int adjacent : graph.getOrDefault(node, new ArrayList<>())) {
            dfs(adjacent);
        }
    }

    public static void main(String[] args) {
        graph.put(1, Arrays.asList(3, 2, 8));
        graph.put(2, Arrays.asList(7,8));
        graph.put(3, Arrays.asList(4, 5));
        graph.put(4, Arrays.asList(5));
        graph.put(7, Arrays.asList(6,8));

        dfs(1);
    }
}
