package cleancode.day4mission;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private final List<Item> items = new ArrayList<>();
    private final Customer customer;

    public Order(Item item, Customer customer) {
        this.items.add(item);
        this.customer = customer;
    }

    public double getTotalPrice() {
        int total = 0;
        for (Item item : items) total += item.getPrice();
        return total;
    }

    public boolean hasCustomerInfo() {
        return customer != null;
    }

    public boolean ItemIsEmpty() {
        return items.isEmpty();
    }

    public void printOrderItems() {
        if (items.isEmpty()) {
            System.out.println("주문 항목이 없습니다.");
        } else {
            System.out.println("주문 항목:");
            for (Item item : items) {
                System.out.println("구매자: " + customer.getName() + ", 상품명: " + item.getName() + ", 가격: " + item.getPrice());
            }
        }
    }
}