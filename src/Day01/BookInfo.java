package Day01;
//스캐너 클래스로 타입에 맞게 사용자 입력을 받는 클래스입니다.

import java.util.Scanner;

public class BookInfo {
    public static void main(String[] args) {
        String title, publishing,author,isbn;
        int price,page;
        Scanner input = new Scanner(System.in);
        System.out.print("책 제목 입력 : ");
        title = input.next();
        System.out.print("책 가격 입력(숫자만 입력) : ");
        price = input.nextInt();
        System.out.print("출판사 입력 : ");
        publishing = input.next();
        System.out.print("책 저자 입력 : ");
        author = input.next();
        System.out.print("책 isbn 입력 : ");
        isbn = input.next();

        System.out.printf("책 제목  : %s\n", title);
        System.out.printf("책 가격  : %d\n", price);
        System.out.printf("출판사   : %s\n", publishing);
        System.out.printf("  저자   : %s\n", author);
        System.out.printf("ISBN : %s\n", isbn);
    }
}

