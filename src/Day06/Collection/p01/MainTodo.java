package Day06.Collection.p01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//과목명을 저장하는 list 만들기
public class MainTodo {
    public static void main(String[] args) {
        // TODO 1: List<String> 생성
        // List 인터페이스를 상속받는 ArrayList 타입의 객채 생성
        List<String> Subtitle = new ArrayList<>();
        // TODO 2: "Java", "Spring", "Vue" 추가
        Subtitle.add("Java");
        Subtitle.add("Spring");
        Subtitle.add("Vue");

        // TODO 3: 전체 요소 출력 (단순 출력)
        System.out.println(Subtitle);

        // TODO 4 : forEach로 전체요소 출력 (향상된 for문)
        // : -> 이터레이터인터페스에서 구현한 내부 반복자 (내부적으로 Iteraror가 동작중)
        // iterator의 hasNext()나 next()호출 필요 없음
        // for (요소를담을변수 : 컬렉션) {//반복실행코드}
        // iter라고 단축어 있음!
        for (String s : Subtitle){
            System.out.println(s);
        }
        // TODO 5 : Iterator 패턴으로 구현
        Iterator iterator = Subtitle.iterator(); //제네릭 생략시 내부데이터 모두 Object로 취급
        while (iterator.hasNext()){
            // 컬렉션에 저장된 객체를 Object 타입으로 받아서 저장 -> 다운캐스팅(강제 형변환) 필요
            String result = (String) iterator.next();
            System.out.println(result);
        }

        // TODO 6 : Iterator 제네릭으로 선언하기
        Iterator<String> iterator1 = Subtitle.iterator();
        while (iterator.hasNext()){
            //형변환 없이 바로 String으로 받을 수 있음!
            String result = iterator1.next();
            System.out.println(result);
        }
    }
}
