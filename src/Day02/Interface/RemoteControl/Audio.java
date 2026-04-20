package Day02.Interface.RemoteControl;

//RemoteControl 구현 클래스 Audio
public class Audio implements RemoteControl {
    @Override
    public void turnOff() {

    }

    @Override
    public void turnOn() {
        System.out.println("Audio를 켭니다.");
    }
}
