package org.example.Observer_DesignPattern.observers;

import org.example.Observer_DesignPattern.Observable;
import org.example.Observer_DesignPattern.ObservableImpl;

public class ObserverImpl2 implements Observer {
    private int counter = 0;
    @Override
    public void update(Observable observable) {
        int state = ((ObservableImpl) observable).getState();
        if (state % 2 ==0) ++counter;
        System.out.println(
                "+++" +
                        this.getClass().getSimpleName()+"+++ Result => " +
                        (state%2==0? "Even" : "Odd") +
                        "Number of times Even: " +
                                counter
        );
    }
}
