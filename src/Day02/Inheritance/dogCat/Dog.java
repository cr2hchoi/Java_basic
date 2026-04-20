package Day02.Inheritance.dogCat;

//동적 측면에서 클래스 설계하기 예제
public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat(String name) {
        System.out.println(name + "가 냠냠 🦴");
    }

    @Override
    void hello(String name) {
        System.out.println(name + "(이)가 반갑대요!!!!!! 🐕 (왈왈)");
    }

    @Override
    public void dance(String name) {
        super.dance(name);
        System.out.println("🐶" + name + ": (왕왕)");
        System.out.println(name + "이는 하찮은 몸부림 중이다.");
    }


}
