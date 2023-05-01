package org.example.Adapter_DesignPattern.adapter;

import org.example.Adapter_DesignPattern.Hdmi;
import org.example.Adapter_DesignPattern.Vga;
import org.example.Adapter_DesignPattern.models.TV;

public class HdmiVgaAdapter implements Vga {
    private Hdmi Hdmi;

    @Override
    public void print(String message) {
        System.out.println("---Adapter----");
        byte[] data = message.getBytes();
         Hdmi.view(data);
        System.out.println("---/ Adapter----");
    }

    public void setHdmi(Hdmi hdmi) {
        Hdmi = hdmi;
    }
}
