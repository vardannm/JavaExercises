package PaymentSystem;

public class PaymentTest {
    public static void main(String[] args) {
        PayPal viaPayPaypal = new PayPal("vardan.torosyan40@gmail.com");
        viaPayPaypal.processPayment(3000);
    }
}
