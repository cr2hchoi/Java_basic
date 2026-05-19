package Day11.Tree;

import java.util.*;

public class EdgeListToHashMap {

    public static void main(String[] args) {

        int[][] edges = {
                {1,2},
                {1,3},
                {2,4}
        };

        Map<Integer,List<Integer>> graph =
                new HashMap<>();

        for(int[] edge : edges){

            int from = edge[0];
            int to = edge[1];

            // 없으면 리스트 생성
            graph.putIfAbsent(
                    from,
                    new ArrayList<>()
            );

            graph.get(from).add(to);
        }

        System.out.println(graph);
    }
    static List<List<Integer>> graph = new ArrayList<>();
    static boolean[] visited;

    public static void dfs(int cur){

        visited[cur] = true;

        System.out.println(cur);

        for(int nxt : graph.get(cur)){

            if(!visited[nxt]){

                dfs(nxt);
            }
        }
    }
}