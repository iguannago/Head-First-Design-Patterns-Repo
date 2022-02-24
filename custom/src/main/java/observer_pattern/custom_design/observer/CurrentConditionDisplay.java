package observer_pattern.custom_design.observer;

import observer_pattern.DisplayElement;
import observer_pattern.custom_design.subject.WeatherData;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by davicres on 24/07/2016.
 */
public class CurrentConditionDisplay implements Observer, DisplayElement {
    private float temp;
    private float humidity;

    public static final Logger logger = Logger.getLogger(CurrentConditionDisplay.class.getName());

    public CurrentConditionDisplay(WeatherData weatherData) {
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        logger.log(Level.INFO, () -> "Current conditions: " + temp + "F degrees and" + humidity + " % humidity");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        display();
    }

}
