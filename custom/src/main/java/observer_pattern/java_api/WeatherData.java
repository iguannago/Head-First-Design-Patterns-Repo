package observer_pattern.java_api;

import java.util.Observable;

/**
 * Created by davicres on 27/10/2016.
 */
public class WeatherData extends Observable {
    private float temp;
    private float humidity;

    public void measurementChanged() {
        super.setChanged();
        //we are using the PULL model rather than the PUSH one.
        super.notifyObservers();
    }

    public void setMeasurements(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        measurementChanged();
    }

    public float getTemp() {
        return temp;
    }

    public float getHumidity() {
        return humidity;
    }


    @Override
    public String toString() {
        return "WeatherData{" +
                "temp=" + temp +
                ", humidity=" + humidity +
                '}';
    }
}
