package Day10.todo.io.p01;

import java.io.File;

//파일 객체 생성, 파일 경로 얻기 메소드 연습
public class MainTodo {
    public static void main(String[] args) {
        // TODO 1: File 객체를 생성하고 경로를 출력하세요.
        File file = new File("C:/Temp/file1.txt");
        System.out.println("file1.txt 경로 : " + file.getPath());
    }
}
