package ObserverPattern.subject;

import ObserverPattern.observer.Observer;

/**
 * Created by davicres on 24/07/2016.
 */
public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
