package ObserverPattern.java_api;

import java.util.Observable;

/**
 * Created by davicres on 27/10/2016.
 */
public class WeatherData extends Observable {
    private float temp;
    private float humidity;
    private float pressure;

    public void measurementChanged() {
        super.setChanged();
        //we are using the PULL model rather than the PUSH one.
        notifyObservers();
    }

    public void setMeasurements(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementChanged();
    }

    public float getTemp() {
        return temp;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    @Override
    public String toString() {
        return "WeatherData{" +
                "temp=" + temp +
                ", humidity=" + humidity +
                ", pressure=" + pressure +
                '}';
    }
}
