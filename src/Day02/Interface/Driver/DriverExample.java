package Day02.Interface.Driver;

import java.util.Scanner;

//다형성 예제 Driver 클래스 실행 클래스
public class DriverExample {
    public static void main(String[] args) {
        Driver driver = new Driver();

        //Vehicle 구현 객체 생성(
        Bus bus = new Bus();
        Taxi taxi = new Taxi();
        Truck truck = new Truck();

        //사용자에게 메뉴 제시
        //운전할 차를 선택하세요 (1) Taxi, (2) Bus
        //운전자의 선택에 따라 실제 운전

        System.out.println("운전할 차를 선택하세요 1.🚕 Taxi, 2.🚌 Bus 3.🛻Truck ");
        Scanner scanner = new Scanner(System.in);
        int pickDrive = scanner.nextInt();

        if (pickDrive == 1){
            System.out.println("--if문 실행 결과--");
            taxi.run();
        }else if (pickDrive ==2){
            System.out.println("--if문 실행 결과--");
            bus.run();
        } else if (pickDrive ==3) {
            System.out.println("--if문 실행 결과--");
            truck.run();
        }

        //배열로 실행
        Vehicle cars[] = {
                new Taxi(),
                new Bus(),
                new Truck(),
        };

        System.out.println("--배열로 출력한 결과--");
        cars[pickDrive-1].run();

        //매개값으로 구현 객체 대입 (다형서이 실행결과가 다름)
        System.out.println("--매개값으로 구현 객체 대입--");
        driver.drive(bus);
        System.out.println("--매개값으로 구현 객체 대입--");
        driver.drive(taxi);

    }
}
