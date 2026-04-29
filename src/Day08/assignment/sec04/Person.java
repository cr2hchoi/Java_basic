package Day08.assignment.sec04;

//sec04 : 다음과 같이 Calculable 인터페이스와 Person 클래스를 정의하세요
public class Person {
    public void action(Calculabe calculabe){
        double result = calculabe.calc(10,4);
        System.out.println("결과: " + result);
    }
}
