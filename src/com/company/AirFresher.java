package com.company;

public class AirFresher implements HomeKit {

    @Override
    public void turnon() {
        System.out.println("AirFresher in the living room was turned on");
    }
}
