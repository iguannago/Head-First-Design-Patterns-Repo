package ObserverPattern.custom_design.subject;

import ObserverPattern.custom_design.observer.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by davicres on 24/07/2016.
 */
public class WeatherData implements Subject {
    List<Observer> observers = new ArrayList<>();
    private float temp;
    private float humidity;
    private float pressure;

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temp, humidity, pressure);
        }
    }

    public void measurementChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementChanged();
    }
}
