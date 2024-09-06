package observer;

import observer.weather.CurrentConditionsDisplay;
import observer.weather.ForecastDisplay;
import observer.weather.StatisticsDisplay;
import observer.weather.WeatherData;

public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay conditionsDisplay = new CurrentConditionsDisplay(weatherData);
        new ForecastDisplay(weatherData);
        new StatisticsDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);

        conditionsDisplay.unsubscribe();
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
