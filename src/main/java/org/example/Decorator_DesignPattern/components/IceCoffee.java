package org.example.Decorator_DesignPattern.components;

public class IceCoffee extends Coffee{
    public IceCoffee() {
        super("Ice Coffee");
    }

    @Override
    public double cout() {
        return 8;
    }
}
