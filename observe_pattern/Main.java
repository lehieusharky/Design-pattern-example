public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        VietNamSubcriber vietNamSubcriber = new VietNamSubcriber(weatherStation);
        AmericanSubcriber americanSubcriber = new AmericanSubcriber(weatherStation);

        weatherStation.setTemperature(101);
    }
}