package Day10.todo.io.p04;

import java.io.File;
import java.io.FileReader;

public class MainTodo {
    public static void main(String[] args) throws Exception {
        // TODO 1: FileReader로 한 글자씩 읽기

        FileReader fileReader = new FileReader("src/Day10/todo/io/p04/test.txt");
        while (true){
            // 문자 입력 스트림에서는, int read()메서드 (1문자 = char = 2byte)로 읽음 . 읽은 문자 1개의 유니코드 값을 반환
            int data = fileReader.read(); //read() 메서드는 리턴값이 int임!
            if(data == -1 )
            {
                System.out.println("파일에 더이상 읽을 데이터가 없습니다.");
                break; // 파일 끝 도달시 -1 리턴, -1이 리턴되면 반복문 종료
            }
            // data에 있는 값이 -1이 아님을 확인 후 안전하게 char로 변환
            System.out.println((char) data);
        }
    }
}
