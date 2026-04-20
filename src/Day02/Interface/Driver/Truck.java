package Day02.Interface.Driver;

public class Truck implements Vehicle {
    @Override
    public void run() {
        System.out.println("트럭이 달립니다");
    }
}
