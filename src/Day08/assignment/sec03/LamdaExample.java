package Day08.assignment.sec03;

//sec03-1 : 정의한 Workable,Speakable 인터페이스와 Person 클래스를 이용하여 아래 코드를 완성하세요
public class LamdaExample {
    public static void main(String[] args) {
        Person person = new Person();

        //매개변수가 두 개일 경우
        person.action1((name, job) -> {
            System.out.println(name + "이");
            System.out.println(job + "을 합니다.");
        });

        person.action1((name, job) -> {
            System.out.println(name + "이");
            System.out.println(job + "을 하지 않습니다.");
        });

        //매개변수가 한 개일 경우
        person.action2(content -> System.out.println("\"" + content + "\"" + "라고 말합니다."));
        person.action2(content -> System.out.println("\"" + content + "\"" + "라고 외칩니다."));
    }
}
