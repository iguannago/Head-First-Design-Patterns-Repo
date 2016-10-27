package ObserverPattern.observer;

/**
 * Created by davicres on 24/07/2016.
 */
public interface Observer {
    void update(float temp, float humidity, float pressure);
}
