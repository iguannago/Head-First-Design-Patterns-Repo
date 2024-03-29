package observer_pattern.custom_design;

import observer_pattern.custom_design.observer.CurrentConditionDisplay;
import observer_pattern.custom_design.observer.ForecastDisplay;
import observer_pattern.custom_design.observer.HeatIndexDisplay;
import observer_pattern.custom_design.observer.StatisticsDisplay;
import observer_pattern.custom_design.subject.WeatherData;

/**
 * Created by davicres on 24/07/2016.
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        new CurrentConditionDisplay(weatherData);
        new StatisticsDisplay(weatherData);
        new ForecastDisplay(weatherData);
        new HeatIndexDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
