package org.example.Decorator_DesignPattern.decorators;

import org.example.Decorator_DesignPattern.CoffeeDecorator;
import org.example.Decorator_DesignPattern.components.Coffee;

public class Cream extends CoffeeDecorator {
    public Cream(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double cout() {
        return 3.5 + coffee.cout();
    }
    @Override
    public String getDescription() {
        return super.getDescription() + "++Cream";
    }
}
