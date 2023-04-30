package org.example.Observer_DesignPattern;

import org.example.Observer_DesignPattern.observers.Observer;
import org.example.Observer_DesignPattern.observers.ObserverImpl1;
import org.example.Observer_DesignPattern.observers.ObserverImpl2;

public class Main {
    public static void main(String[] args) {
        ObservableImpl observable = new ObservableImpl();

        // First way to implement observers: Implement Observers.
        Observer observer1 = new ObserverImpl1();
        Observer observer2 = new ObserverImpl2();
        observable.subscribe(observer1);
        observable.subscribe(observer2);

        //Second way: Anonymous Class
        observable.subscribe(new Observer() {
            @Override
            public void update(Observable observable) {
                System.out.println(
                        ((ObservableImpl) observable)
                                .getState()
                );
            }
        });

        //Third way: Lambda Expression
        observable.subscribe(
                observable1 -> System.out.println(
                        ((ObservableImpl) observable1).getState()*2
                ));

        observable.setState(60);
        observable.setState(70);
    }
}
