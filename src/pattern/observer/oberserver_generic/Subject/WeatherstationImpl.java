package pattern.observer.oberserver_generic.Subject;

import src.pattern.observer.oberserver_generic.Observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherstationImpl<T extends Observer> implements Weatherstation{

    private List<T> list;

    public WeatherstationImpl(){
        list = new ArrayList<T>();
    }

    @Override
    public boolean register(Observer observer) {

        list.add((T)observer);

        return false;
    }

    @Override
    public boolean remove(Observer observer) {
        T o = (T)observer;
        if(list.contains(o)){
            list.remove(o);
            return true;
        }
        return false;
    }

    @Override
    public void notifyObserver() {



    }
}
