package org.example.Adapter_DesignPattern.models;

import org.example.Adapter_DesignPattern.Hdmi;

public class TV implements Hdmi {
    @Override
    public void view(byte[] data) {
        System.out.println("====TV====");
        String message = new String(data);
        System.out.println(message);
        System.out.println("====TV====");
    }
}
