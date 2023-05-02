package org.example.Decorator_DesignPattern.components;

public class Espresso extends Coffee{
    public Espresso() {
        super("Espresso");
    }

    @Override
    public double cout() {
        return 5;
    }
}
