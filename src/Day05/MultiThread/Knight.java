package Day05.MultiThread;

//스레드 클래스 상속
public class Knight extends Thread {
    Bridge bridge; //공유 자원
    String name;
    String address;

    //생성자
    public Knight(Bridge bridge, String name, String address){
                this.address = address;
                this.name = name;
                this.bridge = bridge;
    }

    @Override
    public void run() {
        System.out.println(name + "기사가 도전한다.");
        while (true){
            bridge.across(name, address);
        }
    }
}
