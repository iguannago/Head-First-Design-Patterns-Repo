package ObserverPattern.java_api;

import ObserverPattern.DisplayElement;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by davicres on 30/12/2016.
 */
public class CustomForecastDisplay implements Observer, DisplayElement {
    private float temp;

    public CustomForecastDisplay(Observable observable) {
        observable.addObserver(this);
    }

    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            temp = weatherData.getTemp();
            display();
        }
    }

    public float getTemp() {
        return temp;
    }

    public void display() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "CustomForecastDisplay{" +
                "temp=" + temp +
                '}';
    }
}
