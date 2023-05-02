package org.example.Decorator_DesignPattern.components;

public class Cappuccino extends Coffee{
    public Cappuccino() {
        super("Cappuccino");
    }

    @Override
    public double cout() {
        return 6.4;
    }
}
