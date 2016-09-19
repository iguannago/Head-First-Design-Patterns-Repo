package ObserverPattern;

import ObserverPattern.observer.*;
import ObserverPattern.subject.WeatherData;
import org.junit.Test;

/**
 * Created by davicres on 19/09/2016.
 */
public class ObserverPatternTest {

    private final WeatherData weatherData = new WeatherData();
    private Observer observer;

    @Test
    public void currentConditionDisplayTest() {
        observer = new CurrentConditionDisplay(weatherData);
        weatherData.notifyObservers();
    }

    @Test
    public void forecastDisplayTest() {
        observer = new ForecastDisplay(weatherData);
        weatherData.notifyObservers();
    }

    @Test
    public void heatIndexDisplayTest() {
        observer = new HeatIndexDisplay(weatherData);
        weatherData.notifyObservers();
    }

    @Test
    public void statisticsDisplayTest() {
        observer = new StatisticsDisplay(weatherData);
        weatherData.notifyObservers();
    }

}
