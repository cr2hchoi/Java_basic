package Day05.MultiThread;

public class Bridge {
    int counter; // 전체 통과 회수
    String name; //현재 통과 중인 기사의 이름
    String address; //현재 통과 중인 기사의 주소

    public Bridge() {
        counter = 0;
        name = "아무개";
        address = "모름";
    }

    //다리를 지나는 기사의 이름과 주소 , counter 값 기록
    // synchronized  : 동기화 키워드 (한 스레드가 지나갈 때 다른 스레드는 lock)
    // Critical Section : 여러 스레드가 공유자원을 사용할 때 경쟁 상태가 발생
    synchronized public void across(String name, String address) { //스레드가 재진입가능?(Thread safety)
        counter++;
        this.name = name;
        this.address = address;
        check();
    }

    public void check(){
        if(name.charAt(0) != address.charAt(0)){
            System.out.println("문제 발생!!!" + this);
        }
    }

    @Override
    public String toString() {
        return "Bridge{" +
                "counter=" + counter +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

