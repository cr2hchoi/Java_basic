package Day08.assignment.sec04;

//sec04-1 : 앞에서 정의한 인터페이스와 클래스를 이용하여 아래 코드를 완성하세요
public class LamdaExample {
    public static void main(String[] args) {
        Person person = new Person();

        //실행문이 두 개 이상일 경우
        person.action((x, y) -> {
            double result = x+y;
            return result;
        });

        //sun()메서드를 호출
        person.action((x, y) -> sum(x,y));
    }

    public static double sum(double x, double y){
        return (x + y);
    }
}
