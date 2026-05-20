package 이것이자바다_확인문제.Chapter08.Q5;

public class TV implements Remocon {

    @Override
    public void powerOn() {
        System.out.println("TV를 켰습니다.");
    }

    public static void main(String[] args) {

        Remocon r = new TV();
        r.powerOn();
    }
}