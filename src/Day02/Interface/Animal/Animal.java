package Day02.Interface.Animal;

//public  class Animal
public abstract class Animal {
    //메소드 선언
    public void breathe() {
        System.out.println("숨을 쉽니다.");
    }
    //추상 메소드 선언
    public abstract void sound();
    // 에러: 비추상 클래스에 추상 매서드가 있습니다.

}

