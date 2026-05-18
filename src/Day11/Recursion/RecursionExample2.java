package Day11.Recursion;

import java.util.*;

public class RecursionExample2 {

    static boolean answer = false;

    public static void main(String[] args) {
        int[] nums = {4, 9, 7, 5, 1};

        int target = 15;
        int m = 3;

        solution(nums, target, m);
        System.out.println("최종 answer = " + answer);
    }

    static boolean solution(int[] nums, int target, int m) {
        return dfs(nums, target, m, 0, new ArrayList<>());
    }

    static boolean dfs(int[] nums,
                       int target,
                       int m,
                       int start,
                       List<Integer> selected) {

        System.out.println("현재 selected : " + selected);

        // m개 선택 완료
        if (selected.size() == m) {
            int sum = 0;
            for (int n : selected) {
                sum += n;
            }
            System.out.println(
                    selected + " 합 = " + sum);
            if (sum == target) {
                answer = true;
                System.out.println(
                        "정답 찾음! -> " + selected
                );
            }
            return false;
        }
        // 완전탐색
        for (int i = start; i < nums.length; i++) {
            // 선택
            selected.add(nums[i]);
            System.out.println(nums[i] + " 선택 -> " + selected);
            // 재귀
            dfs(nums, target, m, i + 1, selected);
            // 백트래킹
            System.out.println(nums[i] + " 제거 전 -> " + selected);
            selected.remove(selected.size() - 1);
            System.out.println(
                    "제거 후 -> " + selected
            );
        }
        return false;
    }
}
