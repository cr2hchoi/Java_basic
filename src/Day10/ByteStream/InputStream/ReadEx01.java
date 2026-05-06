package Day10.ByteStream.InputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

// 1바이트 읽기 입력 스트림 연습 예제
public class ReadEx01 {
    public static void main(String[] args) {
        try {
            InputStream is = new FileInputStream("C:/temp/test.txt");
            while (true){
                int data = is.read(); //1바이트 데이터 읽고 읽은 바이트 리턴
                if(data == -1) break; // -1을 리턴했을 경우(파일의 끝에 도달했을 경우), while문 종료
                System.out.println(data);
            }
            is.close(); //입력 스트림 닫고 사용 메모리 해제
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
