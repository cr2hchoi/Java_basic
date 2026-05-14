package Day11.BFS;

import java.util.*;

// 그래프 코테 예제
class Solution {

    List<List<Integer>> graph = new ArrayList<>();
    boolean[] visited;

    public void bfs(int start) {

        Queue<Integer> queue = new ArrayDeque<>();

        queue.offer(start);

        visited[start] = true;

        while (!queue.isEmpty()) {

            int cur = queue.poll();

            System.out.println(cur);

            for (int nxt : graph.get(cur)) {

                if (!visited[nxt]) {

                    visited[nxt] = true;

                    queue.offer(nxt);
                }
            }
        }
    }
}
