package org.example.Strategy_DesignPattern;

import org.example.Strategy_DesignPattern.hit.IHit;

public class Perso {
    private IHit hittingStrategy;

    public void setHittingStrategy(IHit hittingStrategy){
        this.hittingStrategy = hittingStrategy;
    }

    public void giveHit() {
        System.out.print("=====>  ");
        hittingStrategy.hitting();
    }

}
