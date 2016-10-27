package ObserverPattern.observer;

import ObserverPattern.DisplayElement;
import ObserverPattern.subject.WeatherData;

/**
 * Created by davicres on 24/07/2016.
 */
public class CurrentConditionDisplay implements Observer, DisplayElement {
    private float temp;
    private float humidity;


    public CurrentConditionDisplay(WeatherData weatherData) {
        weatherData.registerObserver(this);
    }

    public void display() {
        System.out.println("Current conditions: " + temp
                + "F degrees and " + humidity + "% humidity");
    }

    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        display();
    }

}
