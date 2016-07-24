package ObserverPattern.subject;

import ObserverPattern.observer.Observer;

/**
 * Created by davicres on 24/07/2016.
 */
public interface Subject {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers();
}
