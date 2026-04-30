package Day09.stream1.student.todo;

import java.util.Arrays;

public class Ex08_LoopingTodo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        // TODO 1: 짝수만 필터링하고 peek로 중간 출력한 뒤 sum으로 합계를 구하세요.
        //peek() 중간 처리 -> 출력, 최종처리(sum)이 호출되기 전까지 실행되지 않도록 한다.
        int totalValue = Arrays.stream(arr)
                .filter(n -> n % 2 == 0)
                .peek(n -> System.out.println("peek() 중간값 확인" + totalValue))
                .sum();
        // TODO 2: forEach로 짝수만 최종 출력하세요.
        Arrays.stream(arr)
                .filter(n -> n % 2 == 1)
                .forEach(System.out::println);

    }
}
