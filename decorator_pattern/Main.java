package decorator_pattern;

public class Main {
    public static void main(String[] args) {
        Payment applePay = new BiometricDecorator(new BotDecorator(new ApplePay()));

        applePay.check();
    }
}
