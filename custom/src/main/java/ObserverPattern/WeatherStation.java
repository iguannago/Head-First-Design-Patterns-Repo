package ObserverPattern;

import ObserverPattern.observer.CurrentConditionDisplay;
import ObserverPattern.observer.ForecastDisplay;
import ObserverPattern.observer.HeatIndexDisplay;
import ObserverPattern.observer.StatisticsDisplay;
import ObserverPattern.subject.WeatherData;

/**
 * Created by davicres on 24/07/2016.
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
