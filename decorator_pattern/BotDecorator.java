package decorator_pattern;

public class BotDecorator extends DecoratorPayment {

    public BotDecorator(Payment payment) {
        super(payment);

    }

    @Override
    public void check() {
        super.check();
        botCheck();
    }

    public void botCheck() {
        System.out.println("Bot check");
    }

}
