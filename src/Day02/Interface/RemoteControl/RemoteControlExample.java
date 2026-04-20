package Day02.Interface.RemoteControl;


public class RemoteControlExample {
    public static void main(String[] args) {
        //인터페이스 타입을 가진 참조 변수  선언
        //RemoteControl 인터페이스를 구현한 모든 객체를 대입할 수 있음
        //스택(Stack) 영역에 생성되며, 힙(Heap)에 있는 실제 객체를 가리킴.
        RemoteControl rc;

        //rc변수에 Television 객체를 대입
        rc = new Television();
        rc.turnOn();

        //rc 변수에 Audio 객체를 대입(교체)
        rc = new Audio();
        rc.turnOn();
    }
}
