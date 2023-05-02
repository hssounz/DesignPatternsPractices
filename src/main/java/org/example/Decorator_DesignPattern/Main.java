package org.example.Decorator_DesignPattern;

import org.example.Decorator_DesignPattern.components.Coffee;
import org.example.Decorator_DesignPattern.components.Espresso;
import org.example.Decorator_DesignPattern.decorators.Chocolate;
import org.example.Decorator_DesignPattern.decorators.Honey;

public class Main {
    public static void main(String[] args) {
        Coffee coffee = new Espresso();
        System.out.println(coffee.cout());
        coffee = new Chocolate(coffee);
        System.out.println(coffee.cout());
        coffee = new Chocolate(coffee);
        System.out.println(coffee.cout());
        coffee = new Honey(coffee);
        System.out.println(coffee.cout());
        System.out.println(coffee.getDescription());
    }
}
