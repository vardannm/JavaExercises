package Discount;

public class NoDiscount implements DiscountStrategy{
    private double discountedAmount;
    public NoDiscount(double discountedAmount){
        this.discountedAmount = discountedAmount;
    }
    @Override
    public double applyDiscount(double amount){
        return discountedAmount;
    }
    public void showAmount(){
        System.out.println("your amount is " + discountedAmount + " $");
    }
}
