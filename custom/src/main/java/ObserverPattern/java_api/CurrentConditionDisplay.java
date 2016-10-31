package ObserverPattern.java_api;

import ObserverPattern.custom_design.DisplayElement;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by davicres on 27/10/2016.
 */
public class CurrentConditionDisplay implements Observer, DisplayElement {

    private float temp;
    private float humidity;

    public CurrentConditionDisplay(Observable observable) {
        observable.addObserver(this);
    }

    /*
    the observer is using the PULL model rather than the PUSH one. Because it is getting new changed values from
    the observable object.
     */
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            temp = weatherData.getTemp();
            humidity = weatherData.getHumidity();
            display();
        }
    }

    public void display() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "CurrentConditionDisplay{" +
                "temp=" + temp +
                ", humidity=" + humidity +
                '}';
    }
}
