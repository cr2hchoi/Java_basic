package Day10.todo.io.p02;

import java.io.FileWriter;
import java.io.IOException;

//Filewriter 객체 생성한 뒤 경로에 맞는 파일에 작성하기
public class MainTodo {
    public static void main(String[] args) throws Exception {
        // TODO 1: FileWriter로 test.txt에 "Java" 쓰기
        FileWriter fileWriter = new FileWriter("C:/Temp/test.txt");
        try {
            System.out.println("작성 성공");
            fileWriter.write("JAVA");


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        // TODO 2: close 호출
        fileWriter.close();
    }
}
