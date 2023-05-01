package org.example.Adapter_DesignPattern.models;

import org.example.Adapter_DesignPattern.Vga;

public class VideoProjector implements Vga {
    @Override
    public void print(String message) {
        System.out.println("Video Projector: "+message);
    }
}
