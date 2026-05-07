package Day10.todo.io.p07;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainTodo {
    public static void main(String[] args)  {
        // TODO 1: input.bin 파일 내용을 copy.bin으로 복사

        //읽어올 파일 경로
        String inputPath = "src/Day10/todo/io/p07/input.bin";

        //복사할 파일 경로
        String outputPath = "src/Day10/todo/io/p07/copy.bin";

        //try- with- resources문 사용
        try (FileInputStream fis  = new FileInputStream(inputPath);
            FileOutputStream fos = new FileOutputStream(outputPath)){

                // 데이터를 임시로 담을 바이트 배열 (보통 1024바이트 또는 8192바이트 버퍼 사용)
                byte[] buffer = new byte[1024];
                int length; // 읽어온 바이트 수를 저장할 변수

                // read() 메서드로 읽어오고, -1(파일 끝)이 아닐 때까지 반복
            while ((length = fis.read(buffer)) != -1) {
                    // 읽어온 만큼(0부터 length까지) 파일에 작성
                    fos.write(buffer, 0, length);
                }

            System.out.println("파일 복사가 완료되었습니다.");
        } catch (IOException e) {
            System.out.println("파일 복사 중 오류가 발생했습니다.");
            e.printStackTrace();
        }



    }
}
