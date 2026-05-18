package Day11.Recursion;

//selectied 리스트 매개변수로 안넣고 depth로 계산
import java.util.*;

public class RecursionExample3 {

    public static void main(String[] args) {
        int[] nums = {4, 9, 7, 5, 1};
        int target = 15;
        int m = 3;

        boolean result = solution(nums, target, m);
        System.out.println("result = " + result);
    }

    static boolean solution(int[] nums, int target, int m) {
        return dfs(nums, target, m, 0, 0, 0);
    }

    static boolean dfs(int[] nums, int target, int m, int start, int sum, int depth) {

        System.out.println("depth=" + depth + ", sum=" + sum);

        if (depth == m) {
            System.out.println("최종 sum = " + sum);
            return sum == target;
        }

        for (int i = start; i < nums.length; i++) {

            sum += nums[i];
            System.out.println(nums[i] + " 선택 -> sum=" + sum);

            if (dfs(nums, target, m, i + 1, sum, depth + 1)) {
                return true;
            }

            sum -= nums[i];
            System.out.println(nums[i] + " 제거 -> sum=" + sum);
        }

        return false;
    }
}