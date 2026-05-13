package Day11.Graph;

import java.util.ArrayList;
import java.util.List;

public class EdgeListToAdjList {

    public static void main(String[] args) {
        int answer = 0;
        int n = 5;
        int[][] edges = {
                {0, 1},
                {0, 2},
                {0, 4},
                {1, 3},
                {2, 4},
                {3, 4}
        };
        // 인접 리스트 생성 (리스트안에 리스트가 들어있는 구조)
        List<List<Integer>> graph = new ArrayList<>(n);

        // 정점 개수만큼 빈 리스트 생성 (n=5);
        for (int i = 0; i < n; i++){
            graph.add(new ArrayList<>());
        }

        // 간선 정보를 이용해 인접 리스트 구성
        for (int[] edge : edges ){
            graph.get(edge[0]).add(edge[1]); // 인덱스 0번의 노드를 받아와서 1번의 값을 추가한다.
            graph.get(edge[1]).add(edge[0]); //무방향 그래프 -> 0에도 1 추가, 1에도 0 추가
        }
        System.out.println(graph);
        // [[1, 2, 4], [0, 3], [0, 4], [1, 4], [0, 2, 3]]

    }
}
