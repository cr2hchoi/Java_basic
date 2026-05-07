package Day10.todo.io.p06;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class MainTodo {
    public static void main(String[] args) {
        // TODO 1: try-with-resources로 BufferedWriter 사용 (ctrl + alt + T)
        try (Writer writer = new FileWriter("src/Day10/todo/io/p06/test.txt")) {
            BufferedWriter bufferedWriter = new BufferedWriter(writer);

            //파일에 내용 쓰기
            bufferedWriter.write("첫 번째 줄");
            bufferedWriter.newLine(); // 줄바꿈
            bufferedWriter.write("두 번째 줄");

            System.out.println("파일 작성이 완료되었습니다.");

        } catch (IOException e) {
//            throw new RuntimeException(e);
            System.out.println("파일을 쓰는 도중 오류가 발생했습니다.");
            e.printStackTrace();
        }


    }
}
