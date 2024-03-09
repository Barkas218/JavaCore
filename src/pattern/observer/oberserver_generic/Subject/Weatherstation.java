package pattern.observer.oberserver_generic.Subject;

import src.pattern.observer.oberserver_generic.Observer.Observer;

public interface Weatherstation <T extends Observer> {

    public boolean  register(T t);
    public boolean remove(T t);

    public void notifyObserver();

}
