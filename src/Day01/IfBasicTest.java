package Day01;

import java.util.Scanner;

//if 문 연습 예제
public class IfBasicTest {
    public static void main(String[] args) {
        //정수 1개를 입력받아 입력된 수가 7의 배수인지를 출력하세요.
        Scanner input = new Scanner(System.in);
        System.out.println("정수를 입력하세요 : ");
        int num = input.nextInt();
        if (num%7 == 0){
            System.out.println("입력한 수 " + num + "은 7의 배수입니다.");
        }else{
            System.out.println("입력한 수 " + num + "은 7의 배수가 아닙니다.");
        }
    }
}

