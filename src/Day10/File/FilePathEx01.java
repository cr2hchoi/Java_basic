package Day10.File;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

//File 경로를 출력하는 연습 코드
public class FilePathEx01 {
    public static void main(String[] args) {
        // File 객체를 생성하고 경로를 출력하세요

        File file = new File("C:/Temp/text.txt");
        if(file.exists() == true) {
            System.out.println("파일 경로 : "  + file.getPath());
        }else {
            System.out.println("파일이 존재하지 않습니다.");
            System.out.println("파일을 새로 만들까요? (1: 네, 2: 아니오)");
            Scanner sc = new Scanner(System.in);
            int userChoice = sc.nextInt();
            if ( userChoice== 1){
                try {
                    file.createNewFile();
                    System.out.println("파일 생성이 완료되었어요");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            } else {
                System.out.println("파일 생성을 취소합니다");
            }
        }
    }
}
