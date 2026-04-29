package Day08.assignment.sec02;

// sec02-1 : Workable 인터페이스와 Person 클래스를 이용하여 코드를 완성하세요
public class LamdaExample {
    public static void main(String[] args) {
        Person person = new Person();

        //실행문이 두 개 이상인 경우 중괄호 필요
        person.action(()-> {
            System.out.println("출근을 합니다.");
            System.out.println("프로그래밍을 합니다.");
        });

        //실행문이 한 개일 경우 중괄호 생략 가능
        person.action(()-> System.out.println("퇴근합니다."));
    }
}
