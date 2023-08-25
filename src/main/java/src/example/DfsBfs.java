package example;

import java.util.*;

public class DfsBfs {

    public static Map<Integer, List<Integer>> graph = new HashMap<>();
    public static Set<Integer> visited = new HashSet<>();

    // DFS
    static void dfs(int node) {
        if (visited.contains(node)) return;

        visited.add(node);
        System.out.println(node);

        for (int adjacent : graph.getOrDefault(node, new ArrayList<>())) {
            dfs(adjacent);
        }
    }

    // BFS
    static void bfs(int node) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(node);
        visited.add(node);
        System.out.println(node);

        while(!queue.isEmpty()) {
            int n = queue.poll();

            for (int adjacent : graph.getOrDefault(n, new ArrayList<>())) {
                queue.add(adjacent);
            }

            if (!visited.contains(n)) {
                visited.add(n);
                System.out.println(n);
            }
        }
    }


    public static void main(String[] args) {
        // 그래프 초기화
        graph.put(1, Arrays.asList(2, 3, 8));
        graph.put(2, List.of(7));
        graph.put(3, Arrays.asList(4, 5));
        graph.put(4, List.of(5));
        graph.put(7, List.of(6, 8));

//        dfs(1);
        bfs(1);
    }
}
