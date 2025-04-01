package Discount;

public class FlatDiscount implements DiscountStrategy{
    private double discountedAmount;
    @Override
    public double applyDiscount(double amount){
       double discountedAmount = amount*0.1;
       return discountedAmount;
    }
    public void showAmount(){
        System.out.println("your amount is " + discountedAmount + " $");
    }
}
