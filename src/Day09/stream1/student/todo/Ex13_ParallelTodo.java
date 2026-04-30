package Day09.stream1.student.todo;

import java.util.List;
import java.util.stream.IntStream;

public class Ex13_ParallelTodo {
    public static void main(String[] args) {
        List<Integer> scores = IntStream.rangeClosed(1, 1_000_000).boxed().toList();

        // TODO 1: 일반 stream으로 평균과 처리 시간을 출력하세요.

        double avg1 = scores.stream().mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);

        // TODO 2: parallelStream으로 평균과 처리 시간을 출력하세요.

        // TODO 3: 병렬 스트림에서 공유 변수 누적이 위험한 이유를 주석으로 설명하세요.
    }
}
