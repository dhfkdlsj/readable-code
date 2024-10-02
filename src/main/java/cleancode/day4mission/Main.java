package cleancode.day4mission;

public class Main {

    public static void main(String[] args) {
        Item item = new Item("쿠쿠다스", 100);

        Customer customer = new Customer("강희준");

        Order order = new Order(item, customer);

        Validate validate = new Validate();

        boolean isValid = validate.validateOrder(order);

        if (isValid) {
            System.out.println("주문이 유효합니다.");
            order.printOrderItems();
        } else {
            System.out.println("주문이 유효하지 않습니다.");
        }
    }

}