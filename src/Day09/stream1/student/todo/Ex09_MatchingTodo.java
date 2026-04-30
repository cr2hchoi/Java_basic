package Day09.stream1.student.todo;

import java.util.Arrays;

public class Ex09_MatchingTodo {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6};

        // TODO 1: 모든 요소가 2의 배수인지 검사
        boolean allEven = Arrays.stream(arr)
                .allMatch(n -> n % 2 == 0);
        System.out.println("모든 요소가 2의 배수인가요? " + allEven);

        // TODO 2: 하나라도 3의 배수가 있는지 검사
        // anyMatch() :하나라도 조건을 만족하면 true가 나오는 메서드
        boolean anyMultiThree = Arrays.stream(arr).anyMatch(n-> n%3 == 0);
        System.out.println("3의 배수인 수가 있나요? " + anyMultiThree);

        // TODO 3: 3의 배수가 하나도 없는지 검사
       boolean noneMatchThree = Arrays.stream(arr)
            .noneMatch(n-> n%3 == 0);
        System.out.println("3의 배수가 하나도 없나요? "+ noneMatchThree);
}
}