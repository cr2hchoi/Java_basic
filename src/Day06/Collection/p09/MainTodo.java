package Day06.Collection.p09;

import java.util.ArrayList;
import java.util.List;

class StudentTodo {
    String name;
    int score;

    // TODO 1: 생성자 작성

    public StudentTodo(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

public class MainTodo {
    public static void main(String[] args) {
        // TODO 2: StudentTodo 리스트 생성
        // 제네릭 타입으로 StudentTodo 클래스 타입을 넣는다.
        List<StudentTodo> studentTodoList = new ArrayList<>();
        // TODO 3: 객체 3개 추가
        studentTodoList.add(new StudentTodo("최다래",90));
        studentTodoList.add(new StudentTodo("김민지",100));
        studentTodoList.add(new StudentTodo("정현준",50));
        // TODO 4: 평균 점수 출력

        int totalScore = 0;
        for (StudentTodo studentTodo : studentTodoList) {
            totalScore += studentTodo.score;
        }
        double average =  totalScore/studentTodoList.size();
        System.out.printf("평균 : %.1f", average);
    }
}
