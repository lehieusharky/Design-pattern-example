import java.util.ArrayList;

public class WeatherStation implements Publisher {
    ArrayList<Subcriber> subcribers;
    double temperature;

    WeatherStation() {
        this.subcribers = new ArrayList<Subcriber>();
        temperature = 100;
    }

    @Override
    public void addSubcriber(Subcriber subcriber) {
        subcribers.add(subcriber);
    }

    @Override
    public void removeSubcriber(Subcriber subcriber) {
        // check the subscriber is exist of arrays
        subcribers.remove(subcriber);
    }

    @Override
    public void notifier() {
        for (Subcriber subcriber : subcribers) {
            subcriber.update(temperature);
        }
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(int newTemperature) {
        temperature = newTemperature;
        notifier();
    }

}
