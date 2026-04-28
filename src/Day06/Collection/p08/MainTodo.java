package Day06.Collection.p08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainTodo {
    public static void main(String[] args) {
        // TODO 1: 정수 리스트 생성 후 30, 10, 20 추가
        List<Integer> list = new ArrayList<>();
        list.add(30);
        list.add(30);
        list.add(30);
        // TODO 2: 오름차순 정렬 후 출력 (sort?)
        // list -> array 변환 : toArray()
        Integer[] array = list.toArray(new Integer[0]);
        //오름차순 정렬 (sort메소드)
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

    }
}
