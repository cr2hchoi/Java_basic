package Day10.CharrStream.Wirter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

//문자열 출력 연습 예제
public class WriterEx01 {
    public static void main(String[] args) {
        //C:Temp/test3.txt를 출력하세요.
        try {
            // 문자 기반 출력 스트림 생성
            Writer wt = new FileWriter("C:/Temp/test3.txt");
                wt.write("A");
                int ch1 = 65;
                wt.write(ch1);
                System.out.println( "파일 작성 완료");

                wt.flush();//버퍼 잔류한 문자들 출력 후 버퍼 비움
                wt.close(); //출력 스트림 닫기
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
