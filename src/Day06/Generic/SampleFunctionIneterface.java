package Day06.Generic;

// 제네릭으로 타입을 받아, 해당 타입의 두 값을 더하는 인터페이스
interface IAdd<T> {
    public T add(T x, T y);
}

public class SampleFunctionIneterface {
    public static void main(String[] args) {
        // 제네릭을 통해 람다 함수의 타입을 결정
        IAdd<Integer> o = (x, y) -> x + y; // 매개변수 x와 y 그리고 반환형 타입이 int형으로 설정된다.

        int result = o.add(10, 20);
        System.out.println(result); // 30


        //더블타입 IAdd 인터페이스 구현
        IAdd<Double> d = (x2 , y2) -> x2 + y2;
        //파라미터의 타입 지정 및 오버로딩  자동으로 해줌
        double resultD =  d.add(10.0,20.0);
        System.out.println(resultD);

    }
}
