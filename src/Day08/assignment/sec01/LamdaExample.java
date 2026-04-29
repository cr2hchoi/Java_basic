package Day08.assignment.sec01;

//sec1-1 : Calculator 인터페이스를 이용해서 , 다음 출력이 나오도록 다음 코드를 완성하세요
/* 출력 결과
result: 14
result:6
 */
public class LamdaExample {
    public static void main(String[] args) {
        //x + y 계산
        int sum = action((x, y) -> x+y);
        // x - y 계산
        int diff = action((x, y) -> x-y);

        //출력
        System.out.println("result: " + sum);
        System.out.println("result: " + diff);
    }

    public static int action(Calculable calculable){
        //데이터
        int x = 10;
        int y = 4;

        //데이터 처리
        int result = calculable.calculate(x,y);

        return result;
    }
}
