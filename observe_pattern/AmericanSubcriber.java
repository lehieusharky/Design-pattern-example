public class AmericanSubcriber implements Subcriber, Display {
    Publisher publisher;
    double temperature;

    AmericanSubcriber(Publisher publisher) {
        this.publisher = publisher;
        temperature = 100;
        publisher.addSubcriber(this);
    }

    @Override
    public void update(double temperature) {
        this.temperature = temperature;
        display();
    }

    @Override
    public void display() {
        System.out.println("Newset temperature from American " + this.temperature);
    }

}
