package org.example.Observer_DesignPattern.observers;

import org.example.Observer_DesignPattern.Observable;
import org.example.Observer_DesignPattern.ObservableImpl;

public class ObserverImpl1 implements Observer {
    @Override
    public void update(Observable observable) {
        int state = ((ObservableImpl) observable).getState();
        System.out.println("+++"+this.getClass().getSimpleName()+"+++ Result => "+state*1.5);
    }
}
