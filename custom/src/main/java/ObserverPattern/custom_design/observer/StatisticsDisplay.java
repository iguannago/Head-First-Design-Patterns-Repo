package ObserverPattern.custom_design.observer;

import ObserverPattern.custom_design.DisplayElement;
import ObserverPattern.custom_design.subject.WeatherData;

/**
 * Created by davicres on 24/07/2016.
 */
public class StatisticsDisplay implements Observer, DisplayElement {
    private float minTemp = 200;
    private float maxTemp = 0.0f;
    private float tempSum = 0.0f;
    private int numReadings;

    public StatisticsDisplay(WeatherData weatherData) {
        weatherData.registerObserver(this);
    }

    public void display() {
        System.out.print("Statistics: ");
        System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings)
                + "/" + maxTemp + "/" + minTemp);
    }

    public void update(float temp, float humidity, float pressure) {
        tempSum += temp;
        numReadings++;
        if (temp > maxTemp)
            maxTemp = temp;
        if (temp < minTemp)
            minTemp = temp;
        display();
    }


}
