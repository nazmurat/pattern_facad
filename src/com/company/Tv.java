package com.company;

public class Tv implements HomeKit {

    @Override
    public void turnon() {
        System.out.println("Tv in the living room was turned on");
    }
}
