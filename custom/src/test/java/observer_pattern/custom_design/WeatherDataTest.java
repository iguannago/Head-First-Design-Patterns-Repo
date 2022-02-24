package observer_pattern.custom_design;

import observer_pattern.custom_design.observer.*;
import observer_pattern.custom_design.subject.WeatherData;
import org.junit.Test;

/**
 * Created by davicres on 19/09/2016.
 */
public class WeatherDataTest {

    private final WeatherData weatherData = new WeatherData();

    @Test
    public void currentConditionDisplayTest() {
        new CurrentConditionDisplay(weatherData);
        weatherData.notifyObservers();
    }

    @Test
    public void forecastDisplayTest() {
        new ForecastDisplay(weatherData);
        weatherData.notifyObservers();
    }

    @Test
    public void heatIndexDisplayTest() {
        new HeatIndexDisplay(weatherData);
        weatherData.notifyObservers();
    }

    @Test
    public void statisticsDisplayTest() {
        new StatisticsDisplay(weatherData);
        weatherData.notifyObservers();
    }

    @Test
    public void removeObserverTest() {
        CurrentConditionDisplay observer = new CurrentConditionDisplay(weatherData);
        weatherData.notifyObservers();
        weatherData.removeObserver(observer);
        weatherData.notifyObservers();
    }

}
