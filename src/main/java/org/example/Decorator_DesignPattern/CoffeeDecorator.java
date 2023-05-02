package org.example.Decorator_DesignPattern;

import org.example.Decorator_DesignPattern.components.Coffee;

public abstract class CoffeeDecorator extends Coffee {
    protected Coffee coffee;
    public CoffeeDecorator(Coffee coffee) {
        super(coffee.getDescription() + " Extra");
        this.coffee = coffee;
    }

}
