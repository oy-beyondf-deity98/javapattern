package pattern.statemanager.observer;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created with IntelliJ IDEA.
 * User: kimgyupyo
 * Date: 2014. 4. 11.
 * Time: 오전 1:07
 * To change this template use File | Settings | File Templates.
 */
public abstract class NumberGenerator {
    private ArrayList observers = new ArrayList();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {

        Iterator it = observers.iterator();
        while (it.hasNext()) {
            Observer observer = (Observer) it.next();
            observer.update(this);
        }
    }

    public abstract int getNumber();

    public abstract void execute();
}
