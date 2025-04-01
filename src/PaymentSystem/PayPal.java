package PaymentSystem;

public class PayPal implements PaymentMethod {
    private String emailAddress;
    public PayPal(String emailAddress){
        this.emailAddress = emailAddress;
    }
    @Override
    public void processPayment(double amount){
        System.out.println("Payment done via" + emailAddress + "amount of" + amount);
    }
}
