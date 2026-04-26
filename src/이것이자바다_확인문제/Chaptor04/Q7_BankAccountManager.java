package 이것이자바다_확인문제.Chaptor04;

//Scanner 글씨 썬택하고 alt enter 하면 임포트 되기도 함
import java.util.Scanner;

public class Q7_BankAccountManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = 0;
        boolean run = true;

        while (run) {
            System.out.println("----------------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("----------------------------------");
            System.out.print("선택> ");

            int menuNo = Integer.parseInt(scanner.nextLine());

            switch (menuNo) {
                case 1:
                    System.out.print("예금액>");
                    balance += Integer.parseInt(scanner.nextLine());
                    break;
                case 2:
                    System.out.print("출금액>");
                    balance -= Integer.parseInt(scanner.nextLine());
                    break;
                case 3:
                    System.out.println("잔고>" + balance);
                    break;
                case 4:
                    run = false;
                    break;
            }
        }
        System.out.println("프로그램 종료");
    }
}

