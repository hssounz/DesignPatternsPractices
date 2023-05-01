package org.example.Adapter_DesignPattern.models;

import org.example.Adapter_DesignPattern.Vga;

public class CentralUnit {

    private Vga vga;

    public void print(String message){
        System.out.println("********************************");
        vga.print(message);
        System.out.println("********************************");
    }

    public void setVga(Vga vga) {
        this.vga = vga;
    }
}
