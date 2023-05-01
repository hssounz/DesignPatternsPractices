package org.example.Builder_DesignPattern.model;

public class Customer implements Cloneable{
    private Long id;
    private String name;

    public Customer() {
    }

    public Customer(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    protected Customer clone() throws CloneNotSupportedException {
        return (Customer)super.clone();
    }
}
