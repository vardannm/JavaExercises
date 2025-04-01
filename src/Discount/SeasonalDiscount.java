package Discount;

public class SeasonalDiscount implements DiscountStrategy {
    private double discountedAmount;



    @Override
    public double applyDiscount(double amount) {
        if (amount > 200) {
            double discountedAmount = amount * 0.2;
            return discountedAmount;
        } else {
            double discountedAmount = amount * 0.1;
            return discountedAmount;
        }
    }
    public void showAmount(){
        System.out.println("your amount is " + discountedAmount + " $");
    }
}