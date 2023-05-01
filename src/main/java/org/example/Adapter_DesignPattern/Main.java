package org.example.Adapter_DesignPattern;

import org.example.Adapter_DesignPattern.adapter.HdmiVgaAdapter;
import org.example.Adapter_DesignPattern.models.*;

public class Main {

    public static void main(String[] args) {
        CentralUnit centralUnit = new CentralUnit();
        centralUnit.setVga(new Screen());
        centralUnit.print("Hello world !");
        centralUnit.setVga(new VideoProjector());
        centralUnit.print("Hello world !");

        HdmiVgaAdapter hdmiVgaAdapter = new HdmiVgaAdapter();
        hdmiVgaAdapter.setHdmi(new TV());
        centralUnit.setVga(hdmiVgaAdapter);
        centralUnit.print("Hello World !");

        centralUnit.setVga(new SuperVP());
        centralUnit.print("Hello World !");

        hdmiVgaAdapter.setHdmi(new SuperVP());
        centralUnit.setVga(hdmiVgaAdapter);
        centralUnit.print("Hello World !");
    }
}
