public class VietNamSubcriber implements Subcriber, Display {

    Publisher publisher;
    double temperature;

    VietNamSubcriber(Publisher publisher) {
        this.publisher = publisher;
        temperature = 100;
        this.publisher.addSubcriber(this);
    }

    @Override
    public void update(double newTemperature) {
        this.temperature = newTemperature;
        display();
    }

    @Override
    public void display() {
        System.out.println("Newest temperature from VietNam: " + temperature);
    }

}
