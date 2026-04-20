package Day02.Interface.Driver;

//Vehicle 인터페이스 구현 클래스 Bud
public class Bus implements Vehicle {
    //추상 메소드 재정의
    @Override
    public void run() {
        System.out.println("버스가 달립니다.");
    }

    //추가 메소드
    public void checkFare(){
        System.out.println("승차 요금을 체크합니다.");
    }
}
