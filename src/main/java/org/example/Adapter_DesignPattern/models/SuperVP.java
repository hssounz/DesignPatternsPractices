package org.example.Adapter_DesignPattern.models;

import org.example.Adapter_DesignPattern.Hdmi;
import org.example.Adapter_DesignPattern.Vga;

public class SuperVP implements Vga, Hdmi {
    @Override
    public void view(byte[] data) {
        System.out.println("HDMI--------SuperVP");
        String message = new String(data);
        System.out.println(message);
        System.out.println("HDMI--------SuperVP");
    }

    @Override
    public void print(String message) {
        System.out.println("VGA--------SuperVP");
        System.out.println(message);
        System.out.println("VGA--------SuperVP");
    }
}
