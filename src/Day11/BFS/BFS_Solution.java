package Day11.BFS;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class BFS_Solution {
    // 그래프 저장용 인접 리스트
    List<List<Integer>> graph = new ArrayList<>();

    // 방문 여부 저장 배열
    boolean[] visited;

    public static void main(String[] args) {

        Solution sol = new Solution();

        // 노드 개수
        int n = 5;

        // visited 배열 생성
        sol.visited = new boolean[n];

        // 그래프 초기화
        for (int i = 0; i < n; i++) {
            sol.graph.add(new ArrayList<>());
        }

        /*
            그래프 연결

            0 -- 1 -- 3
            |
            2 -- 4
         */

        sol.graph.get(0).add(1);
        sol.graph.get(1).add(0);

        sol.graph.get(0).add(2);
        sol.graph.get(2).add(0);

        sol.graph.get(1).add(3);
        sol.graph.get(3).add(1);

        sol.graph.get(2).add(4);
        sol.graph.get(4).add(2);

        // 그래프 출력
        System.out.println("그래프 상태");
        System.out.println(sol.graph);

        System.out.println();

        // BFS 실행
        System.out.println("BFS 탐색 시작");

        sol.bfs(0);
    }

    // BFS 함수
    public void bfs(int start) {

        Queue<Integer> queue = new ArrayDeque<>();

        // 시작 노드 삽입
        queue.offer(start);

        // 방문 처리
        visited[start] = true;

        while (!queue.isEmpty()) {

            // 현재 노드 꺼내기
            int cur = queue.poll();

            System.out.println("현재 방문 노드 : " + cur);

            // 연결된 노드 탐색
            for (int nxt : graph.get(cur)) {

                // 방문 안 했으면
                if (!visited[nxt]) {

                    visited[nxt] = true;

                    queue.offer(nxt);
                }
            }

            System.out.println("현재 Queue 상태 : " + queue);
            System.out.println();
        }
    }
}
