package ObserverPattern.observer;

import ObserverPattern.DisplayElement;
import ObserverPattern.subject.WeatherData;

/**
 * Created by davicres on 24/07/2016.
 */
public class ForecastDisplay implements Observer, DisplayElement {
    private float currentPressure = 29.92f;
    private float lastPressure;

    public ForecastDisplay(WeatherData weatherData) {
        weatherData.registerObserver(this);
    }

    public void display() {
        System.out.print("Forecast: ");
        if (currentPressure > lastPressure)
            System.out.println("Improving weather on the way");
        else if (currentPressure == lastPressure)
            System.out.println("More of the same");
        else if (currentPressure < lastPressure)
            System.out.println("Watch out for cooler, rainy weather");
    }

    public void update(float temp, float humidity, float pressure) {
        lastPressure = currentPressure;
        currentPressure = pressure;
        display();
    }
}
