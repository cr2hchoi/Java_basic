package ch11.sec02.exam01;
//1)다음 프로그램의 문제점을 설명하고, 그 결과를 확인하세요.

/* public class ExceptionHandlingExample1 {
    public static void printLength(String data) {
        int result = data.length();
        System.out.println("문자 수: " + result);
    }

    public static void main(String[] args) {
        System.out.println("[프로그램 시작]\n");
        printLength("ThisIsJava02");
        printLength(null);
        System.out.println("[프로그램 종료]");
    }
} */

//실행 문제점 : nullpointException에 대한 예외 처리 X
//2)앞의 프로그램에 예외 처리 코드를 추가하세요.
//예외 처리시 출력할 메시지
//  예외 객체의 메시지로 출력
//  스택 추적 내용을 모두 출력

public class ExceptionHandlingExample1 {
    public static void printLength(String data) {
        try {
            int result = data.length();
            System.out.println("문자 수: " + result);
        } catch (NullPointerException e) {
//            throw new RuntimeException(e);
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finally 구문 실행");
        }
    }

    public static void main(String[] args) {
        System.out.println("[프로그램 시작]\n");
        printLength("ThisIsJava02");
        printLength(null);
        System.out.println("[프로그램 종료]");
    }
}