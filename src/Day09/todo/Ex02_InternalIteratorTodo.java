package Day09.todo;
import java.util.List;
public class Ex02_InternalIteratorTodo {
    public static void main(String[] args) {
        List<Integer> orderAmounts = List.of(12000, 35000, 8000, 64000, 17000);
        // TODO 1: stream()으로 주문 금액과 현재 스레드명을 출력하세요.
        orderAmounts.stream()
                .forEach(amount -> {
                    String threadName = Thread.currentThread().getName();
                    System.out.println("주문 금액: " + amount + " / 스레드명: " + threadName);
                });
        // TODO 2: parallelStream()으로 주문 금액과 현재 스레드명을 출력하세요.
        orderAmounts.parallelStream()
                .forEach(amount -> {
                    String threadName = Thread.currentThread().getName();
                    System.out.println("주문 금액: " + amount + " / 스레드명: " + threadName);
                });

        // TODO 3: 출력 순서가 항상 같지 않을 수 있는 이유를 주석으로 설명하세요.
        /*
         * [출력 순서가 항상 같지 않을 수 있는 이유]
         * 1. 병렬 스트림(parallelStream)은 데이터를 여러 개의 스레드로 나누어 동시에 처리합니다
         * 2. 어떤 스레드가 먼저 작업을 끝내고 결과를 출력하는지(스레드 스케줄링)는 CPU의 상황에 따라 매번 다릅니다.
         * 3. 따라서 리스트에 입력된 순서대로 출력되지 않고, 결과가 처리되는 속도에 따라 순서가 뒤섞여 출력될 수 있습니다.
         */

    }
}
