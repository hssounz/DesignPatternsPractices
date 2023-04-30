package org.example.Observer_DesignPattern;

import org.example.Observer_DesignPattern.observers.Observer;

import java.util.ArrayList;
import java.util.List;

public class ObservableImpl implements Observable{
    private int state = 10;
    private List<Observer> observers = new ArrayList<>();
    @Override
    public void subscribe(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer -> observer.update(this));
    }

    public void setState(int state) {
        this.state = state;
        this.notifyObservers();
    }
    public int getState() {
        return state;
    }
}
