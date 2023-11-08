import java.net.URL;

interface PaymentMethod{
    void pay();

}

class CreditCard implements PaymentMethod{
    public void pay(){
        System.out.println("Paying via credit card");
    }
}
class DebitCard implements PaymentMethod{
    public void pay(){
        System.out.println("Paying via debit card");
    }
}

class url implements PaymentMethod{
    public void pay(){
        System.out.println("Paying via UPI");
    }
}

public class InterfacePaymentMethodDemo {
    public static void makePayment(PaymentMethod pa){
        pa.pay();
    }

    public static void main(String[] args) {
        PaymentMethod payment = new url() ;
        makePayment(payment);

    }
}
