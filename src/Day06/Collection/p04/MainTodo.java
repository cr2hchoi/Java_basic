package Day06.Collection.p04;

import java.util.HashMap;
import java.util.Map;

public class MainTodo {
    public static void main(String[] args) {
        // TODO 1: Map<String, Integer> 생성
        Map<String,Integer> scores = new HashMap<>();
        // TODO 2: 국어 90, 영어 80, 수학 95 저장
        scores.put("국어",80);
        // scores.put("국어",80); //key 값은 중복되면 안됨
        scores.put("수학",95);
        scores.put("영어",80);
        // TODO 3: 영어 점수 출력

        Integer KoScore = scores.get("국어");
        Integer MaScore = scores.get("수학");
        Integer EnScore = scores.get("영어");

        System.out.println("국어 점수: " + scores.get("국어"));
        System.out.println("수학 점수: " + MaScore); // 이미 담아둔 변수 활용
        System.out.println("영어 점수: " + EnScore);

    }
}
