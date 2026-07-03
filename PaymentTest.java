interface Payment {
    void makePayment(int amt);        
    String getPaymentMethod();        
}
class CreditCard implements Payment {
    String cardNo;
    int amount;
    public CreditCard(String cardNo) {
        this.cardNo = cardNo;
    }
    public void makePayment(int amt) {
        this.amount = amt;
        System.out.println("Paid " + amt + " using Credit Card: " + cardNo);
    }

    public String getPaymentMethod() {
        return "Credit Card";
    }
}
class UPI implements Payment {
    String upiId;
    int amount;
    public UPI(String upiId) {
        this.upiId = upiId;
    }
    public void makePayment(int amt) {
        this.amount = amt;
        System.out.println("Paid " + amt + " using UPI ID: " + upiId);
    }
    public String getPaymentMethod() {
        return "UPI";
    }
}
public class PaymentTest {
    public static void main(String[] args) {
        Payment p1 = new CreditCard("1234-5678");
        p1.makePayment(500);
        System.out.println("Payment Method: " + p1.getPaymentMethod());
        Payment p2 = new UPI("abc@upi");
        p2.makePayment(1000);
        System.out.println("Payment Method: " + p2.getPaymentMethod());
    }
}