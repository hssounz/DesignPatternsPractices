package org.example.Observer_DesignPattern;

import org.example.Observer_DesignPattern.observers.Observer;

public interface Observable {
    void subscribe(Observer observer);
    void unsubscribe(Observer observer);
    void notifyObservers();
}
