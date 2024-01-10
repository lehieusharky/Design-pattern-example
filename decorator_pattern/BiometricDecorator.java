package decorator_pattern;

public class BiometricDecorator extends DecoratorPayment {

    public BiometricDecorator(Payment payment) {
        super(payment);
    }

    @Override
    public void check() {
        super.check();
        bioCheck();
    }

    public void bioCheck() {
        System.out.println("Biometric check");
    }

}
