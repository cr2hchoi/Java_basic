package Day02.Inheritance.dogCat;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void eat(String name) {
        System.out.println(name + "가 냠냠 🐟");
        // super.eat(name); //오버라이딩 하긴 했는데 부모의 eat매서드를 그대로 사용하겠다는 뜻
    }

    @Override
    void hello(String name) {
        System.out.println(name + "(이)가 반갑다네옹 🐈");
    }

    @Override
    public void dance(String name) {
        super.dance(name);
        System.out.println("🐈" + name + " : (무시)");
    }
}
