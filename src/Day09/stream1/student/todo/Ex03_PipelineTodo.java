package Day09.stream1.student.todo;

import Day09.stream1.common.*;
import java.util.List;

public class Ex03_PipelineTodo {
    public static void main(String[] args) {
        List<Student> students = List.of(
            new Student("홍길동", "남", 10),
            new Student("신용권", "남", 20),
            new Student("유미선", "여", 30),
                new Student("최다래","여",24)
        );

        // TODO 1: stream -> mapToInt(Student::getScore) -> average -> orElse(0.0)로 평균을 구하세요.
        //파이프라인 설정하기
        double avg = students.stream()
                .mapToInt(Student::getScore)
                .average().orElse(0.0);

        System.out.println("평균 점수: " + avg);

    }
}
