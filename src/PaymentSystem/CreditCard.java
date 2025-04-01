package PaymentSystem;

public class CreditCard implements PaymentMethod{
    private String cardNumber;
    public CreditCard(String cardNumber){
        this.cardNumber = cardNumber;
    }
    @Override
    public void processPayment(double amount) {
        System.out.println("Paid $" + amount + " using Credit Card: " + cardNumber);
    }
}
