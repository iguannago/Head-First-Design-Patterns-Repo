package ObserverPattern.java_api;

/**
 * Created by davicres on 27/10/2016.
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        weatherData.addObserver(new CurrentConditionDisplay());
        System.out.println("count observers: " + weatherData.countObservers());
        weatherData.setChanged();
        weatherData.notifyObservers("It is a sunny day");
    }
}
