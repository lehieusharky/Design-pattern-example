public abstract class Duck {

    private FlyBehavior flyBehavior;

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public abstract void swim();

    public void fly() {
        this.flyBehavior.fly();
    };
}
