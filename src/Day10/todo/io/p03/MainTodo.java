package Day10.todo.io.p03;

import java.awt.*;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class MainTodo {
    public static void main(String[] args) throws Exception {
        // TODO 1: BufferedWriter 사용
        // 파일 경로 복사 (절대경로) : ctrl + shift + C
        FileWriter fileWriter = new FileWriter("src/Day10/todo/io/p03/test.txt");

        // BufferedWriter 는 보조 스트림으로 입출력 성능을 향상시켜준다
        // 메모리 내 임시 공간인 버퍼에 글자들을 저장한뒤, close()나 flush()를 호출할 때, 데이터를 한 번에 하드디스크로 보냄
        // Writer보다 처리 속도가 빠름
        // neLine()메소드를 제공하여 줄바꿈을 자동으로 처리해준다.
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        // TODO 2: 두 줄 쓰기
        bufferedWriter.write("JAVA");
        bufferedWriter.newLine();// 줄바꿈 추가
        bufferedWriter.write("JAVA");
        bufferedWriter.write("JAVA");
        // write로 쓴 데이터를 메모리 버퍼에 모두 기록해 놨다가,
        bufferedWriter.flush();
        // 를 통해 버퍼의 내용을 파일에 한번에 넣음

        bufferedWriter.close();
        // close() 메소드 호출시 자동으로 flush()메소드 먼저 실행

        System.out.println("파일 쓰기 완료!");
    }
}
