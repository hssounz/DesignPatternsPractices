package org.example.Decorator_DesignPattern.components;

public abstract class Coffee {
    public Coffee(String description) {
        this.description = description;
    }
    private String description;
    public String getDescription() {
        return description;
    }

    public abstract double cout();
}
