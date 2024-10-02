package cleancode.day4mission;

import java.util.logging.Logger;

public class Validate {

    private static final Logger log = Logger.getGlobal();

    public boolean validateOrder(Order order) {
        if (hasNoOrder(order)) {
            log.info("주문 항목이 없습니다.");
            return false;
        }
        if (isTotalPricePositive(order)) {
            if (order.hasCustomerInfo()) {
                return true;
            }
            log.info("사용자 정보가 없습니다.");
            return false;

        }
        log.info("올바르지 않은 총 가격입니다.");
        return false;
    }

    private static boolean isTotalPricePositive(Order order) {
        return order.getTotalPrice() > 0;
    }

    private static boolean hasNoOrder(Order order) {
        return order.ItemIsEmpty();
    }


}