package Day11.Recursion;

import java.util.*;

public class Recursion {

    public static void main(String[] args) {
        int[] nums = {4, 9, 7, 5, 1};
        int target = 20;

        boolean result = solution(nums, target);
        System.out.println("결과 : " + result);
    }

    static boolean solution(int[] nums, int target) {
        return dfs(nums, target, 0, new ArrayList<>());
    }

    static boolean dfs(int[] nums,
                       int target,
                       int start,
                       List<Integer> selected) {

        // 현재 선택 상태 출력
        System.out.println("현재 selected : " + selected);
        // 숫자 3개 선택 완료
        if (selected.size() == 3) {
            int sum = 0;
            for (int n : selected) {
                sum += n;
            }

            System.out.println(
                    "합 계산 : " + selected + " = " + sum
            );
            // target과 같으면 true
            if (sum == target) {
                System.out.println(
                        "정답 찾음! -> " + selected
                );
                return true;
            }
            return false;
        }

        // 완전탐색
        for (int i = start; i < nums.length; i++) {
            // 선택
            selected.add(nums[i]);
            System.out.println(nums[i] + " 선택 -> " + selected);

            // 재귀 호출
            if (dfs(nums, target, i + 1, selected)) {return true;}

            // 백트래킹
            System.out.println(nums[i] + " 제거 전 -> " + selected);
            selected.remove(selected.size() - 1);
            System.out.println("제거 후 -> " + selected);
        }

        return false;
    }
}
