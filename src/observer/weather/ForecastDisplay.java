package observer.weather;

import observer.DisplayElement;
import observer.Observer;

public class ForecastDisplay implements Observer, DisplayElement {

    private float currentPressure = 29.9f;

    private float lastPressure;

    private final WeatherData weatherData;

    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        lastPressure = currentPressure;
        currentPressure = pressure;
        display();
    }

    @Override
    public void unsubscribe() {
        weatherData.removeObserver(this);
    }

    @Override
    public void display() {
        System.out.print("Forecast: ");
        if (currentPressure > lastPressure){
            System.out.println("Improving weather on the way!");
        }else if (currentPressure < lastPressure){
            System.out.println("Watch out for cooler, rainy weather!");
        }else{
            System.out.println("More of the same!");
        }
    }
}
