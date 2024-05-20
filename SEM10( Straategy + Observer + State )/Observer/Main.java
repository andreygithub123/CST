package Observer;

public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        WeatherDisplay display1 = new WeatherDisplay();
        WeatherDisplay display2 = new WeatherDisplay();

        weatherStation.addObserver(display1);
        weatherStation.addObserver(display2);

        weatherStation.setMeasurmenets(32,32,32);
    }
}
