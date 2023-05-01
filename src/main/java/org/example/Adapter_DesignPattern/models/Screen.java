package org.example.Adapter_DesignPattern.models;

import org.example.Adapter_DesignPattern.Vga;

public class Screen implements Vga {
    @Override
    public void print(String message) {
        System.out.println("SCREEN: "+message);
    }
}
