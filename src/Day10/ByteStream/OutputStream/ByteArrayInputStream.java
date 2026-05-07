package Day10.ByteStream.OutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

// 바이트 배열 출력 스트림 연습 예제
public class ByteArrayInputStream {
    public static void main(String[] args) {
        OutputStream os = null;
        try {
            os = new FileOutputStream("C:/Temp/text2.txt");

            //바이트 배열 선언
            byte[] data = {1, 2, 3};
            os.write(data);
            System.out.println("파일이 성공적으로 생성되었습니다.");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                os.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
