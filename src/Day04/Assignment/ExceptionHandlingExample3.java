package ch11.sec03.exam03;

//다중 예외 처리 코드 추가하세요.
public class ExceptionHandlingExample3 {
    public static void main(String[] args) {
        String[] array = {"100", "1oo", null, "200"};

        for(int i=0; i<=array.length; i++) {
            try {
                int value = Integer.parseInt(array[i]);
                System.out.println("array[" + i + "]: " + value);
            } catch (ArrayIndexOutOfBoundsException e){
                System.out.println("배열 인덱스가 초과됨: " + e.getMessage());
            }
            catch (NumberFormatException | NullPointerException e) {
                System.out.println("데이터에 문제가 있음: " + e.getMessage());
            } finally {
            }
        }
    }
}
