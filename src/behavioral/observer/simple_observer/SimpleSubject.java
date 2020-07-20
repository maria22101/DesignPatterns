package behavioral.observer.simple_observer;

import java.util.ArrayList;

public class SimpleSubject implements Subject {
    private ArrayList<Observer> observers;
    private int value = 0;

    public SimpleSubject() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if(i > 0) {
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        observers.stream()
                .forEach(o -> o.update(value));
    }

    public void setValue(int value) {
        this.value = value;
        notifyObservers();
    }

    public ArrayList<Observer> getObservers() {
        return observers;
    }
}
