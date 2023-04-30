package org.example.Strategy_DesignPattern.hit;

public class HitPunch implements IHit{
    @Override
    public void hitting() {
        System.out.println("hit with a punch");
    }
}
