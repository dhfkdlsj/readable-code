package cleancode.day4mission;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Item> items; // 주문 항목 목록
    private Customer customer; // 고객 정보

    // 생성자
    public Order() {
        this.items = new ArrayList<>();
    }

    // 주문 항목 추가
    public void addItem(Item item) {
        this.items.add(item);
    }

    // 주문 항목 목록 가져오기
    public List<Item> getItems() {
        return items;
    }

    // 총 가격 계산
    public double getTotalPrice() {
        return items.stream().mapToDouble(Item::getPrice).sum();
    }

    // 고객 정보가 있는지 확인
    public boolean hasCustomerInfo() {
        return customer != null;
    }

    // 고객 정보 설정
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }


    public boolean ItemIsEmpty() {
        return items.isEmpty();
    }
}