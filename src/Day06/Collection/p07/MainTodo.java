package Day06.Collection.p07;

import java.util.LinkedList;
import java.util.Queue;

public class MainTodo {
    public static void main(String[] args) {
        // TODO 1: Queue<String> 생성
        // Queue :LinkedList로 만드는 것이 보통
        Queue<String> queue = new LinkedList<>();
        // TODO 2: offer로 3개 추가
        queue.offer("작업1");
        queue.offer("작업2");
        queue.offer("작업3");
        // TODO 3: poll 하며 출력
        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
}
