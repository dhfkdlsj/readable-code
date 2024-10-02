package cleancode.day4mission;

public class Item {
    private String name; // 아이템 이름
    private double price; // 아이템 가격

    // 생성자
    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Getter 메서드
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}