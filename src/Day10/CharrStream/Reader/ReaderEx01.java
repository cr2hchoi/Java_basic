package Day10.CharrStream.Reader;

import java.io.*;

// 문자열 스트림 읽기
public class ReaderEx01 {
    public static void main(String[] args) {
        //C:/Temp/test3.txt 파일에 있는 문자 데이터를 ReaderEx01.java 파일로 읽어와 콘솔창에 데이터 출력
        try {
            Reader rd = new FileReader("C:/Temp/test3.txt");
            //while 1 한문자씩 읽어와 출력
            while(true){
                int data = rd.read();
                if(data == -1) break;
                System.out.println((char) data);
            }
            rd.close();
            System.out.println();
            //while 2 문자 배열로 읽어와 출력

            Reader rd2 = new FileReader("C:/Temp/test3.txt");
            char[] data = new char [1]; //읽은 문자 저장할 배열 생성
            int cycle = 1;
            while(true){
                int num = rd2.read(data); //읽은 문자 배열에 저장, 읽은 char의 수 리턴
                if(num == -1) break;
                System.out.println("--- [" + cycle + "번째 읽기, 읽은 문자열 수: " + num + "개] ---");
                for (int i = 0; i < num; i++) {
                    System.out.println(data[i]);
                }
                cycle++;
            }
            rd2.close();



        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
