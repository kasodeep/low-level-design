package observer.weather;

import observer.DisplayElement;
import observer.Observer;

public class StatisticsDisplay implements Observer, DisplayElement {

    private float maxTemp;

    private float minTemp;

    private float tempSum = 0.0f;

    private int numReadings;

    private final WeatherData weatherData;

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        tempSum += temp;
        numReadings++;

        maxTemp = Math.max(maxTemp, temp);
        minTemp = Math.min(minTemp, temp);
        display();
    }

    @Override
    public void unsubscribe() {
        weatherData.removeObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Avg/Min/Max temperature = "
                +(tempSum / numReadings) + "/" + minTemp + "/" + maxTemp);
    }
}
