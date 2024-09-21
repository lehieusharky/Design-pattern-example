package decorator_pattern;

public class ApplePay implements Payment {

    @Override
    public void check() {
        System.out.println("Apple check");

    }

}
