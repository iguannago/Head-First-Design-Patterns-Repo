package observer_pattern.custom_design.subject;

import observer_pattern.custom_design.observer.Observer;

/**
 * Created by davicres on 24/07/2016.
 */
public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
