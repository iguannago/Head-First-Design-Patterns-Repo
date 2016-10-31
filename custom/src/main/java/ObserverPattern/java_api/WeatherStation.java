package ObserverPattern.java_api;

/**
 * Created by davicres on 27/10/2016.
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        weatherData.addObserver(new CurrentConditionDisplay());
        System.out.println("count observers: " + weatherData.countObservers());
        System.out.println("WeatherData.changed: " + weatherData.hasChanged());
        //observers are not notified because weatherData has not changed.
        weatherData.notifyObservers("It is a sunny day");
        weatherData.setChanged();
        System.out.println("WeatherData.changed: " + weatherData.hasChanged());
        //observers are notified because weatherData has changed.
        weatherData.notifyObservers("It is a sunny day");
    }
}
