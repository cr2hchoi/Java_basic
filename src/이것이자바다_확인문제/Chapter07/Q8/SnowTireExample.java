package 이것이자바다_확인문제.Chapter07.Q8;

public class SnowTireExample {
    public static void main(String[] args) {
        SnowTire snowTire = new SnowTire();
        Tire tire = snowTire;
        snowTire.run();
        tire.run();
    }
}
