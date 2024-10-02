package cleancode.day4mission;

public class Customer {
    private String name; // 고객 이름
    private String email; // 고객 이메일

    // 생성자
    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Getter 메서드
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}