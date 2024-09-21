public class Main {
    public static void main(String[] args) {
        final Duck duckVietNam = new DuckVietNam();

        duckVietNam.setFlyBehavior(new FlyInVietNamBehavior());
        duckVietNam.fly();

        duckVietNam.setFlyBehavior(new FlyNoThing());
        duckVietNam.fly();

    }
}
