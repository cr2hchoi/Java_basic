package Day02.Interface.RemoteControl;

//생성 후 인터페이스 구현한 클래스
public class Television implements RemoteControl {
    @Override
    public void turnOff() {

    }

    //클래스 implements로 생성 후 alt+enter ->메서드 구현 하기
    @Override
    public void turnOn() {
        System.out.println("TV를 켭니다.");
    }
}
