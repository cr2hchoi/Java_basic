package Day06.Collection.p03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MainTodo {
    public static void main(String[] args) {
        // TODO 1: Set<Integer> 생성
        Set<Integer> set = new HashSet<>();

        // TODO 2: 10, 20, 10, 30 추가

        set.add(10);
        //자동 형변환
        /* int a = 10;
        Integer a1 = new Integer(a);
        set.add(a)
         */
       // set.add(10); //error : 같은 값 set에 추가 못함
        set.add(20);
        set.add(30);
        // TODO 3: 크기와 요소 출력
        System.out.println("컬렉션 크기 : " + set.size());
        System.out.println("컬랙션 내부 요소들 : " + set);

        // TODO 4 : iterator패턴 사용
        Iterator<Integer> iterator1 = set.iterator();
        while(iterator1.hasNext()){
            int result = iterator1.next();
            System.out.println(result);
        }
    }
}
