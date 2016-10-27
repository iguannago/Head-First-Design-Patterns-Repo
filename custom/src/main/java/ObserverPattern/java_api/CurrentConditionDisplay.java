package ObserverPattern.java_api;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by davicres on 27/10/2016.
 */
public class CurrentConditionDisplay implements Observer {
    public void update(Observable o, Object arg) {
        System.out.println(this);
        System.out.println("subject: " + o);
        System.out.println("arg: " + arg);
    }

    @Override
    public String toString() {
        return "CurrentConditionDisplay{}";
    }

}
