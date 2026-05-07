package Day10.ByteStream.InputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

// 바이트 배열 입력 스트림 연습 예제
public class ByteArrayInputStream {
    public static void main(String[] args) {
        int cycle = 1; //몇번째 읽기인지 저장할 변수
        try {
            InputStream is = new FileInputStream("C:/Temp/text2.txt");

            byte[] data = new byte[1];

            while (true) {
                int num = is.read(data);//최대 3byte 읽고 읽은 바이트 data에 저장
                if (num == -1 )
                {
                    System.out.println(" - Finish! ");
                    break; //파일 끝에 도달했을 경우 와일문 종료
                }

                //몇 번째 읽기인지 표시
                System.out.println("--- [" + cycle + "번째 읽기, 읽은 바이트 수: " + num + "개] ---");
                //for문으로 바이트 데이터 출력
                for (int i = 0; i <num ; i++) {
                    System.out.println(data[i]);
                }
                cycle++;
            }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
