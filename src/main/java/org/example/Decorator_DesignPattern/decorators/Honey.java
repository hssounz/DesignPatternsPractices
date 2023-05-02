package org.example.Decorator_DesignPattern.decorators;

import org.example.Decorator_DesignPattern.CoffeeDecorator;
import org.example.Decorator_DesignPattern.components.Coffee;

public class Honey extends CoffeeDecorator {
    public Honey(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double cout() {
        return 4.5 + coffee.cout();
    }
    @Override
    public String getDescription() {
        return super.getDescription() + "++Honey";
    }
}
