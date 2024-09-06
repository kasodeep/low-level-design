package observer.weather;

import observer.DisplayElement;
import observer.Observer;
import observer.Subject;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temperature;

    private float humidity;

    private final Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }

    @Override
    public void unsubscribe() {
        weatherData.removeObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature +" F degrees and " + humidity + "% humidity");
    }
}
