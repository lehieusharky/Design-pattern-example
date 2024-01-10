package decorator_pattern;

public abstract class DecoratorPayment implements Payment {
    private Payment wrappee;

    public DecoratorPayment(Payment payment) {
        this.wrappee = payment;
    }

    @Override
    public void check() {
        wrappee.check();
    }
}
