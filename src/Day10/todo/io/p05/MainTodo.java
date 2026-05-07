package Day10.todo.io.p05;

import java.io.BufferedReader;
import java.io.FileReader;

public class MainTodo {
    public static void main(String[] args) throws Exception {
        // TODO 1: BufferedReader로 첫 줄 읽고 출력
        // BufferReader의 readLine() 메서드 : 한 줄 통째로 읽어와 문자열로 출력 가능
        FileReader fileReader = new FileReader("src/Day10/todo/io/p05/text.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        //첫번째 줄 읽어오기
        String firstLine = bufferedReader.readLine();
        System.out.println(firstLine);

        //두번째 줄 읽기
        // readLine()메소드는 읽고 나면 두번째 줄로 커서를 이동시켜서, readLine()을 한 번 더 호출하면
        // 다음 줄의 내용이 자동으로 읽힘
        String secondLine = bufferedReader.readLine();
        System.out.println(secondLine);

        bufferedReader.close();
    }
}
