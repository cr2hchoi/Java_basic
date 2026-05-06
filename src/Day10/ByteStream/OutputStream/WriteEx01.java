package Day10.ByteStream.OutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

//1바이트 출력 스트림 연습 예제
public class WriteEx01 {
    public static void main(String[] args) {
        //출력 전용 스트림 객체 생성
        try {
            OutputStream os = new FileOutputStream("C:/temp/test.txt");
            byte c1 = 1;
            byte c2 = 2;
            byte c3 = 3;

            //1byte씩 출력
            os.write(c1);
            os.write(c2);
            os.write(c3);

            os.flush(); // 내부 버퍼에 잔류하는 바이트 출력 후 버퍼 비우기
            os.close(); // 출력 스트림 닫고 사용한 메모리 해제
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
