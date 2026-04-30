package Day09.stream1.student.todo;

import java.util.Arrays;

public class Ex10_BasicAggregateTodo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        // TODO: 짝수 기준 count, sum, average, max, min을 구하고 출력하세요.
        long count = Arrays.stream(arr)
                .filter(n->n%2 ==0)
                .count();
        System.out.println("짝수의 개수 : "+ count);

        int sum = Arrays.stream(arr)
                .filter(n->n%2 ==0)
                .sum();
        System.out.println("짝수의 총합: "+ sum);

        double average = Arrays.stream(arr)
                .filter(n->n%2 ==0)
                .average().orElse(0.0); //average는 옵셔널 ?이 있어서 이렇게 기본값 처리가 필요하다고 함
        System.out.println("짝수의 평균: " + average);

        int max = Arrays.stream(arr)
                .filter(n->n%2 ==0)
                .max().orElse(0);
        System.out.println("짝수 중 가장 큰 수: "+ max);

        int min = Arrays.stream(arr)
                .filter(n->n%2 ==0)
                .min().orElse(0);
        System.out.println("짝수 중 가장 작은 수: " + min);

        // TODO: 3의 배수 중 첫 번째 값을 findFirst로 구하세요.
        long findFirst = Arrays.stream(arr)
                .filter(n->n%3==0)
                .findFirst().orElse(0);
        System.out.println("3의 배수 중 첫번째 값: " + findFirst);
    }
}
