
package Day11.Recursion;
import java.util.*;

public class Permutations {
    //ArrayList 선언
    static List<List<Integer>> result = new ArrayList<>();
    //메인함수
    public static void main(String[] args) {
        int[] nums = {1, 2, 3}; //순열 만들 숫자들
        boolean[] visited = new boolean[nums.length];
        dfs(nums, new ArrayList<>(), visited);
        System.out.println(result);
    }


    //dfs 함수 선언
    static void dfs(int[] nums, List<Integer> curr, boolean[] visited) {
        // 순열 완성시 내보내기
        if (curr.size() == nums.length) { //curr리스트의 사이즈가 nums.length와 같다면 -> 모든 수가 선택된 것
            result.add(new ArrayList<>(curr)); //-> 결과 저장
            System.out.println("완성된 순열 : " + curr);
            return;
        }

        // 숫자 하나씩 선택
        for (int i = 0; i < nums.length; i++) {
            // visited=false = 아직 사용 안 한 수
            if (!visited[i]) {
                // visited=true로 바꾸며 선택
                curr.add(nums[i]);
                visited[i] = true;
                System.out.println(nums[i] + " 선택된 숫자 -> " + curr);
                // 이후 다음 자리 탐색
                dfs(nums, curr, visited);
                // 백트래킹
                visited[i] = false;
                curr.remove(curr.size() - 1);//선택 취소, 추가했던 노드의 이전 노드로 돌아감
                System.out.println(nums[i] + " 제거 -> " + curr);
            }
        }
    }
}