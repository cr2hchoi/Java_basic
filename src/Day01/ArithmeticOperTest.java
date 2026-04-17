package Day01;

public class ArithmeticOperTest {
    public static void main(String[] args) {
        //나누기와 나머지 연산자를 이용해 정수의 자리수 계산
        int digit = 3625;
        //1의 자리 구하기
        System.out.println(digit%10);
        //10의 자리 구하기
        System.out.println(digit/10%10);
        //100의 자리 구하기
        System.out.println(digit/100%10);
        //1000의 자리 구하기
        System.out.println(digit/1000%10);

        //나머지 연산자로 짝수인지 홀수인지 체크
        int su = 5;
        if(su%2 == 0 ){
            System.out.println("짝수");
        } else {
            System.out.println("홀수");
        }

        int number = 2579;

    }
}

