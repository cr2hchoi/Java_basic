package Day06.Map;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(); //빈 리스트 생성
        list.add("Test1"); //초기 데이터 구성

        // 일일히 데이터 하나씩 넣기 힘들때 사용하는 of 메서드
        // 가변 매개변수로 운영되어 원하는 만큼 추가할 수 있다.
        // 단, List.of()로 만든 리스트는 내용을 변경할 수 없다.(ReadOnly)
        List<String> list2 = List.of("test1", "test2", "test3");
        System.out.println(list2);
    }

}
