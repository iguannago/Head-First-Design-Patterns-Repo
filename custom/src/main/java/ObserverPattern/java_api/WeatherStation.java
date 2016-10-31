package ObserverPattern.java_api;

/**
 * Created by davicres on 27/10/2016.
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        new CurrentConditionDisplay(weatherData);
        System.out.println("count observers: " + weatherData.countObservers());
        //observers are not notified because weatherData has not changed.
        weatherData.notifyObservers();
        //observers are notified because weatherData has changed.
        weatherData.setMeasurements(180, 65, 30.4f);
    }
}
