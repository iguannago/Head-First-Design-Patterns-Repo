package ObserverPattern.java_api;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by davicres on 30/12/2016.
 */
public class CustomForecastDisplay implements Observer {
    public CustomForecastDisplay(Observable observable) {
        observable.addObserver(this);
    }

    public void update(Observable o, Object arg) {

    }
}
