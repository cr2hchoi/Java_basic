package Day09.todo;
import Day09.todo.common.Order;

import java.util.List;
import java.util.stream.Collectors;

public class Ex03_PipelineTodo {
    public static void main(String[] args) {
        List<Order> orders = List.of(new Order(1,"홍길동","DONE",30000), new Order(2,"김수영","READY",12000), new Order(3,"이민호","DONE",45000), new Order(4,"오해영","CANCEL",9000));
        // TODO: 상태가 DONE인 주문만 필터링한 뒤 amount로 변환하고 평균 금액을 구하세요.
        // 조건: 결과가 없으면 0.0을 출력하세요.
        double averageAmount = orders.stream()
                .filter(order -> "DONE".equals(order.getStatus())) // 상태가 "DONE"인 주문 필터링
                .mapToInt(Order::getAmount) // amount(금액)으로 변환
                .average() // 평균 계산
                .orElse(0.0); // 결과가 없으면 0.0 반환

    }
}
