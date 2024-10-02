package cleancode.day4mission;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 주문 항목 생성
        Item item1 = new Item("상품1", 100);
        Item item2 = new Item("상품2", 200);

        // 고객 정보 생성
        Customer customer = new Customer("홍길동", "hong@example.com");

        // 주문 생성
        Order order = new Order();
        order.getItems().addAll(Arrays.asList(item1, item2)); // 아이템 추가
        order.setCustomer(customer); // 고객 설정

        // 주문 검증
        ValidateOrder validateOrder = new ValidateOrder();
        boolean isValid = validateOrder.validateOrder(order);

        // 결과 출력
        if (isValid) {
            System.out.println("주문이 유효합니다.");
        } else {
            System.out.println("주문이 유효하지 않습니다.");
        }
    }
}