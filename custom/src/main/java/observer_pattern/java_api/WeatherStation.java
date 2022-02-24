package observer_pattern.java_api;

/**
 * Created by davicres on 27/10/2016.
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        new CurrentConditionDisplay(weatherData);
        new CustomForecastDisplay(weatherData);
        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
    }
}
