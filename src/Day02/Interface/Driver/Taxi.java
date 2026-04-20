package Day02.Interface.Driver;

public class Taxi implements Vehicle {
    @Override
    public void run() {
        System.out.println("택시가 달립니다");
    }
}
