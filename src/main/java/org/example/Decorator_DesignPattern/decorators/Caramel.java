package org.example.Decorator_DesignPattern.decorators;

import org.example.Decorator_DesignPattern.CoffeeDecorator;
import org.example.Decorator_DesignPattern.components.Coffee;

public class Caramel extends CoffeeDecorator {

    public Caramel(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double cout() {
        return 2.5 +coffee.cout();
    }
    @Override
    public String getDescription() {
        return super.getDescription() + "++Caramel";
    }
}
