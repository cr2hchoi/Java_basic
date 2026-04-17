package Day01;

import java.util.Scanner;

//자바의 메소드 연습 예제
//사용자에게 두개의 정수를 입력받아, add 라는 메소드를 호출하여 두 수의 합의 결과를 받아서 출력하세요.
public class MethodMakeTest {
    //클래스 전역 변수 선언
    static int num1, num2, sum;
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.print("첫번째 정수 입력 : ");
        num1 = input.nextInt();
        System.out.print("두번째 정수 입력 : ");
        num2 = input.nextInt();
        add(num1,num2);

        //MethodAdd 클래스에 속한 객체 생성
        MethodAdd DR = new MethodAdd();
        //sum이라는 전역변수를 받는 것보다 합산 결과(함수실행결과)를 변수값에 받아서 저장하는 것이 좋다.
//        int result = DR.add2(num1, num2);
        //add는 static 메소드라 (객체생성 없이 사용 가능 ) -> 클래스명.메소드로 직접 부르는게 좋다고 한다.
        int result2 = MethodAdd.add2(num1,num2);
        //subtract는 인스턴스 메소드라 (객체로만 접근 가능) -> 객체.메소드명으로 호출해야함
        int result3 = DR.subtract(num1,num2);
        System.out.println("result1에 담긴 합산 결과 : " + result2);
        System.out.println("result2에 담긴 차산 결과 : " + result3);
    }

    /* public static int add(int a, int b){
        sum = a + b;
        System.out.println("두 수의 합은? : " + sum);
        return sum;
    };*/

    //statc 메소드 : 객체 생성 없이 바로 실행됨
    public static void add(int a, int b){
        sum = a + b;
        System.out.println("두 수의 합은? : " + sum);
    }



}
//클래스로 만들어서 객체로 가져오는 연습
class MethodAdd{
    public static int add2(int n1, int n2){
        return n1 + n2;
    }
    public int subtract(int n1, int n2){
        return n1 - n2;
    }
}