package pattern.observer.oberserver_normal.Subject;

import src.pattern.observer.oberserver_normal.Observer.Observer;

public interface Subject {

public void registerObserver(Observer observer);
public void removeObserver(Observer observer);
public void notifyObservers();

}
