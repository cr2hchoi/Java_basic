package 이것이자바다_확인문제.Chaptor04;

public class Q4 {
    static void main(String[] args) {
        while (true) {
            int num1 = (int) (Math.random() * 6) + 1;
            int num2 = (int) (Math.random() * 6) + 1;

            System.out.println("(" + num1 + ", " + num2 + ")");

            if (num1 + num2 == 5) {
                break;
            }
        }
    }
}
