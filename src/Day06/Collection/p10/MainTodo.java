package Day06.Collection.p10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Student {
    private String student;
    private Integer score;
    private Integer height;

    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }
}


public class MainTodo {
    public static void main(String[] args) {
        // TODO 1: List<Map<String, Object>> 구조를 사용해 학생 2명 정보 저장
        // 점수와 이름의 데이터 타입이 각각 다르기 때문에 Object로 정의
        List<Map<String,Object>> studentsList = new ArrayList<>();
        Map<String,Object> s1 = new HashMap<>();
        // 이름, 점수 키 사용
        s1.put("이름","최다래");
        s1.put("점수",99);
        // studentlist에 학생 정보 담기
        studentsList.add(s1);

        Map<String,Object> s2 = new HashMap<>();
        // 이름, 점수 키 사용
        s2.put("이름", "김정하");
        s2.put("점수", 100);
        // studentlist에 학생 정보 담기
        studentsList.add(s2);

        // TODO 2: 모든 학생 정보 출력
        for (Map<String, Object> student : studentsList){
            //key값으로 value get 해오기
            System.out.println("이름: " + student.get("이름") + " 점수: " + student.get("점수"));
        }


    }
}
