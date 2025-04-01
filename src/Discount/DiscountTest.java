package Discount;

public class DiscountTest {
    public static void main(String[] args) {
        FlatDiscount firstAmount = new FlatDiscount();
        firstAmount.applyDiscount(2000);
        firstAmount.showAmount();
    }
}
