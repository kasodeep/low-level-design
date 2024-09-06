package observer.weather;

import observer.Observer;
import observer.Subject;

import java.util.ArrayList;

public class WeatherData implements Subject {

    private final ArrayList<Observer> observers;

    private float temperature;

    private float humidity;

    private float pressure;

    public WeatherData() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int idx = observers.indexOf(o);
        if (idx >= 0){
            observers.remove(idx);
        }
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers){
            observer.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanged(){
        notifyObserver();
    }

    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
