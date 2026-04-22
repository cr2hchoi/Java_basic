package Day04;

public class ExceptionHandlingExample {
    public static void printLength(String data){
        int result = 0;
        try {
            result = data.length();
        } catch (NullPointerException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("Finally 문은 항상 실행됩니다.");
        }
        System.out.println("문자수: " + result);
    }

    public static void main(String[] args) {




    }

}
